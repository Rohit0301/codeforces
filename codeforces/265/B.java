import java.util.*;
import java.lang.*;
import java.io.*;
public class sol1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int start=a[0]+1;
        for(int i=1;i<n;i++){
            if(a[i-1]>a[i])
            	start=start+(a[i-1]-a[i])+2;
            else if(a[i-1]<a[i])
            	start=start+(a[i]-a[i-1])+2;
            else
            	start =start+2;
           
        }
        System.out.println(start);

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