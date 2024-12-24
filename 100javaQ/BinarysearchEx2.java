//Binary search for descending order

class BinarysearchEx2 {
    static int findNum(int[] arr , int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid = start+(end-start);

            if (target<arr[mid]) {
                start=mid+1;
            }
            else if(target>arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1};
        int target = 8;
        int ans = findNum(arr,target);
        System.out.println(ans);
    }
}
