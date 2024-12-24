import java.util.Scanner;
class Example1{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Input first number :");
        int n1 = sc.nextInt();
        System.out.print("Input Second number :");
        int n2 = sc.nextInt();
        System.out.print("Result :"+n1*n2);
        sc.close();
    }
}