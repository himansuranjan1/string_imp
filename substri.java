//Input: “Malayalam”
class substri{
    public static boolean pal(String s){
        return s.toLowerCase().equals(new StringBuilder(s).reverse().toString().toLowerCase());
    }
    public static void main (String[]args){
String s="Malayalam";
for(int i=0;i<s.length()-1;i++){
    for(int j=i+2;j<=s.length();j++){
String f=s.substring(i,j);
//System.out.println(f);
if(pal(f)){
    System.out.println(f);
}
    }}
}}