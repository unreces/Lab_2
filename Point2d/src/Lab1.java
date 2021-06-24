import com.sun.jdi.DoubleValue;
import java.util.Scanner;
import java.awt.*;

public class Lab1  {
    public static void main(String[] args) {
        Point3d[] myPoint = new Point3d[3]; //объявление массива из 3 объектов
        Scanner in = new Scanner(System.in);
        System.out.println("enter coord of 1st dot (use enter)");
        Point3d d1 = new Point3d(in.nextDouble(),in.nextDouble(),in.nextDouble());
        System.out.println("enter coord of 2nd dot (use enter)");
        Point3d d2 = new Point3d(in.nextDouble(),in.nextDouble(),in.nextDouble());
        System.out.println("enter coord of 3rd dot (use enter)");
        Point3d d3 = new Point3d(in.nextDouble(),in.nextDouble(),in.nextDouble());
        if(Point3d.equals(d1,d2)||Point3d.equals(d2,d3)||Point3d.equals(d1,d3))
            System.out.println("Some dots is equaled");
        else
            System.out.println(computeArea(d1,d2,d3));
    }

    public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
        double a,b,c,p;
        a=p2.distanceTo(p3);
        b=p1.distanceTo(p3);
        c=p1.distanceTo(p2);
        p=a+b+c;
        p/=2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }


}


