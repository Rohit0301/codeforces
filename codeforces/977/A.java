import java.util.*;
import java.lang.*;
import java.io.*;
public class sol{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		int k=sc.nextInt();
		for(int i=0;i<k;i++){
			if(n%10!=0){
				n=n-1;
			}
			else{
				String s=""+n;
				n=Integer.parseInt(s.substring(0,s.length()-1));
			}
		}
		System.out.println(n);
	}
}