import geometry.Square;

class Main {
  public static void main(String[] args) {
    Square r = new Square(7);

    System.out.println("Wlasciwosci kwadratu:");
    System.out.println(r.calculateArea());
    System.out.println(r.calculatePerimeter());
  }
}
