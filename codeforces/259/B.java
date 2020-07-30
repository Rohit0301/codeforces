import java.util.*;
import java.lang.*;
import java.io.*;
public class sol1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		int i=0;
		for(i=0;i<3;i++){
		      a[0][i]=sc.nextInt();

		}
		
		for(i=0;i<3;i++){
			a[1][i]=sc.nextInt();
		}

		for(i=0;i<3;i++){
			a[2][i]=sc.nextInt();
		}


          int sum=a[0][2]+a[2][0];


          int row0=0,row1=0,row2=0;
		for(i=0;i<3;i++)
			row0=row0+a[0][i];
		for(i=0;i<3;i++)
			row1=row1+a[1][i];

		for(i=0;i<3;i++)
			row2=row2+a[2][i];

          int diff=Math.abs(row2-row0);
          sum=sum/2;
          diff=diff/2;
          int c=sum-diff;
          int b=sum+diff;
          if(row0>row2){
          	a[0][0]=c;
          	a[2][2]=b;

          }
          else{
          	a[0][0]=b;
          	a[2][2]=c;
          }
          	

          a[1][1]=(row0+a[0][0])-row1;



		
		
		
		for(i=0;i<3;i++){
			for(int j=0;j<3;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
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