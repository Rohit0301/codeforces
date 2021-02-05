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
		      Long A=sc.nextLong();
		      long B=sc.nextLong();
		      int n=sc.nextInt();
		       long a[]=new long[n];
		       long b[]=new long[n];
		       long max=0;
         for(int i=0;i<n;i++){
           a[i]=sc.nextLong();
           max=Math.max(a[i],max);
         }
         for(int i=0;i<n;i++){
          b[i]=sc.nextLong();   
         }
       
         for(int i=0;i<n;i++){
            long res=(b[i]+A-1)/A;
            B-=(res*a[i]);
         }

         
         if(B+max<=0){
         	System.out.println("NO");
         }
         else{
         	System.out.println("YES");
         }

		    }
	}
}


