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
			    int n=sc.nextInt();
			    int k=sc.nextInt();
			    int a[]=new int[n];
 					for(int i=0;i<n;i++){
 					  a[i]=sc.nextInt();   
 					}
          int i=0;
          boolean f=true;
          int ans=-1;
 					while(i<k){
 						int j=0;
             for(j=1;j<n;j++){
                
                  if(a[j]>a[j-1]){
                  	a[j-1]+=1;
                  	ans=j;
                  	break;
                  }
             }
            
             if(j==n){
               f=false;
               break;
             }
             i++;
 					}	

 					if(f){
 						System.out.println(ans);
 					}
 					else
 						System.out.println(	"-1");

			   }
		}
}

