import java.util.Scanner;

class Example6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        char charc = sc.next().charAt(0);
        int ascival = (int)charc;

        System.out.println("The Ascii value of "+charc+" is "+ascival);
    }
}
