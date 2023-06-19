import java.util.*;
interface perarea
{
    public void perimeter();
    public void area();
}

class Circle implements perarea {

    public void perimeter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius: ");
        double radius = sc.nextDouble();
        double p = 2*3.14*radius;
        System.out.println("The Circumference of circle " + p);
    }
    public void area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius: ");
        double radius = sc.nextDouble();
        double a = 3.14*radius*radius;
        System.out.println("The area of circle " + a);
    }
}

class Rectangle implements perarea {
    public void perimeter() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length: ");
        int length = sc.nextInt();        
        System.out.println("Enter The Width: ");
        int width = sc.nextInt();
        int p = 2*(length+width);
        System.out.println("The perimeter of rectangle " + p);
    }
    public void area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length: ");
        int length = sc.nextInt();        
        System.out.println("Enter The Width: ");
        int width = sc.nextInt();        
        int a = length*width;
        System.out.println("The area of rectangle " + a);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice , cont;
        

do{
        System.out.println("Select Shape");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");

        choice=sc.nextInt();

        switch(choice){
            case 1: 
            perarea c= new Circle(); 
            c.perimeter();
            c.area();
            break;

            case 2: 
            perarea r= new Rectangle(); 
            r.perimeter();
            r.area();
            break;
            
            default: System.out.println("Invalid Choice!!!");
        }        
        System.out.println("Press 0 to exit, any other key to continue");
        cont=sc.nextInt();

        }while(cont!=0);
    sc.close();
}
}

