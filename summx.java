public class summx {
    public static void main(String[] args) {
      //input: “acb243d10” output:213+10=253
      String s="acb243d10"  ;
      int ans=0;
      int res=0;
      for(char i:s.toCharArray()){
       if(Character.isDigit(i)) {
        ans=ans*10+(i-'0');
       }
       else{
        res+=ans;
        ans=0;

       }
      }
      res+=ans;
      System.out.print(res);
    }
}
