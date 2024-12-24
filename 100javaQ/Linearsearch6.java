//linear search in 2d array.

import java.util.Arrays;

class Linearsearch6{
    static int[] linearsearch(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if (target==arr[row][col]) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String args[]){
        int[][] arr = {{23,45,65,66,78,98},
                    {45,776,87,98,7,5},
                {4,8,7,6,0}};
        int target = 776;
        int[] result = linearsearch(arr, target);
        System.out.println(Arrays.toString(result));      
    }
}