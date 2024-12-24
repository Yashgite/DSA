//consider a array and wap to return how many of them contain even number of digit


class Linearsearch8 {

    static int findEven(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count; 
    }

    static boolean even(int num){
        int numberofdigit=digit(num);
        if(numberofdigit%2==0){
            return true;
        }
        return false;
        }

    static int digit(int num){
        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[]={2,34,54,788,6554,9888,86,456};
        System.out.println(findEven(nums));
    }
}

