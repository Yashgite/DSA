import java.util.Scanner;

public class ArithmeticOperations{

    static double addition(double a, double b){
        return a+b;
    }

    static double substraction(double a, double b){
        return a-b;
    }

    static double division(double a, double b){
        if (b == 0) {
            System.out.println("Division not possible");
            return Double.NaN;
        }
        return a/b;
    }

    static double multiplication(double a, double b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Division");
            System.out.println("4. Multiplication");
            System.out.println("5. nothing");

            int choice = sc.nextInt();

            
            if (choice == 5) {
                System.out.println("do nothing");
            }
            else{

                System.out.println("Enter 1st Number :");
                double num1 = sc.nextDouble();
                System.out.println("Enter 2nd Number :");
                double num2 = sc.nextDouble();
    

            double result=0;

            switch (choice) {
                case 1:
                    result = addition(num1,num2);
                    System.out.println("Result : "+result);
                    break;                     

                case 2:
                    result = substraction(num1,num2);
                    System.out.println("Result : "+result);
                    break;

                case 3:
                result = division(num1,num2);
                System.out.println("Result : "+result);
                break;

                case 4:
                result = multiplication(num1,num2);
                System.out.println("Result : "+result);
                break;
            
                default:
                    break;
            }

        }

    }
}