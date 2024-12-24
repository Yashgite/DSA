import java.util.Scanner;

public class Consonent {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a string");
        String str = scan.nextLine();
        int count=0;
        for(char c:str.toLowerCase().toCharArray()){
            if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u'){
                count++;
            }
        }
        System.out.println("The Consonent are "+count);
    }
}


// Write a menu driven java code to perform arithmatic operations 