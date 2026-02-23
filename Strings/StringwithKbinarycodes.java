import java.util.HashSet;
import java.util.Set;

public class StringwithKbinarycodes {
    public  static boolean hasAllCodes(String s, int k) {
        int len=s.length();
        Set<String> set =new HashSet<>();
        for(int i=0;i<=len-k;i++){
           String sub=s.substring(i,i+k);
           set.add(sub);
            }
            
                return set.size() == 1<<k;
        }
        public static void main(String[] args) {
            String s="1011001";
            int k=2;
            System.out.println(hasAllCodes(s,k));

        }
    }


