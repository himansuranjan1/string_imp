import java.util.Arrays;

public class angrm {
    public static void main(String[] args) {
        //"listen" and "silent"
        String a="listen";
        String b="silent";
        char[]ca=a.toCharArray();
        char[]cb=b.toCharArray();
      Arrays.sort(ca);
      Arrays.sort(cb);
if(Arrays.equals(ca,cb)){
    System.out.print("yes");
}
else{
    System.out.print("no"); 
}
    }
}
