//for string using for loop

class Linearsearch3 {
    static boolean linearsearch(String str ,char target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target==str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String name = "yashgite";
        char target = 'g';
        System.out.println(linearsearch(name ,target));
    }
}
