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
     
      
         int n=sc.nextInt();
         int a[]=new int[n];
         HashMap<Integer,Integer> map=new HashMap<>();
         for(int i=0;i<n;i++){
          a[i]=sc.nextInt(); 
          if(map.containsKey(a[i])==true)
           map.put(a[i],map.get(a[i])+1);
           else{
             map.put(a[i],1);
           }    
         } 
        boolean f=true;
         for(Map.Entry<Integer,Integer> mp:map.entrySet()){
            int x=mp.getKey();
            int y=mp.getValue();
            int z=(int)Math.ceil(n/2.0);

            if(y>z){
              f=false;
              break;
            }

         }

         if(f){
          System.out.println("YES");
         }
         else{
            System.out.println("NO");
         }

         
          





      
}
}