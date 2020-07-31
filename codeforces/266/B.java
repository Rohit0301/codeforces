import java.util.*;
import java.lang.*;
import java.io.*;
 public class sol1{
	private static char c[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		String s=sc.next();
		c=s.toCharArray();
       for(int j=0;j<m;j++){
       	for(int i=1;i<n;i++){
       		if(c[i]=='G' && c[i-1]=='B')
       		{
       			swap(i,i-1);
       	        i++;
       		}
       	}
       }
       System.out.print(String.copyValueOf(c));
       
}
   public static void swap(int i,int j){
   	char temp=c[i];
   	c[i]=c[j];
   	c[j]=temp;
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