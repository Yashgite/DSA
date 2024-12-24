//Write the code to for Armstrong number
import java.util.Scanner;

class Example25 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        int count = 0 , sum = 0;
        int digit;
        int temp1=n;

        while (temp1 !=0) {
            digit = temp1%10;
            temp1 = temp1/10;
            count++;
        }

        int temp2= n;
        while (temp2 !=0) {
            digit = temp2%10;
            sum = sum + (int)Math.pow(digit, count);
            temp2 = temp2/10;
        }

        if(n == sum){
            System.out.println("the number "+n+" is Armstrong number");
        }
        else{
            System.out.println("the number "+n+" is not Armstrong number");
        }
    }
}