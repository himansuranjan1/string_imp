//Q12: write a java program to maximum occurrence character
//and its count in a string?
//Input: ramana output: a=3? 

import java.util.HashMap;
import java.util.Map;

class mxcnt{
    public static void main(String[] args) {
        String s="ramana";
        int mx=0;
        Character ap='#';
        Map<Character,Integer>m=new HashMap<>();
        for(Character i:s.toCharArray()){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(Character i:m.keySet()){
         if(mx<m.get(i)){
            mx=m.get(i);
           ap=i;
         }
        }
        System.out.println(ap+"= "+mx);
    }
}