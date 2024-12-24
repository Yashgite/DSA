//Write a code to reverse a number

import java.util.Scanner;

class Example23 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number you want to reverse : ");
        int num = sc.nextInt();
        System.out.println("after reverse :"+reversenum(num));
    }
    public static int reversenum(int num){
        int reverse=0;
        while (num!=0) {
            int digit=num%10;
            reverse = reverse*10+digit;
            num=num/10;
        }
        return reverse;
    }
}
