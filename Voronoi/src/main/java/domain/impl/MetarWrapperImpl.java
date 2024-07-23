package domain.impl;

import java.awt.Point;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import VMath.VMath;
import domain.Edge;
import domain.IMetarWrapper;
import domain.SortablePoint;
import met.METAR;

public class MetarWrapperImpl extends Number implements IMetarWrapper {
	private METAR metar;
	private Point gridPoint;
	private Set<Edge> edgeSet = new HashSet<Edge>();
	private Point centroid;
	private Polygon polygon;

	public MetarWrapperImpl(METAR metar) {
		this.metar = metar;
	}

	@Override
	public METAR getMetar() {
		return metar;
	}


	@Override
	public Polygon getVoronoiPolygon() {
		if(polygon == null) {
			polygon = new Polygon();
			
			List<Edge> edgeList = new ArrayList<Edge>(this.edgeSet);
			Set<SortablePoint> pointSet = new HashSet<SortablePoint>();
			for(Edge e: edgeList) {
				pointSet.add(new SortablePoint(e.getP1()));
				pointSet.add(new SortablePoint(e.getP2()));
			}
			
			if(pointSet.size()<=2) return null;
			this.setCentroid(calculateCentroid(pointSet));
	
			for(SortablePoint p:pointSet) {
				float tanAngle = (float) Math.toDegrees((float) Math.atan2(p.y - getCentroid().y, p.x - getCentroid().x));
				tanAngle = (float) VMath.modulo(tanAngle+360,360);
				p.setAngle(tanAngle);
			}
			List<SortablePoint> sortedPoints = new ArrayList<SortablePoint>(pointSet);
			Collections.sort(sortedPoints);  
			for(SortablePoint p: sortedPoints) {
				polygon.addPoint(p.x, p.y);			
			}
		}
			
		return polygon;
	}

	private Point calculateCentroid(Set<? extends Point> pointSet) {
		int i = 0;
		Point centroid = new Point();
		for(Point p: pointSet) {			
			centroid.x+= p.x;
			centroid.y+= p.y;			
		}
		centroid.x/=pointSet.size();
		centroid.y/=pointSet.size();
		return centroid;
	}

	@Override
	public int intValue() {
		return metar.getAltimInHg().intValue();
	}

	@Override
	public long longValue() {
		return metar.getAltimInHg().longValue();
	}

	@Override
	public float floatValue() {
		return metar.getAltimInHg().floatValue();
	}

	@Override
	public double doubleValue() {
		return metar.getAltimInHg().doubleValue();
	}

	@Override
	public Point getGridPoint() {
		return gridPoint;
	}

	@Override
	public void setGridPoint(Point p) {
		gridPoint = p;
	}

	@Override
	public Set<Edge> getEdges() {
		return this.edgeSet;
	}

	public Point getCentroid() {
		return centroid;
	}

	public void setCentroid(Point centroid) {
		this.centroid = centroid;
	}
}
