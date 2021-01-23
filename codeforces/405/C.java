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
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
      int n=Integer.parseInt(br.readLine());  
      int a[][]=new int[n+1][n+1];
    for(int i=1; i<=n; i++){
      String str[]=br.readLine().trim().split("\\s+");  
        for(int j=1; j<=n; j++){
           a[i][j]=Integer.parseInt(str[j-1]);  
        }
    }
 
    int ans = 0;
    for(int i=1; i<=n; i++){
        ans^= a[i][i];
    }
 
    int q=Integer.parseInt(br.readLine()); 
    StringBuffer sb=new StringBuffer();
    while(q-->0){
      String st[]=br.readLine().trim().split("\\s+");  
        int t=Integer.parseInt(st[0]); 
        if(t!=3){
           int x=Integer.parseInt(st[1]); 
            ans^= 1;
        } else {
            sb.append(ans);
        }
    }
    System.out.println(sb);

}
}