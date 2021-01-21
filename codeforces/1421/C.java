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

  static int dp[][];
    static int solve(String s1,String s2,int n,int m){
      if(n<=0 || m<=0)
        return 0;
      if(dp[n][m]!=-1)
        return dp[n][m];
      if(s1.charAt(n-1)==s2.charAt(m-1)){
        return dp[n][m]=solve(s1,s2,n-1,m-1)+2;
      }
      else{
        return dp[n][m]= Math.max(solve(s1,s2,n-1,m)-1,solve(s1,s2,n,m-1)-1);
      }
    }
    
   
    public static void main(String args[]) throws IOException
    {
      Scanner sc=new Scanner(System.in);
     
       
            String s=sc.next();
            int n=s.length();
             int i=0;
             int j=s.length()-1;
             boolean f=true;
             int c=0;
             while(i<=j){
               if(s.charAt(i)!=s.charAt(j)){
                f=false;
                break;
               }
               i++;
               j--;
             }

             if(f){
              System.out.println("0");
             }
             else{
                   System.out.println("3");
                 System.out.println("R "+(n-1));  
                 System.out.println("L "+n);
                 System.out.println("L 2");
 
     
             }
   





      
}
}