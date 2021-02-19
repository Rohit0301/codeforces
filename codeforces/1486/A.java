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

public class cf {
	static class pair{
		int x;
		int y;
		public pair(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
	static int LowerBound(ArrayList<Integer> a, int x) { 
	  int l=-1,r=a.size();
	  while(l+1<r) {
	    int m=(l+r)>>>1;
	    if(a.get(m)>=x) r=m;
	    else l=m;
	  }
	  return r;
   }
   static int UpperBound(int a[], int x) {
    int l=-1,r=a.length;
    while(l+1<r) {
       int m=(l+r)>>>1;
       if(a[m]<=x) l=m;
       else r=m;
    }
    return l+1;
  }

	public static void main(String[] args) {
	 
       Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
       		    while(t-->0){
       		       int n=sc.nextInt();
       		       long a[]=new long[n];
       		       for(int i=0;i<n;i++){
       		          a[i]=sc.nextLong();  
       		       } 
                   long j=0;
                   long next=0;
                   boolean f=true;
       		       for(int i=0;i<n-1;i++){
       		           if(a[i]>=j){
       		           	a[i+1]+=(a[i]-j);
       		           	a[i]=j;
       		           }
       		           else{
	       		          
	       		           	f=false;
	       		          
       		           }
       		           j++;
       		       }

       		       if(f==false || (n>1 && a[n-1]<=a[n-2]))
       		       	 System.out.println("NO");
       		       	else
       		       		System.out.println("YES");
       		    }

	}
}