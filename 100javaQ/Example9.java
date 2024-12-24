import java.util.Scanner;

class Example9 {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the first no");
        int n1 =sc.nextInt();
        System.out.println("Enter the second no");
        int n2 =sc.nextInt();

        int digitA1 = n1/10;
        int digitA2 = n1%10;
        int digitB1 = n2/10;
        int digitB2 = n2%10;

       if(n1 >= 25 && n2 <= 75){
            if (digitA1 == digitB1 || digitA1 == digitB2 || digitA2 == digitB1 || digitA2 == digitB2) {
                System.out.println("true");
            }
            else{
                System.out.println("False");
            }
        } else {
            System.out.println("The no. is not in the range of 25 to 75");
        }

       
    }
}
