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
      
      int t=sc.nextInt();
    while(t-->0){
        int n=sc.nextInt();
        int k=sc.nextInt();
        String s=sc.next();
        ArrayList<Integer> v=new ArrayList<>();
        int w = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == 'W'){
                w++;
            }
        }
 
        if(w==0){
            
            System.out.println(Math.max(2*k-1,0));
            continue;
        }
        
        w+=k;
        if(w>=n){
            System.out.println(2*n-1);
            continue;
        }
 
        int l =0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == 'L'){
                l++;
            } else {
                v.add(l);
                l = 0;
            }
        }
 
        if(l!=0){
            v.add(l);
        }
 
        if(s.charAt(0) == 'L'){
            v.remove(0);
        }
 
        if(s.charAt(n-1) == 'L'){
            v.remove(v.size()-1);
        }
 
        Collections.sort(v);
 
        int sp = 0;
        int i;
        for(i=0; i<v.size(); i++){
            if(sp+v.get(i)>k){
                break;
            }
            sp+= v.get(i);
        }
 
        int wl = v.size()-i;
        System.out.println(2*w-wl-1);

 
  }  
}
}