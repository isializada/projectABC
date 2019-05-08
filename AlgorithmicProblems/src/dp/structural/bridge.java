package dp.structural;

public class bridge {
  public static void main(String[] args){
    Shape redCircle = new Circle(15, 20, 25, new BlueCircle());
    redCircle.draw();
  }
}

interface DrawAPI {
  public void drawCircle(int radius, int x, int y);
}

class RedCircle implements DrawAPI {
  @Override
  public void drawCircle(int radius, int x, int y) {
    System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
  }
}

class BlueCircle implements DrawAPI{
  @Override
  public void drawCircle(int radius, int x, int y){
    System.out.println("Drawing Circle[ color: blue, radius: " + radius + ", x: " + x + ", " + y + "]");
  }
}

abstract class Shape {
  protected DrawAPI drawAPI;

  protected Shape(DrawAPI drawAPI){
    this.drawAPI = drawAPI;
  }

  public abstract void draw();
}

class Circle extends Shape {
  private int x, y, radius;

  public Circle(int x, int y, int radius, DrawAPI drawAPI) {
    super(drawAPI);
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  public void draw() {
    drawAPI.drawCircle(radius, x, y);
  }
}
