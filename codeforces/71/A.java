import java.util.*;
public class Way_to_long_words{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            String s=sc.next();
            int a=s.length();
            if(a>10){
                System.out.println(s.charAt(0)+""+(a-2)+""+s.charAt(a-1));
            }
            else{
                System.out.println(s);
            }
        }
    }
}