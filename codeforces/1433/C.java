import java.util.*;

public class sol1{

	static void solve(int n,int a[]){
         int f=a[0];
         int count=1;
         for(int i=1;i<n;i++){
            if(a[i]==f){
            	count++;
            }
         }
         if(count==n){
         	System.out.println("-1");
         	return;
         }

         int max=0;
         for(int i=0;i<n;i++){
         	if(a[i]>max)
         		max=a[i];
         }
         
         if(a[0]==max && a[1]<a[0])
         {
         	System.out.println("1");
         	return ;
         }
         if(a[n-1]==max && a[n-1]>a[n-2])
         {
         	System.out.println(n);
         	return;
         }
         for(int i=1;i<n-1;i++){
            if(a[i]==max && (a[i]>a[i-1] || a[i]>a[i+1])){
            	System.out.println(i+1);
            	return;
            }
         }
	}
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		solve(n,a);
	}


	}

}