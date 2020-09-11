import java.util.*;
public class Petya_and_Strings{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next().toLowerCase();
        String b=sc.next().toLowerCase();
        int i =solve(a,b);
        System.out.println(i);
    }

    public static int solve(String a,String b){
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)<b.charAt(i))
                return -1;
            if(a.charAt(i)>b.charAt(i))
                return 1; 
        }
        return 0;
    }
}