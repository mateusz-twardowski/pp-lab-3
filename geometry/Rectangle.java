package geometry;

public class Rectangle {
  private double length;
  private double width;

  public Rectangle(double l, double w) {
    this.length = l;
    this.width = w;
  }

  public double calculateArea() {
    return this.length * this.width;
  }

  public double calculatePerimeter() {
    return this.length * 2 + this.width * 2;
  }
}
