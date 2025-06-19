//write all permutation of string “abc” output: “abc”,
//“acb”, “bac”, “bca”, “cba”, “cab”?
class strp{
    public static String swap(int i,int j,String s){
       char[]ch= s.toCharArray();
        char c=ch[i];
        ch[i]=ch[j];
        ch[j]=c;

        return new String(ch);
    }
    public static void prm(int ind,String s){

        int n=s.length();
        if(ind==n-1){
            System.out.println(s);
            return;
        }
        for(int i=ind;i<n;i++){
String t=swap(i,ind,s);
prm(ind+1,t);

    } }
    public static void main(String[] args) {
        String s="abc";
        prm(0,s);

    }
}