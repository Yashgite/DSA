//Write a Java program to accept a number and check whether the
//number is even or not. Prints 1 if the number is even or 0 if odd.

import java.util.Scanner;

class Example10 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        if(n1 % 2 == 0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
