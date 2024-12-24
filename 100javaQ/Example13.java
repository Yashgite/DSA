//Write a Java program to calculate the sum of two integers and return
//true if the sum is equal to a third integer.

import java.util.Scanner;

class Example13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int sum = n1+n2;
        System.out.println("sum :"+sum);
        if(sum == n3){
            System.out.println("True"); ;
        }
    }
}
