//linear search in range for example we need to check element 6 in the range of index 1 to 6 :

class Linearsearch4 {
    static boolean linearsearch(int[] arr,int target,int start,int end){
        for(int i=start;i<=end;i++){
            int element=arr[i];
            if(target==element){
                return true;
            }
        }
        return false;
    }
    public static void main(String srgs[]){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        System.out.println(linearsearch(arr, target, 1, 5));
    }
}