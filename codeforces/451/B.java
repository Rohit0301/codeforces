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
        
        int n=sc.nextInt();
        int first[]=new int[n];
        int sec[]=new int[n];
        for(int i=0;i<n;i++){
          first[i]=sc.nextInt();  
          sec[i] =first[i];
        }
        
  Arrays.sort(sec);
    int count = 0;
    for(int i=0; i<n; i++){
        if(sec[i] == first[i]){
            count++;
        }
    }
 
    if(count == n){
       System.out.println("yes");
       System.out.println("1 1");
       return ;
    }
 
    int seg = 0;
    int l=0, r=0;
    for(int i=0; i<n-1 && seg<1;){
        if(first[i]<first[i+1]){
            i++;
        } else {
            l = i;
            r = i;
            while( i<n-1 && first[i]>first[i+1]){
                i++;
                r++;
            }
            Arrays.sort(first,l,r+1);
            
            seg++;
        }
    }
   
     boolean f=false;
    for(int i=0; i<n; i++){
        if(first[i]!=sec[i]){
          System.out.println("no");
            f=true;
            break;
        }
    }
  if(!f)
    {
      System.out.println("yes");
      System.out.println((l+1)+" "+(r+1));
    }
}
}