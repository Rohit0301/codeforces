import java.util.*;
import java.lang.*;
import java.io.*;
public class sol1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Character,Integer> map=new HashMap<>();
          String s=sc.next();
          int n=sc.nextInt();
          char x='a';
          for(int i=0;i<26;i++){
          	map.put(x,sc.nextInt());
          	x++;
          }

          int sum=0;
          for(int i=1;i<=s.length();i++){
          	sum=sum+i*map.get(s.charAt(i-1));
          }

          int max=0;
          for(Map.Entry<Character,Integer> mp:map.entrySet()){
          	if(max<mp.getValue()){
          		max=mp.getValue();
          	}
          }
         
          int sum1=0;
          for(int i=s.length()+1;i<=s.length()+n;i++){
                 sum1=sum1+i;
          }
          sum1=sum1*max;
         
          System.out.print(sum1+sum);



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