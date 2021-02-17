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
	    int a[]=new int[n];
	    for(int i=0;i<n;i++){
	      a[i]=sc.nextInt();   
	     } 

	     HashMap<Integer,Integer> map=new HashMap<>();
	     for(int i=0;i<n;i++){
	       if(map.containsKey(a[i])){
	       	 map.put(a[i],map.get(a[i])+1);
	       }   
	       else{
	       	map.put(a[i],1);
	       }
	     }
          ArrayList<Integer> arr=new ArrayList<>();
          for(Map.Entry<Integer,Integer> mp:map.entrySet()){
            arr.add(mp.getValue());   
          }
          Collections.sort(arr);
           int min=Integer.MAX_VALUE;
          for(int i=0;i<arr.size();i++){
              int x=LowerBound(arr,arr.get(i));
              int y=(arr.size()-x)*arr.get(i);
              min=Math.min(min,(n-y));
          }
    	    System.out.println(min); 

	   }
		  
	}
}