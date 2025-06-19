import java.util.HashMap;
import java.util.Map;

public class charint {
  public static void main(String[] args) {
   StringBuilder st=new StringBuilder();
    String s="Ramana";
    //input:” Ramana” output:” R@m@n@”;
    Map<Character,Integer>m=new HashMap<>();
    for(Character i:s.toCharArray()){
     m.put(i,m.getOrDefault(i,0)+1);

    }
    for(Character i:s.toCharArray()){
        if(m.get(i)>1){
            st.append("@");
        }
        else{
            st.append(i);
        }
    }
    System.out.println(st);
  }

}
