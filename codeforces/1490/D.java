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
	static void solve(List<Integer> arr,int x){
		if(arr.size()==0)
			return;
		int max=0;
		for(int i=0;i<arr.size();i++){
			if(arr.get(i)>max){
				max=arr.get(i);
			}
 		}
 		map.put(max,x+1);
 		int p=arr.indexOf(max);
 		solve(arr.subList(0,p),x+1);
 		solve(arr.subList(p+1,arr.size()),x+1);
	}
	static ArrayList<ArrayList<Integer>> arr;
	static HashMap<Integer,Integer> map;
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   while(t-->0){
	   	int n=sc.nextInt();
	     int a[]=new int[n];
	     ArrayList<Integer> arr=new ArrayList<>();
	     map=new HashMap<>();
	     for(int i=0;i<n;i++){
	        arr.add(sc.nextInt());   
	     }
         solve(arr,-1);
	     for(int i=0;i<n;i++){
	         System.out.print(map.get(arr.get(i))+" ");
	     }
	     System.out.println();


	   }
		  
	}
}