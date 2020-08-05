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
      

			System.out.println(func(a,n));
		}
	}

	public static int func(int a[],int n){
 
    if(n==1){
    	return 0;
    }
    if(n==2)
    	return 1;

           int count=0;
           int max=0;
           int prev=0;
           Arrays.sort(a);
           int sum=a[n-1]+a[n-2];
           int min=a[0]+a[1];
           int b[]=new int[n];
           for(int i=min;i<=sum;i++){
           	count=0;
           	b=fill(a,b);
               for(int j=0;j<n-1;j++){
               	for(int k=j+1;k<n;k++)
               	{

               		if((a[j]+b[k]==i) && b[j]!=-1 && b[k]!=-1){
                        count++;
                        b[k]=-1;
                        break;
               		}
               	}


               }
               if(max<count)
               	max=count;
              // System.out.println(i+"  "+count);

           }		
           return max;
	}

	public static int[] fill(int a[],int b[]){
	
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
       return b;
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
// 		}import java.util.*;
// import java.lang.*;
// import java.io.*;
//  public class sol1{
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);

// 		int t=sc.nextInt();
// 		while(t-->0){
// 			int n=sc.nextInt();
// 			int a[]=new int[n];
			
// 			for(int i=0;i<n;i++)
// 				a[i]=sc.nextInt();

// 			if(func(a,n)==true)
// 				System.out.println("Yes");
// 			else
// 				System.out.println("No");
// 		}
// 	}

// 	public static boolean func(int a[],int n){

// 		if(n==1)
// 			return true;
// 		Arrays.sort(a);
// 		for(int i=0;i<n-1;i++){
// 			if(a[i+1]-a[i]>1)
// 				return false;
// 		}
// 		return true;
// 	}
// }




















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
















	// Scanner sc=new Scanner(System.in);

	// 	int t=sc.nextInt();
	// 	while(t-->0){
	// 		int n=sc.nextInt();
	// 		long a[]=new long[n];
	// 		long b[]=new long[n];

	// 		for(int i=0;i<n;i++)
	// 			a[i]=sc.nextLong();
 //             for(int i=0;i<n;i++)
	// 			b[i]=sc.nextLong();

	// 		System.out.println(func(a,b,n));
	// 	}
	// }

	// public static long func(long a[],long b[],int n){
 
 //           long mina=mini(a);
 //           long minb=mini(b);
 //           long sum=0;
 //           for(int i=0;i<n;i++){
 //               sum=sum+Math.max(a[i]-mina,b[i]-minb);
 //           }		
 //           return sum;
	// }

	// public static long mini(long a[]){
	// 	long min=Long.MAX_VALUE;
	// 	for(int i=0;i<a.length;i++)
	// 	{
	// 		if(a[i]<min){
	// 			min=a[i];
	// 		}
	// 	}
	// 	return min;
	// }