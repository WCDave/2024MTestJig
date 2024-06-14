package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.swing.JFrame;

import VMath.VMath;
import enums.DirectionTypes;
import enums.MouseStates;
import gfxmain.GFXException;
import gfxmain.GFXFramework;
import gfxmain.VisSpect;
import main.model.ViewParticleComparator;
import pathFollowing.ArcFollower;
import threeD.CoordSys;
import threeD.DisplayVector3D;
import threeD.Plane3D;
import threeD.SlewKeyNavAdapter;
import threeD.World3DContainer;

public class MainApp extends JFrame {

	/**
	 * @param args
	 */

	private GFXFramework gfx;
	private final static int SCREEN_WIDTH = 1000;
	private final static int SCREEN_HEIGHT = 1000;

	private List<Particle> particleList;
	private List<Particle> renderingList;
	private CoordSys navObject;
	private boolean coloredParticles;
	private SlewKeyNavAdapter keyAdapter;
	private Plane3D refPlane;
	private CoordSys cachedNavObject;
	private ViewingParticle viewingParticle;
	private ArcFollower af;
	private GravityThread modelThread;

	public static void main(String[] args) {
		new MainApp().run();
	}

	public MainApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		this.setBackground(Color.BLACK);
		setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		try {
			gfx = new GFXFramework(this, true);
		} catch (GFXException e) {
			e.printStackTrace();
		}
		gfx.init();
		Properties p = System.getProperties();
		MouseStates ms = MouseStates.valueOf("CLICKED");
		MouseStates[] msArray = MouseStates.values();
//    	for(MouseStates m:msArray) {
//    		System.out.println(m.toString());
//    	}

		navObject = new CoordSys(0, 0, 2000);
		navObject.xRotate(180);
		navObject.addObserver(World3DContainer.getInstance());
		keyAdapter = new SlewKeyNavAdapter(navObject, 20);

