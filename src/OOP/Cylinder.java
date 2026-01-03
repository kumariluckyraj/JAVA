package OOP;

import java.util.Scanner;
public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double getArea(){
        return 2 * Math.PI * radius * (radius + height);
    }
    public double getVolume(){
        return Math.PI*radius*radius*height;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("radius:");
        double r = sc.nextDouble();
        System.out.println("height:");
        double h = sc.nextDouble();
        Cylinder cyl = new Cylinder(r,h);
        System.out.println("Surface Area of OOP.Cylinder: " + cyl.getArea());
        System.out.println("Volume of OOP.Cylinder: " + cyl.getVolume());
        sc.close();
    }

}
