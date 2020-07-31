import java.util.*;
import java.lang.*;
import java.io.*;
public class sol1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			if(n<31)
			{
				System.out.println("NO");
			}
			else
			{    
				if(n==36){
					System.out.println("YES");
					System.out.println("5 6 10 15");
				}
				else if(n==40){
					System.out.println("YES");
					System.out.println("6 9 10 15");
				}
				else if(n==44){
					System.out.println("YES");
					System.out.println("6 10 7 21");
				}
				else{

					System.out.println("YES");
				System.out.println("6 10 14 "+(n-30));
			}
			}
		}
       
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