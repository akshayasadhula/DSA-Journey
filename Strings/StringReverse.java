//Problem:string reverse
//Platform:gfg
//difficulty:basic
//date:22-02-26
public class StringReverse{
    public static String reversestring(String s){
        int len=s.length()-1;
        String rev="";
        for(int i=len;i>=0;i--){
            rev+=s.charAt(i);
        }
        return rev;
}
    
public static void main(String[] args){
    String s="Geeks";
    System.out.println("reverse of geeks is: " +reversestring(s));
}
}