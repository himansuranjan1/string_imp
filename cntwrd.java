//write a java program to count words in a string
class cntwrd{
    public static void main(String[]args){
         String input = "Java is a powerful programming language";
         String[] cnt=input.split(" ");
         System.out.print(cnt.length);

    }
}