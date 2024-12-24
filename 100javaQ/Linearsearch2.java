//for string using for each loop

class Linearsearch2 {
    static boolean linearsearch(String name,char target){
        
        for(char ch:name.toCharArray()){
            if(target==ch){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        String name = "yash";
        char target = 'a';
        System.out.println(linearsearch(name, target));
    }
}