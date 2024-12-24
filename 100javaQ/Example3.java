import java.util.Scanner;

class Example3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fist no.");
        int n1 = sc.nextInt();
        System.out.println("Enter the second no.");
        int n2 = sc.nextInt();
        System.out.println("Enter the third no.");
        int n3 = sc.nextInt();

        int sum = n1+n2+n3;
        float avg= sum/3.0f;
        System.out.printf("Avg : %.2f", avg);
    }
}
