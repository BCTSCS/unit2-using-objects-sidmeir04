import greenfoot.*;

public class Rectangle extends Actor{
  private int width;
  private int height;
  private Rectangle partner;
  public Rectangle(int rWidth, int rHeight){
    width = rWidth;
    height = rHeight;
  }
  public Rectangle(int s){
      width = s;
      height = s;
      getImage().scale(width*10, height*10);
  }
  public Rectangle(){
      System.out.println("Width:" + width + " Height:" + height + " Partner" + partner);
  }
  public void setWidth(int w){
      width = w;
  }
  public void setHeight(int h){
      height = h;
  }
  public int getWidth(){
      return width;
  }
  public int getHeight(){
      return height;
  }
  public void setWidth(int w,int h){
      width = w;
      height = h;
  }
  public int getArea(){
      return width*height;
  }
  public void printArea(){
      System.out.print("The area of the Rectangle is: " + width*height);
  }
  public static void main(String[] args) {
    Rectangle rect = new Rectangle(5,5);
    System.out.println(rect);
    Rectangle rect1 = new Rectangle();
  }
  public String toString(){
      return "Retangle width: " + width + " height:" + height;
  }
}
