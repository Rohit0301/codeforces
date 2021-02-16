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

public class cf {
	static class pair{
		int x;
		int y;
		public pair(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   while(t-->0){
	   	int n=sc.nextInt();
	     pair a[]=new pair[n];
	     long max=0;
	     for(int i=0;i<n;i++){
	       a[i]=new pair(sc.nextInt(),i);
	       if(a[i].x>max){
	       	max=a[i].x;
	       }
	     }

	     Arrays.sort(a,(x,y)->x.x-y.x);
         
	     long b[]=new long[n];
	     b[0]=a[0].x;
	     for(int i=1;i<n;i++){
	          b[i]=b[i-1]+a[i].x;
	     }
	     
	     long ans=0,index=0;
	     for(int i=n-1;i>=1;i--){
	     	if(b[i-1]<a[i].x){
	     		index=a[i].x;
	     		break;
	     	}
	     }
	     // System.out.println(index);
	   
	     Arrays.sort(a,(x,y)->x.y-y.y);
	     for(int i=0;i<n;i++){
	       if(a[i].x>=index){
	       ans++;
	       }   
	     }
           System.out.println(ans);
	     Arrays.sort(a,(x,y)->x.y-y.y);
	     for(int i=0;i<n;i++){
	       if(a[i].x>=index){
	       	System.out.print((a[i].y)+1+" ");
	       }   
	     }
	     System.out.println();

	   }
		  
	}
}