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

    public static void main(String args[]) throws IOException
    {
       Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
          String s=sc.next();
          int x=sc.nextInt();
          int n=s.length();

          int a[]=new int[s.length()];
          for(int i=0;i<a.length;i++){
            a[i]=1;   
          }
          for(int i=0;i<s.length();i++){
              if(s.charAt(i)=='0'){
                if(i+x<n){
                  a[i+x]=0;
                }
                if(i-x>=0){
                  a[i-x]=0;
                }
              }
          }
         boolean f=false;
         for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='1'){
             if(i+x<n && a[i+x]==1){
              continue;
             }
             if(i-x>=0 && a[i-x]==1){
              continue;
             }
             f=true;
             break;
           }
         }

       StringBuffer sb=new StringBuffer();
         if(f){
          System.out.println("-1");
         }
         else{
            for(int i=0;i<a.length;i++){
                   sb.append(a[i]+"");
               }
               System.out.println(sb);
         }
 
        }
}
}