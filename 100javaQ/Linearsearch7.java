//find the minimum value in 2d array

import java.util.Arrays;

class Linearsearch7 {

    static int findMin(int[][] arr){
        int minElement = arr[0][0];
        int row,col;
        for(row = 0;row<arr.length;row++){
            for(col = 0;col<arr[row].length;col++){
                if(arr[row][col]<minElement){
                    minElement=arr[row][col];
                }
            }
        }
        return minElement;
    }
    public static void main(String[] args) {
        int[][] arr = { {98,3,5,61,29,2,8},
                        {35,64,54,77,89,88},
                        {83,50,55,65,1,44}
                      };
        System.out.println(findMin(arr));               
    }
}