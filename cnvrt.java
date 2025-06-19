class cnvrt{
    public static void main(String[] args) {
        //ram#123 -> 123#ram
        String s="ram#123";
        String f=new StringBuilder(s).reverse().toString();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(f.charAt(i)=='#'){
                cnt=i;
                break;
            }
        }
        String si=f.substring(0,cnt);
        String en=f.substring(cnt+1);
        StringBuilder res=new StringBuilder();
      res.append(new StringBuilder(si).reverse().toString());
      res.append("#");
      res.append(new StringBuilder(en).reverse().toString());
        
System.out.println(res);

    }
}