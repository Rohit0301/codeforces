/*

    /$$$$$  /$$$$$$  /$$    /$$  /$$$$$$                                                                  
   |__  $$ /$$__  $$| $$   | $$ /$$__  $$                                                                 
      | $$| $$  \ $$| $$   | $$| $$  \ $$                                                                 
      | $$| $$$$$$$$|  $$ / $$/| $$$$$$$$                                                                 
 /$$  | $$| $$__  $$ \  $$ $$/ | $$__  $$                                                                 
| $$  | $$| $$  | $$  \  $$$/  | $$  | $$                                                                 
|  $$$$$$/| $$  | $$   \  $/   | $$  | $$                                                                 
 \______/ |__/  |__/    \_/    |__/  |__/                                                                 
 /$$$$$$$  /$$$$$$$   /$$$$$$   /$$$$$$  /$$$$$$$   /$$$$$$  /$$      /$$ /$$      /$$ /$$$$$$$$ /$$$$$$$ 
| $$__  $$| $$__  $$ /$$__  $$ /$$__  $$| $$__  $$ /$$__  $$| $$$    /$$$| $$$    /$$$| $$_____/| $$__  $$
| $$  \ $$| $$  \ $$| $$  \ $$| $$  \__/| $$  \ $$| $$  \ $$| $$$$  /$$$$| $$$$  /$$$$| $$      | $$  \ $$
| $$$$$$$/| $$$$$$$/| $$  | $$| $$ /$$$$| $$$$$$$/| $$$$$$$$| $$ $$/$$ $$| $$ $$/$$ $$| $$$$$   | $$$$$$$/
| $$____/ | $$__  $$| $$  | $$| $$|_  $$| $$__  $$| $$__  $$| $$  $$$| $$| $$  $$$| $$| $$__/   | $$__  $$
| $$      | $$  \ $$| $$  | $$| $$  \ $$| $$  \ $$| $$  | $$| $$\  $ | $$| $$\  $ | $$| $$      | $$  \ $$
| $$      | $$  | $$|  $$$$$$/|  $$$$$$/| $$  | $$| $$  | $$| $$ \/  | $$| $$ \/  | $$| $$$$$$$$| $$  | $$
|__/      |__/  |__/ \______/  \______/ |__/  |__/|__/  |__/|__/     |__/|__/     |__/|________/|__/  |__/
                                                                                                          
                                                                                                          

*/

import java.io.*;
import java.util.*;
import java.math.*;
public class cf
{
   // static class pair{
   //  long x;
   //  Long y;
   //  public pair(long x,long y){
   //      this.x=x;
   //      this.y=y;
   //  }
   // }
    
    // static boolean solve(int []arr,int n,int sum,int m){
    //   System.out.println(sum);
    //   if(n<0)
    //     return false;
    //   if(sum!=0 && sum%m==0)
    //     return true;
    //   return solve(arr,n-1,sum+arr[n],m) | solve(arr,n-1,sum,m);
    // }
  

    public static void main(String args[]) throws IOException
    {
       Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         while(t-->0){
            int n=sc.nextInt();
            // int m=sc.nextInt();
            Long arr[]=new Long[n];
            for(int i=0;i<n;i++){
                 arr[i]=sc.nextLong();
            }

          
            Arrays.sort(arr);
           
            long ans=Long.MIN_VALUE,temp=0;
            int a=0,b=0,c=0,d=0,e=0;
            for(int i=0;i<n;i++){
              a=(i+0)%n;
              b=(i+1)%n;
              c=(i+2)%n;
              d=(i+3)%n;
              e=(i+4)%n;
               temp=arr[a]*arr[b]*arr[c]*arr[d]*arr[e];
              ans=Math.max(ans,temp); 
            }

            System.out.println(ans);
          }

}
}