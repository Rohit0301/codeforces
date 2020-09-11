import java.util.*;
public class helpful_maths{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String str[]=s.trim().split("\\+",(s.length()/2)+1);
        Arrays.sort(str);
        String output=str[0];
        for(int i=1;i<str.length;i++){
            output=output+"+"+str[i];
        }
        System.out.println(output);
    }
}