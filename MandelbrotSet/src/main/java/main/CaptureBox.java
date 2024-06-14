package main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

public class CaptureBox  {

	private Point startPoint;
	private Point endPoint;
	
	public CaptureBox(int x, int y){
		this(new Point(x,y));
	}
	
	public CaptureBox(Point p){
		startPoint = p;
	}
	
	public CaptureBox(Point p1, Point p2){
		startPoint = p1;
		endPoint = p2;
	}

	public void setEndPoint(int x, int y) {
		endPoint=new Point(x,y);
	}
	
	public void setEndPoint(Point p) {
		setEndPoint(p.x, p.y);
	}
	

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	
	public void draw(Graphics2D g2){
		g2.setColor(Color.WHITE);
		g2.draw(getRectangle());
	}	

	public boolean isValid() {		
		return startPoint!=null && endPoint!=null;
	}
	
	public Rectangle getRectangle(){
		int dx = Math.abs(startPoint.x-endPoint.x);
		int dy = Math.abs(startPoint.y-endPoint.y);
		return new Rectangle(Math.min(startPoint.x, endPoint.x),Math.min(startPoint.y, endPoint.y),dx,dy);
	}

}
