import java.util.*;
import java.lang.*;
import java.io.*;
public class ans{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
               int n=sc.nextInt();
               int a[]=new int[n];
               for(int i=0;i<n;i++)
                a[i]=sc.nextInt();

             Arrays.sort(a);
             System.out.println(solve(a,n));
             
        }
      }
    

    public static int solve(int a[],int n){
        
        for(int i=n-1;i>=0;i--)
        {
           if(a[i]<=i+1)
            return i+2;
        }
        return 1;
}
}