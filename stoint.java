//input:”3124” output:3124 without using parseInt
class stoint{
    public static void main(String[]args){
        String s="3124";
        int ans=0;
        for(char i:s.toCharArray()){
            ans=ans*10+(i-'0');
        }
    
    System.out.print(ans);
}}