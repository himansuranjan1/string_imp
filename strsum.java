class strsum{
    public static void main(String[] args) {
        String s="abc123";
        int sum=0;
        for(Character i:s.toCharArray()){
            if(Character.isDigit(i)){
                 sum+=i-'0';
        }}
        System.out.println(sum);
    }// //input:” Ramana” output:” R@m@n@”;
}