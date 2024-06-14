package main;

import java.util.ArrayList;
import java.util.List;

import Foundation.Utils;
import VMath.VMath;
import orbits.Abstract3DModelObject;
import orbits.Composed3DObject;
import orbits.Facet;
import orbits.IDetailer;

public class Tetrahedron extends Abstract3DModelObject implements Shadeable, Composed3DObject<Facet> {
	
	protected List<Facet> faceList = new ArrayList<Facet>(3);
	private double size;
	public static double[][] vertices;
	
	static {
	 vertices =  new double[][]{			
			{-Math.sqrt(2d/9d), Math.sqrt(2d/3d), -1d/3d},
			{Math.sqrt(2d/9d), -Math.sqrt(2d/3d), -1d/3d},
			{0d,0d,1d},
			{Math.sqrt(8d/9d), 0d, -1d/3d},
	};
	}
	
	private double[][] scaledVertices; 	
		
	
	public Tetrahedron(double size) {
		this.size = size;
		scaledVertices = build(this, size);
//		 new Thread() {
//			public void run() {
//				while(true) {
//					try {
//						sleep(200);
//					} catch (InterruptedException e) {}
//					 for(int i = 0;i<scaledVertices.length;i++) {
//				        	scaledVertices[i] = getCoordSys().transformVec(scaledVertices[i]);
//				        }
//				}
//			}
//		}.start();
	}

	@Override
	public void draw(AbstractView<? extends Abstract3DModelObject> view) {
        List<double[]> vertList = new ArrayList<double[]>(3);
        for(int i = 0;i<scaledVertices.length;i++) {
        	scaledVertices[i] = sSys.transformVec(scaledVertices[i]);
        }
				
        vertList.add(new double[] {scaledVertices[0][0], scaledVertices[0][1], scaledVertices[0][2]});
		vertList.add(new double[] {scaledVertices[1][0], scaledVertices[1][1], scaledVertices[1][2]});
		vertList.add(new double[] {scaledVertices[2][0], scaledVertices[2][1], scaledVertices[2][2]});
		Facet f = new Facet(vertList, this, true, "t1" , null);
		f.setColor(this.color);
		f.draw(view);
		
		vertList.clear();
		vertList.add(new double[] {scaledVertices[0][0], scaledVertices[0][1], scaledVertices[0][2]});
		vertList.add(new double[] {scaledVertices[2][0], scaledVertices[2][1], scaledVertices[2][2]});
		vertList.add(new double[] {scaledVertices[3][0], scaledVertices[3][1], scaledVertices[3][2]});
		f = new Facet(vertList, this, true, "t2" , null);
		f.setColor(this.color);
		f.draw(view);
		
		vertList.clear();
		vertList.add(new double[] {scaledVertices[0][0], scaledVertices[0][1], scaledVertices[0][2]});
		vertList.add(new double[] {scaledVertices[3][0], scaledVertices[3][1], scaledVertices[3][2]});
		vertList.add(new double[] {scaledVertices[1][0], scaledVertices[1][1], scaledVertices[1][2]});
		f = new Facet(vertList, this, true, "t3" , null);	
		f.setColor(this.color);
		f.draw(view);
	}

	

	@Override
	public IDetailer<Facet> getDetailer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IDrawingVisitor<?> getShadingVisitor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setShadingVisitor(IDrawingVisitor<?> v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ColorModel getColorModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Facet> getFaceList() {
		// TODO Auto-generated method stub
		return faceList;
	}
	
	static double[][] build(Tetrahedron object, double size) {			
		double[][] scaledVertices = new double[4][3];
		for(int i = 0; i < vertices.length; i++) {
			scaledVertices[i] = VMath.vecMultByScalar(vertices[i], size);
		}
		
		return scaledVertices;
	}

}
