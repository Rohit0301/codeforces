import java.util.*;
public class chat_room  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String a="hello";
        int j=0;
        for(int i=0;i<s.length();i++){
             if(s.charAt(i)==a.charAt(j))
                j++;
            if(j==5)
                break;
        }
        if(j==5)
            System.out.println("YES");
        else System.out.println("NO");
    }
    
}