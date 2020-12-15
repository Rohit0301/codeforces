import java.util.*;
public class cf{
 
  public static boolean solve(long a){
           for(int i=2;i*i<=a;i++)
           {
            if(a%i==0)
              return false;
           }
           return true;
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
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int b[]=new int[n];
      int j=0;
      int k=n-1;
      for(int i=0;i<n;i++){
        if(i%2==0){
        b[i]=a[j];
        j++;
      }
      else{
        b[i]=a[k];
        k--;
      }
      }

      for(int i=0;i<n;i++)
        System.out.print(b[i]+" ");
      System.out.println();
    }
}
}