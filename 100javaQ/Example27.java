//Write code of Greatest Common Divisor

import java.util.Scanner;

class Example27 {

    public static int Gcd(int a  ,int b){
         while (b!=0) {
           int temp = b;
            b = a%b;
            a=temp;
         }
         return a;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st input :");
        int n1 = sc.nextInt();
        System.out.println("enter 2nd input :");
        int n2 = sc.nextInt();

        int result=Gcd(n1,n2);
        System.out.println("Greatest common Divisor : " +result);

        }
}
