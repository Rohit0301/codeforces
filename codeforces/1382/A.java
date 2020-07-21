import java.util.*;
import java.lang.*;
public class cs{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int arr[]=new int[n];
			int brr[]=new int[m];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			for(int i=0;i<m;i++)
				brr[i]=sc.nextInt();
			int flag=0,ans=0;
			for(int i=0;i<n;i++){
                        for(int j=0;j<m;j++)
                        {
                        	if(arr[i]==brr[j]){
                        		flag=1;
                        		ans=arr[i];
                        		break;
                        	}

                        }
                        if(flag==1)
                        	break;
			}
			if(flag==1){
				System.out.println("Yes");
				System.out.println("1"+" "+ans);
			}
			else
				System.out.println("No");
		}
	}
}