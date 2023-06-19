import java.util.*;
interface perarea
{
    public void perimeter();
    public void area();
}

class Circle implements perarea {
    Scanner sc = new Scanner(System.in);
    System.out.@println("Enter The Radius: ")identifier;
    double radius = sc.nextDouble();
    public void perimeter() {
        double p = 2*3.14*radius;
        System.out.println("The Circumference of circle " + p);
    }
    public void area(){
        double a = 3.14*radius*radius;
        System.out.println("The area of circle " + a);
    }
}

class Rectangle implements perarea {
    public void perimeter(int length, int width) {
        int p = 2*(length+width);
        System.out.println("The perimeter of rectangle " + p);
    }
    public void area(int length, int width){
        int a = length*width;
        System.out.println("The area of rectangle " + a);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        perarea c= new Circle(); 
        c.perimeter();
        c.area();
        sc.close();
    }
}

