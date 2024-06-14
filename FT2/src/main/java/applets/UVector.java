package applets;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.io.Serializable;


public class UVector implements Cloneable, Serializable{
	double x;
    double y;
	double z;
	double w;
	private Color color;

	public UVector(double xx, double yy, double zz, double ww, Color c) {
		x=xx;
		y=yy;
		z=zz;
		w=ww;
		color=c;
	}
	
	public UVector() {
		this(0,0,0,0,Color.black);
	}
	
	public UVector(double xx, double yy, double zz, double ww) {
		this(xx,yy,zz,ww,Color.BLACK);
		
	}
	
	public UVector(double[] aVec){
		this(aVec[0],aVec[1],aVec[2],aVec[3]);
	}
	
	public double dotprd(double[] aVec){
		return dotprd(aVec[0],aVec[1],aVec[2]);
	}
	public double dotprd(double xx, double yy, double zz) {
		return xx*x+yy*y+zz*z; 
	}
	
	public double X(){
		return x;
	}
	public void setX(double aValue){
		x=aValue;
		return;
	}
	public double Y(){
		return y;
	}
	public void setY(double aValue){
		y=aValue;
		return;
	}
	public double Z(){
		return z;
	}
	public void setZ(double aValue){
		z=aValue;
		return;
	}
	public double[] getVectorForm(){
		double[] aVec=new double[]{x,y,z};
		return aVec;
	}
	public void setAsVector(double[] aVector){
		x=aVector[0];
		y=aVector[1];
		z=aVector[2];
		//w=aVector[3];
		return;
	}
	public boolean equals(Object o){
		UVector aUVec = (UVector)o;
		return (aUVec.x==x && aUVec.y==y && aUVec.z==z && aUVec.w==w);
	}
    public Object clone(){
        UVector o=null;
        try {
            o=(UVector)super.clone();
            //return o;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }
    
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void draw(double[] posVec, CoordSys refSys, Dimension d, Graphics2D g2){
        
		ScreenPoint anOriginVec=refSys.getScrnCoords(posVec,d.width,d.height);    
        double[] anExtendVec = VMath.vecAdd(posVec, VMath.vecMultByScalar(getVectorForm(),50000));
        if(anExtendVec!=null) 
        {
        	ScreenPoint aResultVec = refSys.getScrnCoords(anExtendVec,d.width,d.height);
	        if(aResultVec.isInView() && anOriginVec.isInView()) 
	        {
			    g2.setColor(color);
			    g2.drawLine(anOriginVec.x,anOriginVec.y,aResultVec.x,aResultVec.y);
	        }
        }
	}
}