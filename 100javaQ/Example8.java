import java.util.Scanner;

class Example8 {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the first no.");
        int n1 = sc.nextInt();
        System.out.println("enter the second no.");
        int n2 = sc.nextInt();
        
        if (n1==n2) {
            System.out.println(" is Result = 0");
        }
        else if (n1%6 == n2%6) {
            int smallestNum = n1<n2?n1:n2;
            System.out.println("the smallest no. is "+smallestNum);
        }
        else {
            int largestNum = n1>n2?n1:n2;
            System.out.println("the largest no. :"+largestNum);
        }
    }
}
