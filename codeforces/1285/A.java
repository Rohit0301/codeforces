import java.util.*;
import java.lang.*;
import java.io.*;
public class sol{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
	  String s=sc.next();
	  int l=0,r=0;
	  for(int i=0;i<t;i++){
	  	if(s.charAt(i)=='L')
	  		l++;
	  	else
	  		r++;
	  }

	
	  int ans=l+r+1;
System.out.println(ans);


	}
}





















// BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
// 		int n=Integer.parseInt(br.readLine());
// 		String str=br.readLine();
// 		String str1[]=str.trim().split("\\s+");
// 		int monkey[]=new int[n];
// 		int chadMonkey[]=new int[n];
// 		int freq[]=new int[10];
// 		for(int i=0;i<n;i++){
// 			monkey[i]=Integer.parseInt(str1[i]);
// 		}