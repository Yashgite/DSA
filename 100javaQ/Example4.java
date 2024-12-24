import java.util.Scanner;

class Example4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length");
        int l = sc.nextInt();
        System.out.println("enter the breath");
        int b = sc.nextInt();

        int area = l*b;
        int peri = 2*(l+b);
        System.out.println("Area :"+area);
        System.out.println("perimeter :"+peri);
    }
}
