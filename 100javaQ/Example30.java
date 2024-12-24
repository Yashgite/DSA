//Write code Check if the given string is Palindrome or not

import java.util.Scanner;

class Example30 {
    public static void main(String args[]){
        
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        
        s=s.replaceAll("\\s","");
        int left=0;
        int right=s.length()-1;
        boolean isPalindrome = true;

        while (left<right) {
            if (s.charAt(left)!=s.charAt(right)) {
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }

        if(isPalindrome){
            System.out.println("the string is palindrome");
        }
        else{
            System.out.println("the string is not a palindrome");
        }

         

    }
}
