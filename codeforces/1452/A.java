import java.util.*;
public class ans{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
     int a=sc.nextInt();
     int b=sc.nextInt();
     int ans=0;
      if(a==b)
        ans=2*a;
      else
        ans=2*Math.max(a,b)-1;
     System.out.println(ans);
    }
   
  }
}