class Example5 {
    public static void main(String args[]){
        int count = 0;
        for(int digit1 =1;digit1<=4;digit1++){
            for(int digit2 =1;digit2<=4;digit2++){
                for(int digit3 =1;digit3<=4;digit3++){
                    if (digit1 != digit2 && digit1 != digit3 && digit2 != digit3) {
                        int uniqueDigit = digit1*100 + digit2*10 + digit3;
                        System.out.println(uniqueDigit);
                        count++;
                    }
                }
            }
        }
        System.out.println("Total number of the three digit number are :"+count);
    }
}
