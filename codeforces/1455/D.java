import java.util.*;
import java.io.*;
public class cf{
static boolean isSorted(int a[]){
  for(int i=0;i<a.length-1;i++){
       if(a[i]>a[i+1])
         return false;
  }
  return true;
}
  static void solve(int n,int x,int a[]){
       int ans=0;
       int i=0;
       int temp=0;
       while(i<n){
        if(isSorted(a)==true){
          System.out.println(ans);
          return;
        }
        if(a[i]>x){
          temp=x;
          x=a[i];
          a[i]=temp;
          ans++;
        }
        i++;
       }
       System.out.println("-1");
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      int x=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      solve(n,x,a);
    }
       
  }
}
