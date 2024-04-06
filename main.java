import geometry.Rectangle;

class Main {
  public static void main(String[] args) {
    Rectangle r = new Rectangle(10, 15);

    System.out.println("Wlasciwosci prostokata:");
    System.out.println(r.calculateArea());
    System.out.println(r.calculatePerimeter());
  }
}
