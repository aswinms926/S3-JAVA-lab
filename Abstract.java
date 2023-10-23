package aswin;
abstract class Shape
{
    abstract  void numberOfSlides();
    void sumofangles( int sides)
    {
        int sum = (sides-2)*180;
        System.out.println("The sum of the angles for a shape with "+ sides+" sides is " + sum+" degrees");
    }
}


class Rectangle extends Shape
{
     void numberOfSlides()
     {
         System.out.println("Rectangle has 4 sides");
         super.sumofangles(4);
     }
}

class Triangle extends Shape
{
    void numberOfSlides()
    {
        System.out.println("Triangle has 3 sides");
        super.sumofangles(3);
    }
}
class Hexagon extends Shape
{
    void numberOfSlides()
    {
        System.out.println("Hexagon has 6 sides");
        super.sumofangles(6);
    }
}
public class Abstract {
    public static void main(String args[]) {
        Rectangle a = new Rectangle();
        a.numberOfSlides();
        Triangle b = new Triangle();
        b.numberOfSlides();
        Hexagon c = new Hexagon();
        c.numberOfSlides();
    }
}