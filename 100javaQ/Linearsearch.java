//for Array
//the time complexity for best case = O(1) nad for worst case = O(N)
import java.util.Scanner;
class Linearsearch{
    // static int linearsearch(int[] arr , int target){
    //     if(arr.length==0){
    //         return -1;
    //     }

    //     for(int i=0;i<=arr.length;i++){
    //         int element=arr[i];
    //         if(element==target){
    //             return i+1;
    //         }
    //     }

    //     return -1;
    // }
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the number you want to find : ");
        // int target = sc.nextInt();
        // int[] arr = {2,3,4,5,6,7,8,9};
        // int result = linearsearch(arr,target);
        // System.out.println("element is found at location "+result);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : " );
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("enter the element of array : ");
        for(int i = 0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("entered array is ");
        for(int i=0; i<size ; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
