import java.util.Scanner;

class Example26 {

    public static int fabonacci(int i){
        if(i<=0){
            return i;
        }
        else{
            return fabonacci(i - 1) + fabonacci(i - 2);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.print(fabonacci(i) );

        }
    }
}
