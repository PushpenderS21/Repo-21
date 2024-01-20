/*class  Square{
    double side;
    double perimeter;
    double area;
    public double getPerimeter(){
        double result =4*side;
        return result;
    }
    public double getArea(){
        double Area =side*side;
        return Area;
    }
        }
class Rectangle{
    int length;
    int breadth;
    int perimeter;
    int area;
    public int getPerimeter(){
        perimeter=2*(length+breadth);
        return perimeter;
    }
    public int getArea(){
        area=length*breadth;
        return area;
    }
}*/

class TommyVeciti{
    String hitting;
    String running;
    String firing;

    public void Hit(){
        System.out.println("you are hitting");
    }
    public void Run(){
        System.out.println("you are running");
    }
    public void Fire(){
        System.out.println("you are firing");
    }

}
public class perimeterArea {
    public static void main(String[] args) {
/*Square  square =new Square();
        square.side=10;
     double Perimeter= square.getPerimeter();
     double Area = square.getArea();
        System.out.println("The Perimeter of the is " + Perimeter);
        System.out.println("The area of the square is " +Area);

        Rectangle rectangle =new Rectangle();
        rectangle.length=10;
        rectangle.breadth=12;
      int  Result1=rectangle.getPerimeter();
       int Result2 = rectangle.getArea();
        System.out.println(Result1);
        System.out.println(Result2);*/

        TommyVeciti rockStarGames = new TommyVeciti();
        rockStarGames.Hit();
        rockStarGames.Run();
        rockStarGames.Fire();

    }
}