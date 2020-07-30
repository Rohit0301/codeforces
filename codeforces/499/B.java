import java.util.*;
import java.lang.*;
import java.io.*;
public class sol1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,String> map=new HashMap<>();
          int n=sc.nextInt();
          int m=sc.nextInt();

          for(int i=0;i<m;i++){
          	String a=sc.next();
          	String b=sc.next();
          	if(a.length()<=b.length())
          		map.put(b,a);
          	else
          		map.put(a,b);
          }
                  sc.nextLine();
              String st=sc.nextLine();

          String str[]=st.trim().split("\\s+");
          for(int i=0;i<n;i++){
          	if(map.containsKey(str[i]))
          		System.out.print(map.get(str[i])+" ");
          	else
          		System.out.print(str[i]+" ");
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