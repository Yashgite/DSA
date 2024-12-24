// Sum of First N Natural numbers{1,2,3,4,5,6,7,...to infinity}

import java.util.Scanner;

class Example22 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input");
        int n = sc.nextInt();
        int sum=0;

        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("Sum = "+sum);
    }
}

