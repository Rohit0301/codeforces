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
public class cf
{
   // static class pair{
   //  int i;
   //  int v;
   //  public pair(int i, int v){
   //      this.i=i;
   //      this.v=v;
   //  }

   // }

   // static class sort implements Comparator<pair>{
   //    public int compare(pair x,pair y){
   //      return x.v-y.v;
   //    }
   // }

   
   // static int solve(int a[],int n,int N){

   //  if(n>=N ){
   //      n--;
   //    return 0;
   //  }
   //  if(dp[n]!=-1)
   //    return dp[n];
   
   //   return dp[n]= a[n]+solve(a,n+a[n],N);
   // else 
   //  return dp[n]=solve(a,n+1,N);
          
     
   // }
    static int dp[];
    public static void main(String args[])throws IOException
    {

    Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
          String s=sc.next();
          if(s.length()%2!=0)
          {
            System.out.println("NO");
            continue;
          }
          boolean flag=true;
          int x=0;
          int y=0;
          for(int i=0;i<s.length();i++){
              char ch=s.charAt(i);
              if(ch=='('){
                x++;
                if(i==s.length()-1){
                    flag=false;
                    break;
                }
              }
              else if(ch==')'){
                   if(x==0){
                     if(y==0){
                     flag=false;
                     break;
                       }
                       else{
                       y--;
                      }
                   }
                   else{
                    x--;
                   }

              }
             else{
                y++;
             } 
          }

          if(flag==false || (x+y)%2!=0){
            System.out.println("NO");
          }
          else{
            System.out.println("YES");
          }
        }
    }
       

}