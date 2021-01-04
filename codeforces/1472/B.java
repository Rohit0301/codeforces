import java.util.*;
public class cf{
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        int n=sc.nextInt();
        int a[]=new int[n];
        int o=0,r=0;
        int sum=0;
        for(int i=0;i<n;i++){
           a[i]=sc.nextInt();   
           sum+=a[i];
        }
        if(sum%2!=0){
          System.out.println("NO");
          continue;
        }
      Arrays.sort(a);
      int s1=0;
      int s2=0;
      for(int i=n-1;i>=0;i--){
        if(s1<=s2){
          s1+=a[i];
        }
        else{
          s2+=a[i];
        }
      }
    
      if(s1==s2)
        System.out.println("YES");
      else
        System.out.println("NO");

   }

 }
}