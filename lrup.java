//input: RaMana output: rAmANA?
class lrup{
    public static void main(String[] args) {
        String s="RaMana";
        String res="";
        /*for(Character i:s.toCharArray()){
            if(Character.isUpperCase(i)){
               res+=Character.toLowerCase(i); 
            }
            else if(Character.isLowerCase(i)){
                   res+=Character.toUpperCase(i);
                   
            }
        }
        System.out.print(res);
    }*/
    for(Character i:s.toCharArray()){
   if(i>='a'&&i<='z'){
    res+=(char)(i-32);
   }
   else if(i>='A'&& i<='Z'){
        res+=(char)(i+32);
   }
    }
      System.out.print(res);
}}