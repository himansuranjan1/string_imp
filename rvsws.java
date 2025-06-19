//Q17: input: “java is very easy” output: avaj si yrev ysay”  
class rvsws{
    public static String rvs(String s){
        String sum="";
        for(Character i:s.toCharArray()){
         sum=i+sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        String s="java is very easy";
        StringBuilder st=new  StringBuilder();
        String[]w=s.split(" ");
        for(String i:w){
             st.append(rvs(i));
              st.append(" ");
        }
        System.out.print(st);
    }
}