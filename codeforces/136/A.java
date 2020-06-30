import java.util.*;
import java.lang.*;
import java.io.*;
public class dp{
 
	public static void main (String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     HashMap<Integer,Integer> map=new HashMap<>();
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     	arr[i]=sc.nextInt();
     for(int i=0;i<n;i++){
     	map.put(arr[i],i+1);
     }
     for(Map.Entry<Integer,Integer> mp:map.entrySet())
     	System.out.print(mp.getValue()+" ");


	}
// 	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
// Scanner sc=new Scanner(System.in);
//         int t=sc.nextInt();
//         while(t-->0){
//         	int n = sc.nextInt();
//         	int m=sc.nextInt(); 
//             String a=sc.next();
//             String b=sc.next();

//       for (int i=0;i<n+1 ;i++ ) {
//       for (int j=0;j<m+1 ;j++ ) {
//         Dp[i][j]=-1;
//       }
   
      
//     }
//             int answer=lcs(a,b,n,m);
//             System.out.println(answer);
//         }
// 	}
// 	public static int lcs(String a,String b,int n,int m){
// 		if(n==0 || m==0)
// 			return 0;
// 		if(Dp[n][m]!=-1)
// 			return Dp[n][m];
// 		lcs(a,b,n-1,m);
// 		lcs(a,b,n,m-1);
// 		if(a.charAt(n-1)==b.charAt(m-1))
// 			{
// 				Dp[n][m] =lcs(a,b,n-1,m-1) + 1;
//     ans = Math.max(ans, Dp[n][m]);
//     return Dp[n][m];
// 			}
// 		else
// 			return Dp[n][m]=0;

//   }
	
  }
