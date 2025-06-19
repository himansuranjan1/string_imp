import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class rmvdpli {
    public static void main(String[] args) {
        //input: “ramana” output: rmn? 
        String s="ramana";
       // Set<Character>s=new HashSet<>();
       Map<Character,Integer>m=new HashMap<>();
        for(char i:s.toCharArray()){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        String st="";
        for(char i:s.toCharArray()){
  if(m.get(i)==1){
st+=i;
  }
    }
    System.out.println(st);
}
}