import java.util.Scanner;
interface shapes {
   public void displayarea();
}

class rectangle implements shapes{
    int length;
    int width;

     rectangle(int l,int b){
        length=l;
        width=b;
    }
    public void displayarea(){
        double area=length*width;
        System.out.println("area of rectangle is "+area);
    }

}
class circle implements shapes{
    int radius;

    circle(int r){
        radius=r;
    }
    public void displayarea(){
         double area= 3.14 * radius* radius;
        System.out.println("area of circle is "+area);
    }

}

class shapesusinginterface{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimesnions of rectangle");
        int l= sc.nextInt();
        int w=sc.nextInt();
        rectangle rect = new rectangle(l,w);
        System.out.println("Enter the dimesnions of Circle");
        int r= sc.nextInt();
        circle circ = new circle(r);

        rect.displayarea();

        circ.displayarea();


    }
}