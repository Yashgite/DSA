 //wap wheather it is ascending order or descending order.
 
 
 class BinarysearchEx3 {
    
    static void findNum(int[] arr,int target){

        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];//true = ascending and false = descending

        while (start<=end) {
            int mid = start+(end-start)/2;

            if (isAsc) {
                if (target<arr[mid]) {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if (target<arr[mid]) {
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        if(isAsc){
            System.out.println("Ascendinggggggggg");
        }else{
            System.out.println("Descendinggggg");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 8;
        findNum(arr,target);
    }
}