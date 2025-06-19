public class srtstr {
    public static void main(String[] args) {
        String s="ccaabbd";
        char[]w=s.toCharArray();
           int n=s.length();
        for(int i=0;i<n;i++){
         for(int j=0;j<n-i-1;j++){
            if(w[j]>w[j+1]){
            char c=w[j];
            w[j]=w[j+1];
             w[j+1]=c;
            }
         }
        }
        System.out.println(new String(w));
    }
}
