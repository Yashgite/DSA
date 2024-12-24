//search the element in array. - done
////for string using for each loop -done
//for string using for loop - done
//linear search in range for example we need to check element 6 in the range of index 1 to 6 - done
//find minimum value in array . - done
//linear search in 2darray - done
//find the minimum value in 2d array
//consider a array and wap to return how many of them contain even number of digit

import java.util.Arrays;

class Practicels{
    static int findNum(int[] arr){
        int count=0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numfordigit=digit(num);
        if(numfordigit%2==0){
        return true;
        }
        return false;
    }

    static int digit(int num){
        int count=0;
        while (num!=0) {
            count++;
            num = num/10;
        }
        return count;
    }
    public static void main(String args[]){
        int[] arr = {2424,4543,567890,23};
        System.out.println(findNum(arr));
    }
}