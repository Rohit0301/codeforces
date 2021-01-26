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
        int m=sc.nextInt();
        int n=sc.nextInt();
        int B[][]=new int[m][n];
        int A[][]=new int[m][n];
        int C[][]=new int[m][n];
        for (int i = 0; i < m; ++i)
    {
      for (int j = 0; j < n; ++j)
      {
         B[i][j]=sc.nextInt();
        A[i][j] = 1;
        C[i][j] = 0;
      }
    }
    
    for (int i = 0; i < m; ++i)
    {
      for (int j = 0; j < n; ++j)
      {
        if (B[i][j] == 0)
        {
          for (int k = 0; k < n; ++k)
          {
            A[i][k] = 0;
          }
          for (int k = 0; k < m; ++k)
          {
            A[k][j] = 0;
          }
 
        }
      }
    }
    
    for (int i = 0; i < m; ++i)
    {
      for (int j = 0; j < n; ++j)
      {
        if (A[i][j]==1)
        {
          for (int k = 0; k < n; ++k)
          {
            C[i][k] = 1;
          }
          for (int k = 0; k < m; ++k)
          {
            C[k][j] = 1;
          }
 
        }
      }
    }
    for (int i = 0; i < m; ++i)
    {
      for (int j = 0; j < n; ++j)
      {
        if (C[i][j] != B[i][j])
        {
          System.out.println("NO");
          return ;
        }
      }
    }
 
   System.out.println("YES");
    for (int i = 0; i < m; ++i)
    {
      for (int j = 0; j < n; ++j)
      {
        System.out.print(A[i][j]+" ");
      }
   System.out.println();
    }
}

}
