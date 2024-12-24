import java.util.Scanner;

public class Authentication {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String user = "yash";
        String pass = "y123";
        System.out.println("Enter Username");
        String u=sc.nextLine();
        System.out.println("Enter Password");
        String p=sc.nextLine();

        try{
        if (u.equals(user) && p.equals(pass)) {
            System.out.println("login successfully");
        }

        else{
            throw new Exception("invalid user authentication");

        }
        
    }
    catch(Exception e){
        System.out.println(" Exception caught "+e.getMessage());
    }
    }
}
