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
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 		 int n=Integer.parseInt(br.readLine());
 		 String str[]=br.readLine().trim().split("\\s+");
 		 int k1=Integer.parseInt(str[0]);
 		  	ArrayList<Integer> a=new ArrayList<>();
 		 	ArrayList<Integer> b=new ArrayList<>();
 		 ArrayList<Integer> arr=new ArrayList<>();
 		 for(int i=0;i<k1;i++){
 		 	    arr.add(Integer.parseInt(str[i+1]));
 		 	    a.add(arr.get(i));
 		 	}	
 		 	ArrayList<Integer> brr=new ArrayList<>();
 		 	String st[]=br.readLine().trim().split("\\s+");
     int k2=Integer.parseInt(st[0]);
     for(int i=0;i<k2;i++){
 		 	    brr.add(Integer.parseInt(st[i+1]));
 		 	    b.add(brr.get(i));
 		 	}

 		
 		 	int count=0;
 		 	while(true){
 		 		if(a.size()==0){
 		 			System.out.println(count+" 2");
 		 			break;
 		 		}
 		 		else if(b.size()==0){
 		 			System.out.println(count+" 1");
 		 			break;
 		 		}
         int x=a.get(0);
         int y=b.get(0);
         
         if(x<y){
         	b.add(x);
         	b.add(y);
         	b.remove(0);
         	a.remove(0);
         }
         else{
         	a.add(y);
         	a.add(x);
         	b.remove(0);
         	a.remove(0);
         }
         count++;
         boolean f=true;
        
         // if(a.size()==arr.size()){
         // 	 for(int i=0;i<a.size();i++){
         // 	 	 if(a.get(i)!=arr.get(i)){
         // 	 	 	 f=false;
         // 	 	 	 break;
         // 	 	 }
         // 	 }
         // 	  if(f==true){
         // 	System.out.println("-1");
         // 	 return;
         // }
         // }

         if(count>10000){
         	System.out.println("-1");
         	return;
         }
        
 		 	}
	}
}

