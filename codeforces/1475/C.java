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
              int a=sc.nextInt();
              int b=sc.nextInt();
              int k=sc.nextInt();
              int A[]=new int[k];
              int B[]=new int[k];
              ArrayList<Integer> arr=new ArrayList<>();
              ArrayList<Integer> brr=new ArrayList<>();
              for(int i=0;i<=a;i++){
                  arr.add(0);
              }
              for(int i=0;i<=b;i++){
                  brr.add(0);
              }
              for(int i=0;i<k;i++){
                   A[i]=sc.nextInt();
                   arr.set(A[i],arr.get(A[i])+1); 
              }


              for(int i=0;i<k;i++){
                   B[i]=sc.nextInt();
                   brr.set(B[i],brr.get(B[i])+1); 
              }
              // System.out.println(arr);
              // System.out.println(brr);
              long ans=0;
             
              for(int i=0;i<k;i++){
                    ans+=(long)k-((long)arr.get(A[i])+(long)brr.get(B[i]))+1;       
              }
              System.out.println(ans/2);

             }

     
        }

}
