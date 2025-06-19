/*java program to print palindrome words in a
string?
Input: eye level car boy? output: eye, level*/
class palinstr{
    public static boolean pal(String s){
    return  s.equals(new StringBuilder(s).reverse().toString());
    }
    public static void main(String[] args) {
        String s="eye level car boy?";
        String [] w=s.split(" ");
 for(String i:w){
    if(pal(i)==true){
        System.out.println(i);
    }
 }

    }
}