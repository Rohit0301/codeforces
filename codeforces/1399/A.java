import java.util.*;
import java.lang.*;
import java.io.*;
 public class sol1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();

			if(func(a,n)==true)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

	public static boolean func(int a[],int n){

		if(n==1)
			return true;
		Arrays.sort(a);
		for(int i=0;i<n-1;i++){
			if(a[i+1]-a[i]>1)
				return false;
		}
		return true;
	}
}




















// BufferedReader br=new Buffln(eredReader(new InputStreamReader(System.in));
		
// 		int n=Integer.parseInt(br.readLine());
// 		String str=br.readLine();
// 		String str1[]=str.trim().split("\\s+");
// 		int monkey[]=new int[n];
// 		int chadMonkey[]=new int[n];
// 		int freq[]=new int[10];
// 		for(int i=0;i<n;i++){
// 			monkey[i]=Integer.parseInt(str1[i]);
// 		}