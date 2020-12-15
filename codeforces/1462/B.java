import java.util.*;
public class cf{
 
  public static boolean solve(String s,int n){
    if(s.charAt(0)=='2' && s.charAt(1)=='0' && s.charAt(2)=='2' && s.charAt(3)=='0')
      return true;
    if(s.charAt(n-4)=='2' && s.charAt(n-3)=='0' && s.charAt(n-2)=='2' && s.charAt(n-1)=='0')
      return true;
    if(s.charAt(0)=='2' && s.charAt(1)=='0' && s.charAt(2)=='2' && s.charAt(3)=='0')
      return true;

    if(s.charAt(0)=='2' && s.charAt(1)=='0' && s.charAt(n-2)=='2' && s.charAt(n-1)=='0')
      return true;

    if(s.charAt(0)=='2' && s.charAt(n-3)=='0' && s.charAt(n-2)=='2' && s.charAt(n-1)=='0')
      return true;
    if(s.charAt(0)=='2' && s.charAt(1)=='0' && s.charAt(2)=='2' && s.charAt(n-1)=='0')
      return true;
    return false;
  }
  public static int gcd(int a,int b){
     if(b==0)
      return a;
    return gcd(b,a%b);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      String s=sc.next();
      boolean ans=solve(s,n);
      if(ans==true)
        System.out.println("YES");
      else System.out.println("NO");
    }
}
}