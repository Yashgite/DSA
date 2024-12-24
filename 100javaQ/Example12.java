//Write a Java program to convert a string to an integer.

import java.util.Scanner;

class Example12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String input1 = sc.nextLine();

        try{
        int input2 = Integer.parseInt(input1);
        System.out.println(input2);
        }
        catch(NumberFormatException e){
        System.out.println("provide a proper input");
    }
    finally{
        sc.close();
    }
}
}
