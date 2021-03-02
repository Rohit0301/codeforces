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
	      int t=sc.nextInt();
	      while(t-->0){
	       int n=sc.nextInt();
	       int u=sc.nextInt();
	       int v=sc.nextInt();
	       int a[]=new int[n];
	       HashSet<Integer> set=new HashSet<>();
	       for(int i=0;i<n;i++){
	         a[i]=sc.nextInt();   
	         set.add(a[i]);
	       }

	       if(set.size()==1){
	       	 if((u+v)<=(v+v)){
	       	 	System.out.println(u+v);
	       	 }
	       	 else{
	       	 	System.out.println(v+v);
	       	 }
	       }
	       else{
	       	boolean f=false;
	       	 for(int i=0;i<n-1;i++){
	       	     if(Math.abs(a[i]-a[i+1])>=2){
	       	     	System.out.println("0");
	       	     	f=true;
	       	     	break;
	       	     }
	       	 }
	       	 if(!f){
	       	 	if(u<=v)
	       	 		System.out.println(u);
	       	 	else
	       	 		System.out.println(v);
	       	 }
	       }

     }

	}
}