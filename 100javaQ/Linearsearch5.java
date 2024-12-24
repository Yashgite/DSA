//find minimum value in array . 
class Linearsearch5{
    static int linearsearch(int[] arr){
        int minElement = arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]<minElement) {
                minElement = arr[i];
            }
        }
        return minElement;
    }
    public static void main(String args[]){
        int[] arr = {21,36,4,75,96,72,53,43,};
        System.out.println(linearsearch(arr));
    }
}