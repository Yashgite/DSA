//Write a code to find the factorial of a number.

import java.util.Scanner;

class Example24 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;

        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial :"+factorial);
    }
}
