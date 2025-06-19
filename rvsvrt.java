//input: “easy very is java” output: “java is very easy”s
class rvsvrt{

    public static String rvs(String s){
        String sum="";
        for(Character i:s.toCharArray()){
            sum=i+sum;
        }
        return sum;
    }
    public static void main(String[]args){
String s="easy very is java";
StringBuilder res=new StringBuilder();
String st=rvs(s);
String[]w=st.split(" ");
for(String i:w){
    String f=rvs(i);
    res.append(f);
    res.append(" ");
}

System.out.print(res);
    }
}