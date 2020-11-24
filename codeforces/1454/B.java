import java.util.*;
import java.io.*;
public class cf{
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0){
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int b[]=new int[n+1];
      for(int i=0;i<n;i++){
        b[a[i]]++;
      }
      int temp=0;
      for(int i=1;i<=n;i++){
        if(b[i]==1){
          temp=i;
          break;
        }
      }
      int ans=-1;
      for(int i=0;i<n;i++){
        if(a[i]==temp){
          ans=i+1;
        }
      }
      System.out.println(ans);

        }
    }
}