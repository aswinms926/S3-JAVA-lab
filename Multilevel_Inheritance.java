package aswin;

import java.io.*;

class Box
{
    private double width,height,depth;
     Box(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    double volume()
    {
        return width*height*depth;
    }
}
class Box_weight extends Box
{
    double weight;
    Box_weight(double w,double h,double d,double t)
    {
        super(w,h,d);
        weight=t;

    }
}
class Shipment extends Box_weight
{
    double cost;
    Shipment(double w,double h,double d,double t,double c)
    {
        super(w,h,d,t);
        cost=c;
    }
}
public class Multilevel_Inheritance
{
    public static void main(String [] args) {

        Shipment ob = new Shipment(2, 2, 3, 4, 4);
        double vol = ob.volume();
        System.out.println("volume is : " + vol);
        System.out.println("weight is : " + ob.weight);
        System.out.println("cost is : " + ob.cost);

    }
}
