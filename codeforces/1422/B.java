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
      static long solve(ArrayList<Integer> arr){
        int n=arr.size();
        Collections.sort(arr);
         long res=0;
        for(int i=0;i<n;i++){
            res+=Math.abs(arr.get(i)-arr.get(n/2));
        }
        return res;
      }
   
    public static void main(String args[])throws IOException
    {
        
    Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];

        for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
                 a[i][j]=sc.nextInt();
              }   
        }

       
      ArrayList<Integer> arr=new ArrayList<>();
       int r1=0;
       int r2=n-1;
       long ans=0;
       while(r1<=r2){
        int c1=0;
        int c2=m-1;
        while(c1<=c2){
            arr.add(a[r1][c1]);
            if(r1!=r2)
                arr.add(a[r2][c1]);
            if(c1!=c2)
                arr.add(a[r1][c2]);
            if(r1!=r2 && c1!=c2)
                arr.add(a[r2][c2]);
            // System.out.println(arr);
            ans+=solve(arr);
            // System.out.println(ans);
            c1++;
            c2--;
            arr.clear();
        }
        r1++;
        r2--;
       }

   System.out.println(ans);

         
      
   }
}
}