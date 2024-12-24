//the persons has some multiple bank account you need to find maximum wealth

class Linearsearch9 {
    public static void main(String args[]){
        int[][] accounts={{1,2,3},
                          {3,4,3},
                          {4,2,1},
                          {12,3,5}};
        int maxSum=0;

        for(int person=0;person<accounts.length;person++){
            int sum=0;
            for(int account=0;account<accounts[person].length;account++){
                 sum=sum+accounts[person][account];
            }
            if (sum>maxSum) {
                maxSum=sum;
            }
        }

        System.out.println(maxSum);
    }
}
