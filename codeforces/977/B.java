import java.util.*;
import java.lang.*;
import java.io.*;
public class sol{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int count=0,max=0;
		String ans="";
		for(int i=0;i<n-1;i=i+1){
			count=0;
			for(int j=0;j<n-1;j++)
			{
				if(s.substring(i,i+2).equals(s.substring(j,j+2))){
					count++;

				}
			}
			//System.out.println(s.substring(i,i+2)+" "+count+" "+max);
			if(count>max){
						max=count;
						ans=s.substring(i,i+2);
					}
			}
			System.out.println(ans);
		}
}