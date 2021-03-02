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
import java.io.FileWriter; 
import java.io.IOException; 

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

   
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int q=sc.nextInt();
	  int a[]=new int[n];
	  for(int i=0;i<n;i++){
	     a[i]=sc.nextInt();   
	   }
         int one=0,two=0;
	   for(int i=0;i<n;i++){
	       if(a[i]==1)
	       	one++;
	       else
	       	two++;
	   }
	   StringBuffer sb=new StringBuffer();
    for(int i=0;i<q;i++){
        int t=sc.nextInt();
        int x=sc.nextInt();
        if(t==2){
        	if(x<=one)
        		sb.append("1 \n");
        	else
        		sb.append("0 \n");
        }
        else{
        	if(a[x-1]==1)
        	{
        		one--;
        		two++;
        	}
        	else{
        		one++;
        		two--;
        	}
        	a[x-1]=1-a[x-1];
        }
    }
    System.out.println(sb);

	}
}