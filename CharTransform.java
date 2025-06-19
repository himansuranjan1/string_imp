import java.util.*;

public class CharTransform {
    public static void main(String[] args) {
        String input = "helloworld";  //he121w2r3d

        Map<Character, Integer> f = new HashMap<>();
        Set<Character>l=new LinkedHashSet<>();
     String res="";

        for (char ch : input.toCharArray()) {
            f.put(ch, f.getOrDefault(ch, 0) + 1);}
        for (char ch : input.toCharArray()) {
            if(f.get(ch)>1){
               l.add(ch); 
            }
        }  char ch[]= input.toCharArray() ;
         for (int i=ch.length-1;i>=0;i--) {  
            if (f.get(ch[i])>0 && l.contains(ch[i])) {
                int x=f.get(ch[i]);
              res=x+res;
                f.put(ch[i],x-1);
            } else {
                res=ch[i]+res;
            }
        }

        System.out.println("Output: " + res.toString());
    }
}
