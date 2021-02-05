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
public class cf{
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);

		 	 int n=sc.nextInt();
		 	 int a[]=new int[n];	
		 	 for(int i=0;i<n;i++){
		 	   a[i]=sc.nextInt();   
		 	 }
		 	 HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();

		 	 for(int i=0;i<n;i++){
		 	   if(map.containsKey(a[i])){
		 	   	ArrayList<Integer> arr=new ArrayList<>();
		 	   	arr=map.get(a[i]);
		 	   	arr.set(0,arr.get(0)+1);
		 	   	arr.set(2,Math.max(i,arr.get(2)));
		 	   	map.put(a[i],arr);
		 	   }   
		 	   else{
		 	   	ArrayList<Integer> arr=new ArrayList<>();
		 	   	arr.add(1);
		 	   	arr.add(i);
		 	   	arr.add(i);
		 	   	map.put(a[i],arr);
		 	   }
		 	 }
        int max=0;
        int res=Integer.MAX_VALUE;
        int l=0,r=0;
		 	 for(Map.Entry<Integer,ArrayList<Integer>> mp:map.entrySet()){
		 	      int key=mp.getKey();
		 	      ArrayList<Integer> arr=new ArrayList<>();
		 	      arr=mp.getValue();
		 	      if(arr.get(0)>max){
		 	      	max=arr.get(0);
		 	      	res= arr.get(2)-arr.get(1);
		 	      	l=arr.get(1);
		 	      	r=arr.get(2);
		 	      }
		 	      else if(arr.get(0)==max && (arr.get(2)-arr.get(1))<res){
		 	      	res= arr.get(2)-arr.get(1);
		 	      	l=arr.get(1);
		 	      	r=arr.get(2);
		 	      }
		 	 }
   l++;
   r++;
     System.out.println(l+" "+r);
	}
}

