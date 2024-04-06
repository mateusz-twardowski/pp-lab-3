import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Point;

class Main {
  public static void main(String[] args) {
    Circle[] circles = {
        new Circle(new Point(2.4, 5.2), 3),
        new ColoredCircle(new Point(3.5, 2), 4.12, "Blue"),
        new Circle(new Point(3.4, 1.2), 2.12),
        new Circle(new Point(2.8, 5.7), 7.67),
        new ColoredCircle(new Point(3.9, 1.9), 5.12, "Green"),
        new Circle(new Point(9.12, 12.9), 15.6),
        new ColoredCircle(new Point(10.2, 2.1), 3.14, "Red"),
    };

    for (Circle circle : circles) {
      if (circle instanceof ColoredCircle) {
        System.out.println(
            String.format("Pole: %f %s", circle.getArea(), ((ColoredCircle) circle).getColor()));
      } else {
        System.out.println(
            String.format("Pole: %f", circle.getArea()));
      }
    }
  }
}
