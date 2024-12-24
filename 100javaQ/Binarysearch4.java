//ceiling number = the smallest no. in array which is greater than equal to target element

public class Binarysearch4 {

    public static int ceiling(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if (target<arr[mid]) {
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }else {
                return mid;
            }
        }
        return start;
    }
    public static void main(String args[]){
        int[] arr = {2,13,17,22,34,44,64};
        int target = 12;
        System.out.println(ceiling(arr, target));
    }
}
