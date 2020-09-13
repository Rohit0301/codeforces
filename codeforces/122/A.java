import java.util.*;
public class lucky_division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0,flag=0;
        for(int i=1;i<=n;i++){
            String s=""+i;
            if(lucky(s)==1 && n%i==0){
                flag=1;
                break;

            }
        }
        if(flag==1)
            System.out.println("YES");
        else
            System.out.println("NO");
        
    }

   static int lucky(String s){
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)!='4' && s.charAt(i)!='7')
            return 0;
    }
    return 1;
   }
}