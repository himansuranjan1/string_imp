//String = I love python Input: - “java” REPLACE WITH
//“python” Output: - I love java? 
 class rplc{
    public static void main(String[] args) {
        String s="I love python";
        String[]w=s.split(" ");
        StringBuilder st=new StringBuilder();
        for(String i:w){
            if(i.equals("python")){
                st.append("java"+" ");
                
            }
            else{
                st.append(i+" ");
            }
        }
        System.out.println(st);
    }
 }