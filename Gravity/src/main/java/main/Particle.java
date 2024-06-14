package main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import VMath.VMath;
import gfxmain.GFXException;
import gfxmain.GFXFramework;
import gfxmain.VisSpect;
import threeD.Cone3D;
import threeD.CoordSys;
import threeD.Drawable3D;
import threeD.ScreenPoint;

public class Particle implements Drawable3D {

	protected double[] position;
	protected final double[] velocity;
	protected double[] accVec;
	private double distanceToView;
	private float mass;
	private int trackSpacer = 0;
	private static final int TRACK_SPACING = 25;
	private Color color;
	private float timeFactor = 1;
	private String name;
	private int TRAIL_SIZE = 30;
	private List<double[][]> trailList = new ArrayList<double[][]>(TRAIL_SIZE);

	public Particle(double x, double y, double z) {
		position = new double[] { x, y, z };
		velocity = new double[] { 0, 0, 0 };
		accVec = new double[] { 0, 0, 0 };
		mass = 500000;
		color = Color.white;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPosition(double[] position) {
		this.position = position;
	}

	public double[] getPosition() {
		return position;
	}

	public void setVelocity(double[] velocity) {
		this.velocity[0] = velocity[0];
		this.velocity[1] = velocity[1];
		this.velocity[2] = velocity[2];
	}

	public double[] getVelocity() {
		return velocity;
	}

	public void setMass(float mass) {
		this.mass = mass;
	}

	public float getMass() {
		return mass;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	@Override
	public void draw(GFXFramework gfx, CoordSys cs) {
		Graphics2D g2 = gfx.getG2();

		// draw the 3D arrow head
		CoordSys sys = new CoordSys(position[0], position[1], position[2]);

		double[] zUnit = VMath.normalize(VMath.vecMultByScalar(velocity, 1));
		double[] yUnit = VMath.normalize(VMath.vecAdd(zUnit, new double[] { .5f, .5f, .5f }));
		double[] xUnit = VMath.normalize(VMath.crossprd(yUnit, zUnit));
		yUnit = VMath.crossprd(zUnit, xUnit);

		sys.setXAxis(new double[] { xUnit[0], xUnit[1], xUnit[2], 0 });
		sys.setYAxis(new double[] { yUnit[0], yUnit[1], yUnit[2], 0 });
		sys.setZAxis(new double[] { zUnit[0], zUnit[1], zUnit[2], 0 });
		// System.out.println(">>>"+VMath.mag(VMath.crossprd(xUnit, yUnit))+"
		// "+VMath.mag(VMath.crossprd(yUnit, zUnit))+" "+VMath.mag(VMath.crossprd(zUnit,
		// xUnit)));

		Cone3D arrowHead = null;
		try {
			arrowHead = new Cone3D(sys, 2f, 5, color);
			arrowHead.setDrawFaceOutlines(false);
			double[] posVec = { position[0], position[1], position[2] };
			double[] vec = VMath.vecSubtract(posVec, cs.getPositionVec());
			arrowHead.setDrawFaceOutlines(VMath.mag(vec) <= 500);
			arrowHead.draw(gfx, cs);
			// sys.draw(gfx, cs);
			drawTrack(gfx, cs, g2);
		} catch (GFXException e) {
			System.out.println(e.getMessage());
		}
		// }
	}

	private void drawTrack(GFXFramework gfx, CoordSys cs, Graphics2D g2) {
		if (Math.floorMod(++trackSpacer, TRACK_SPACING) == 0) {
			trailList.add(new double[][] { position, velocity });
			if (trailList.size() > TRAIL_SIZE) {
				trailList.remove(0);
			}
			trackSpacer = 0;
		}

		for (double[][] p : trailList) {
			ScreenPoint pt = cs.getScrnCoords(p[0], gfx.getSize());
			Color c = VisSpect.getSpectralColor(VisSpect.mapValueRangeIntoWavelengths(VMath.mag(p[1]) * 1e6, 0, 150));
			g2.setColor(c);
			g2.drawLine(pt.x, pt.y, pt.x, pt.y);
		}
	}

	/**
	 * @param timeFactor the timeFactor to set
	 */
	public void setTimeFactor(float timeFactor) {
		this.timeFactor = timeFactor;
	}

	/**
	 * @return the timeFactor
	 */
	public float getTimeFactor() {
		return timeFactor;
	}

	public double[] getAccVec() {
		return accVec;
	}

	public void setAccVec(double[] accVec) {
		this.accVec = accVec;
	}

	public double getDistanceToView() {
		return distanceToView;
	}

	public void setDistanceToView(double distanceToView) {
		this.distanceToView = distanceToView;
	}

}
