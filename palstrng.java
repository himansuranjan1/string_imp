//palindrome or not
class palstrng{
    public static void main(String[] args) {
        String s="madam";
     if( s.equals(new StringBuilder(s).reverse().toString())){
        System.out.println("yes");
     }
     else{
        System.out.println("no"); 
     }
    }
}