package domain;


import java.awt.geom.Point2D;
import java.util.Set;

public class Circle {

  final private float x, y, radius;

  final private Set<Point2D.Float> pointSet;

  public Circle(float x, float y, float radius, Set<Point2D.Float> pointSet) {
    this.x = x;
    this.y = y;
    this.radius = radius;
    this.pointSet = pointSet;
  }

  public float getX() {
    return x;
  }

  public float getY() {
    return y;
  }

  public float getRadius() {
    return radius;
  }

  public boolean contains(Point2D.Float p) {
    if(pointSet.contains(p)) return false;
    boolean result = (p.x - x) * (p.x - x) + (p.y - y) * (p.y - y) <= radius * radius ;

    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Circle)) return false;

    Circle circle = (Circle) o;

    return pointSet.equals(circle.pointSet);

  }

  @Override
  public int hashCode() {
    return pointSet.hashCode();
  }

  public Set<Point2D.Float> getPointSet() {
    return pointSet;
  }

}
