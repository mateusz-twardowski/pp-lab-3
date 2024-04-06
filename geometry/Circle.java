package geometry;

public class Circle {
  private Point center;
  private double radius;

  public Circle(Point c, double r) {
    this.center = c;
    this.radius = r;
  }

  public Point getCenter() {
    return this.center;
  }

  public double getRadius() {
    return this.radius;
  }

  public double calculatePerimeter() {
    return 2 * Math.PI * this.getRadius();
  }

  public double getArea() {
    return Math.PI * this.getRadius() * this.getRadius();
  }
}
