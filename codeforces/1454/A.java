import java.util.*;
import java.io.*;
public class cf{
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0){
      int n=sc.nextInt();
      int a[]=new int[n];
      int temp=0;
      int j=0;
      for(int i=n;i>=1;i--){
        a[j]=i;
        j++;
      }
      if(n%2!=0){
        temp=a[(n/2)];
        
        a[(n/2)]=a[n-1];
        a[n-1]=temp;
      }
      for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
      }
      System.out.println();
     }
    }
}