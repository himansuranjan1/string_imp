//india that is bharat output: India That Is Bharat 
public class cpstrt {
public static void main(String[]args){
    String s="india that is bharat";
    StringBuilder ans=new StringBuilder();
    String[]w=s.split(" ");
   
   for(String j:w){
    char[]ch=j.toCharArray();
    String res="";
    for(int i=0;i<ch.length;i++){
        if(i==0){
         res+=Character.toUpperCase(ch[i]);
        }
        else{
            res+=ch[i];
        }
    }
    ans.append(res);
    ans.append(" ");
}
System.out.println(ans);
}}