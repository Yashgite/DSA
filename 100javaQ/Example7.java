import java.util.Scanner;

class Example7 {
    public static int calculateModulus(int a , int b){
        if (b == 0) {
            System.out.println("can not divivde");
        }
            return a-(a/b)*b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter dividend :");
        int dividend = sc.nextInt();
        System.out.println("enter divisor :");
        int divisor = sc.nextInt();

        int result = calculateModulus(dividend, divisor);
        System.out.println(result);
    }
}
