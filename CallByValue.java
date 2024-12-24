import java.util.Scanner;

public class CallByValue {

     public static int swap(int n1,int n2){
        int temp = n1;
        n1=n2;
        n2=temp;
        System.out.println("value of n1: "+n1+" and value of n2: "+n2);
        return 0;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    CallByValue call = new CallByValue()
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int res = swap(n1,n2);
    System.out.println(res);

}
}
