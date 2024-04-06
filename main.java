import geometry.ColoredCircle;
import geometry.Point;

class Main {
  public static void main(String[] args) {
    Point p = new Point(2.45, 5.76);
    ColoredCircle c = new ColoredCircle(p, 5.2, "Red");

    System.out.println("Wlasciwosci kola:");
    System.out.println(c.getArea());
    System.out.println(c.calculatePerimeter());
    System.out.println(c.getCenter().getX());
    System.out.println(c.getCenter().getY());
    System.out.println(c.getColor());
  }
}
