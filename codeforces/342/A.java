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
   //  long x;
   //  Long y;
   //  public pair(long x,long y){
   //      this.x=x;
   //      this.y=y;
   //  }
   // }
    
   
    public static void main(String args[])
    {
      
      Scanner sc=new Scanner(System.in);
      
          int n=sc.nextInt();
           int a[]=new int[n];
           for(int i=0;i<n;i++){
             a[i]=sc.nextInt();   
           }

           Arrays.sort(a);
           ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
           boolean f=true;
           if(n%3!=0)
           {
             f=false;
           }
           else{
              int m=n/3;
          
              for(int i=0;i<m;i++){
                  ArrayList<Integer> b=new ArrayList<>();
                  int y=a[i];
                  int z=a[i+m];
                  int c=a[i+2*m];
                  if(y<z && z<c && z%y==0 && c%z==0){
                    b.add(y);
                    b.add(z);
                    b.add(c);
                    arr.add(b);
                  }
                  else{
                    f=false;
                    break;
                  }
              }
           }
   
        if(f){
          for(int i=0;i<arr.size();i++){
              System.out.println(arr.get(i).get(0)+" "+arr.get(i).get(1)+" "+arr.get(i).get(2));
          }
        }
        else
        {
          System.out.println("-1");
        }

      
        
  
   
}
}