import java.util.*;
import java.io.*;

public class ans  {

  static void solve(int n){
    int k=n/2;
    if(k%2!=0){
        System.out.println("NO");
        return;
    }

    int a[]=new int[n];
    int j=2;
    int sum1=0,sum2=0;
    for(int i=0;i<n/2;i++)
    {
      a[i]=j;
      sum1+=a[i];
      j+=2;
    }
  j=1;
   for(int i=n/2;i<n-1;i++){
    a[i]=j;
    sum2+=a[i];
    j+=2;
   }

   int s=sum1-sum2;
   a[n-1]=s;
   System.out.println("YES");
   for(int i=0;i<n;i++)
    System.out.print(a[i]+" ");
  System.out.println();

  }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            solve(n);
        }
    }
}