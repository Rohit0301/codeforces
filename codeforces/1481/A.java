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

import java.util.*;
import java.io.*;
import java.math.*;
public class cf{
	public static void main(String[] args) throws IOException{
			Scanner sc=new Scanner(System.in);
			   int t=sc.nextInt();
			   while(t-->0){
			    int x=sc.nextInt();
			    int y=sc.nextInt();
			    String s=sc.next();
			    int n=s.length();
			    int u=0,d=0,l=0,r=0;
			    
			    for(int i=0;i<n;i++){
			        if(s.charAt(i)=='U')
			        	u++;
			         else if(s.charAt(i)=='D')
			        	d++;
			         else if(s.charAt(i)=='L')
			        	l++;
			         else if(s.charAt(i)=='R')
			        	r++;
			    }
			   
          if(x>=0 && y>=0){
               if(r>=x && u>=y){
               	System.out.println("YES");
               	continue;
               }
           }
           else if(x>=0 && y<=0){
               if(r>=Math.abs(x) && d>=Math.abs(y)){
               	System.out.println("YES");
               	continue;
               }
           }
           else if(x<=0 && y<=0)
           {
           	  if(l>=Math.abs(x) && d>=Math.abs(y)){
           	  	System.out.println("YES");
           	  	continue;
           	  }
           }
           else {
           	if(l>=Math.abs(x) && u>=Math.abs(y)){
           		System.out.println("YES");
           		continue; 
           	}
           }

           System.out.println("NO");
           
			   }
		}
}