		refPlane = new Plane3D(new CoordSys(0, 0, 0), 2000f, new Color(80, 80, 80), 50);
	}

	public void run() {
		generateParticles(800);
		modelThread = new GravityThread(particleList, viewingParticle);
//		navObject.setVelocityAsVec(new double[] { 0, -1e-2, 0, 0 });

		String minMaxChar = "X";
		boolean displayMaxVel = true;
		ViewParticleComparator viewComparator = new ViewParticleComparator();
		viewComparator.setCoordSys(navObject);

		Collections.sort(particleList, viewComparator);
		renderingList = new ArrayList<Particle>(particleList);
//		/*----*/
//		particleList.remove(viewingParticle);
//		/*-----*/
		modelThread.initialize(2);

		modelThread.start();
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMinimumFractionDigits(5);

		new Thread() {
			public void run() {
				while (true) {
					GFXFramework.sleep(2000);
					synchronized (renderingList) {
						for (Particle p : renderingList) {
							double dist = VMath.mag(VMath.vecSubtract(p.getPosition(), navObject.getPositionVec()));
							p.setDistanceToView(dist);
						}
					}
				}
			}
		}.start();

		while (true) {
//			Comparators.verifyTransitivity(viewComparator, renderingList);
			synchronized (renderingList) {
				Collections.sort(renderingList, viewComparator);
			}
			render();

			setTitle("Gravity : " + (gfx.isAnimationOn() ? "Animation On" : "Animation Off") + " / "
					+ (keyAdapter.isTranslationMode() ? "Translation" : "Rotation") + " | "
					+ navObject.getViewDirection() + ", SSE: " + modelThread.getStartingSystemEnergy() + ", SE: "
					+ modelThread.getSystemEnergy() + ", MaxSpd: " + nf.format(modelThread.getMaxParticleSpeed() * 1e6)
					+ ", pe: " + modelThread.getPe() + " , ke: " + modelThread.getKe());

			switch (keyAdapter.handleKey(gfx.getKey())) {
			case KeyEvent.VK_A: {
				gfx.setAnimate(!gfx.isAnimationOn());
				break;
			}
			case KeyEvent.VK_C: {
				coloredParticles = !coloredParticles;
				break;
			}
			case KeyEvent.VK_Q: {
				System.exit(0);
				break;
			}
			case KeyEvent.VK_P: {
				if (cachedNavObject == null) {
					cachedNavObject = navObject;

					navObject = viewingParticle.getCoordSys();

				} else {
					navObject = cachedNavObject;
					cachedNavObject = null;
				}
				viewComparator.setCoordSys(navObject);
				break;
			}
			case KeyEvent.VK_L: {
				DirectionTypes dt = navObject.getViewDirection();

				dt = !gfx.isShiftKeySelected() ? dt.getNext() : dt.getPrevious();
				navObject.setViewDirection(dt);
				break;
			}
			case KeyEvent.VK_M: {
				displayMaxVel = !displayMaxVel;
				minMaxChar = displayMaxVel ? "X" : "N";
				System.out.println(minMaxChar);
			}
			case KeyEvent.VK_1: {
				if (af != null && af.isAlive()) {
					af.setStop(true);
					af = null;
				} else {
					af = new ArcFollower(navObject, modelThread);
					af.start();
				}
				break;
			}
			case KeyEvent.VK_2: {
				Particle blackHole = new Particle(3500, -4000, 0);
				blackHole.setMass(200000000);
				blackHole.setVelocity(new double[] { 0, .0018, 0 });
				blackHole.setColor(Color.white);
				synchronized (particleList) {
					synchronized (renderingList) {
						renderingList.add(blackHole);
					}
					particleList.add(blackHole);
				}
				System.out.println("black hole added " + new Date());
				new Thread() {
					public void run() {
						GFXFramework.sleep(1000000);
						synchronized (particleList) {
							synchronized (renderingList) {
								renderingList.remove(blackHole);
							}
							particleList.remove(blackHole);
						}

						System.out.println("black hole removed " + new Date());
					}
				}.start();
				break;
			}
			case KeyEvent.VK_3: {
				Particle blackHole = new Particle(-3500, 4000, 0);
				blackHole.setMass(200000000);
				blackHole.setVelocity(new double[] { 0, -.0018, 0 });
				blackHole.setColor(Color.white);
				synchronized (particleList) {
					synchronized (renderingList) {
						renderingList.add(blackHole);
					}
					particleList.add(blackHole);
				}
				System.out.println("black hole1 added " + new Date());
				new Thread() {
					public void run() {
						GFXFramework.sleep(1000000);
						synchronized (particleList) {
							synchronized (renderingList) {
								renderingList.remove(blackHole);
							}
							particleList.remove(blackHole);
						}

						System.out.println("black hole1 removed " + new Date());
					}
				}.start();
				break;
			}
			}

			GFXFramework.sleep(5);
			gfx.update();
			synchronized (particleList) {
//				/*--------*/
//				if (modelThread.getIspectablePositionFromModel() != null) {
//					viewingParticle.setPosition(new double[] { modelThread.getIspectablePositionFromModel()[0],
//							modelThread.getIspectablePositionFromModel()[1],
//							modelThread.getIspectablePositionFromModel()[2] });
//				}
//				/*-------*/
				Collections.shuffle(particleList);
			}
		}
	}

	private void render() {
		double[] cg = modelThread.getIspectablePositionFromModel();
		if (gfx.isAnimationOn()) {
			refPlane.draw(gfx, navObject);
			CoordSys amCs = CoordSys.generateCoordSys(modelThread.getAngularMomentum(), cg);
			new Plane3D(amCs, 250, new Color(10, 60, 100), 10).draw(gfx, navObject);
		}

		for (Particle p : renderingList) {
			if (coloredParticles) {
				p.setColor(VisSpect.getSpectralColor(750 - 8000 * VMath.mag(p.getVelocity())));
			} else {
				p.setColor(Color.white);
			}
			p.draw(gfx, navObject);
		}
		if (af != null) {
			af.drawPathCorrection(gfx, null);
		}

//		double[] cg = modelThread.getIspectablePositionFromModel();
		try {
			new DisplayVector3D(new CoordSys(), Color.PINK, 1, cg).draw(gfx, navObject);

			new DisplayVector3D(new CoordSys(cg[0], cg[1], cg[2]), Color.cyan, 1, modelThread.getAngularMomentum())
					.draw(gfx, navObject);
		} catch (GFXException e) {
		}

	}

	private void generateParticles(int numParticles) {
		java.util.List<Particle> tmpList = new ArrayList<Particle>(1000);

		float[][] disp = new float[][] { { 500f, 0f }, VMath.rotate2D(new float[] { 500, 0 }, Math.toDegrees(120)),
				VMath.rotate2D(new float[] { 500, 0 }, Math.toDegrees(240)) };
		for (int i = 0; i < numParticles; i++) {
			float phi = (float) (Math.PI * Math.random() - Math.PI / 4);
			float r = (float) (500 * Math.random());
			float theta = (float) (2 * Math.PI * Math.random());
			int s = (int) (Math.random() * 3.0f);
			Particle p = new Particle((float) (r * Math.cos(theta) * Math.cos(phi)) + disp[s][0],
					(float) (r * Math.sin(theta) * Math.cos(phi)) + disp[s][1], (float) (r * Math.sin(phi)));
			// p.setMass(0);
			// p.setPosition(new float[]{5,0,0});
			// p.setVelocity(new float[]{1,0,0});
			p.setName("" + i);
			if (s == 2) {
				// p.setVelocity(new
				// double[]{(float)Math.random()/1000,(float)-Math.random()/1000,0});
			}
//			if(i==0)
//			{
//				p = new ViewingParticle(p.position, false);
//				p.setVelocity(new double[]{0,0,0});
//				p.setPosition(new double[]{0,0,0});
//				p.setMass(p.getMass()*100f);
//			}
			if (i == 0) {
				p = new ViewingParticle(p.getPosition(), true);
				viewingParticle = (ViewingParticle) p;
//				/*-----*/
//				p.setMass(0);
//				/*-----*/
			}
			tmpList.add(p);

		}
		particleList = Collections.synchronizedList(tmpList);
	}
}
