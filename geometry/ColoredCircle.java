package geometry;

public class ColoredCircle extends Circle {
  private String color;

  public ColoredCircle(Point c, double r, String color) {
    super(c, r);

    this.color = color;
  }

  public String getColor() {
    return this.color;
  }
}
