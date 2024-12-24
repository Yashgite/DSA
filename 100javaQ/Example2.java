import java.util.Scanner;

class Example2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the redius of circle");
        int r = sc.nextInt();
        float pi = 3.14f ;
        System.out.println("Area of Circle :"+pi*r*r);
                System.out.println("Perimeter of Circle :"+2*pi*r);

    }
}
