class Main {
  public static void main(String[] args) {
    Point p = new Point(2.45, 5.76);

    System.out.print(p.getX());
    System.out.print(" ");
    System.out.print(p.getY());
  }
}

class Point {
  private double x;
  private double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return this.x;
  }

  public double getY() {
    return this.y;
  }

  public void setX(double x) {
    this.x = x;
  }

  public void setY(double y) {
    this.y = y;
  }
}
