package threeD;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import VMath.VMath;
import gfxmain.GFXException;

public class DisplayVector3D extends Abstract3DModelObject {
	
	public DisplayVector3D(CoordSys cs, Color color, int width, double[] vector) throws GFXException {
		super(cs, color);	
		this.drawFaceOutlines = false;
		

		double[] zUnit = VMath.normalize(vector);
		double[] yUnit = VMath.normalize(VMath.vecAdd(zUnit, new double[] { .5f, .5f, .5f }));
		double[] xUnit = VMath.normalize(VMath.crossprd(yUnit, zUnit));
		yUnit = VMath.crossprd(zUnit, xUnit);

		this.sSys.setXAxis(new double[] { xUnit[0], xUnit[1], xUnit[2], 0 });
		this.sSys.setYAxis(new double[] { yUnit[0], yUnit[1], yUnit[2], 0 });
		this.sSys.setZAxis(new double[] { zUnit[0], zUnit[1], zUnit[2], 0 });
		
		Cone3D arrowHead = null;
		try {
			CoordSys arrowCs = (CoordSys) cs.clone();
			arrowCs.setPositionAsVec(VMath.vecAdd(arrowCs.getPositionVec(), vector));
			arrowHead = new Cone3D(arrowCs, 3*width, 3*width, Color.red);
			arrowHead.setDrawFaceOutlines(false);
			double[] posVec = { vector[0], vector[1], vector[2] };
			double[] vec = VMath.vecSubtract(posVec, arrowCs.getPositionVec());
			arrowHead.setDrawFaceOutlines(VMath.mag(vec) <= 500);
			faceList.addAll(arrowHead.faceList);
		} catch (GFXException e) {
			System.out.println(e.getMessage());
		}
		
		List<double[]> pointList = new ArrayList<double[]>();
		
//		pointList.add(VMath.vecMultByScalar(xUnit, width));
//		pointList.add(VMath.vecMultByScalar(yUnit, width));
//		pointList.add(VMath.vecMultByScalar(xUnit, -width));
//		pointList.add(VMath.vecMultByScalar(yUnit, -width));
//		Facet face = new Facet(pointList, this);
//		faceList.add(face);
		
		pointList = new ArrayList<double[]>();
		pointList.add(VMath.vecMultByScalar(xUnit, width));
		pointList.add(VMath.vecMultByScalar(yUnit, width));
		pointList.add(VMath.vecAdd(VMath.vecMultByScalar(yUnit, width), vector));
		pointList.add(VMath.vecAdd(VMath.vecMultByScalar(xUnit, width), vector));
		
		Facet face = new Facet(pointList, this);
		faceList.add(face);		
		
		pointList = new ArrayList<double[]>();
		pointList.add(VMath.vecMultByScalar(xUnit, width));
		pointList.add(VMath.vecMultByScalar(yUnit, -width));
		pointList.add(VMath.vecAdd(VMath.vecMultByScalar(yUnit, -width), vector));
		pointList.add(VMath.vecAdd(VMath.vecMultByScalar(xUnit, width), vector));
		
		face = new Facet(pointList, this);
		faceList.add(face);
		
		pointList = new ArrayList<double[]>();
		pointList.add(VMath.vecMultByScalar(xUnit, -width));
		pointList.add(VMath.vecMultByScalar(yUnit, -width));
		pointList.add(VMath.vecAdd(VMath.vecMultByScalar(yUnit, -width), vector));
		pointList.add(VMath.vecAdd(VMath.vecMultByScalar(xUnit, -width), vector));
		
		face = new Facet(pointList, this);
		faceList.add(face);
		
		pointList = new ArrayList<double[]>();
		pointList.add(VMath.vecMultByScalar(xUnit, -width));
		pointList.add(VMath.vecMultByScalar(yUnit, width));
		pointList.add(VMath.vecAdd(VMath.vecMultByScalar(yUnit, width), vector));
		pointList.add(VMath.vecAdd(VMath.vecMultByScalar(xUnit, -width), vector));
		
		face = new Facet(pointList, this);
		faceList.add(face);
		

	}
	
}
