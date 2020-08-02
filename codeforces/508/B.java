import java.util.*;
import java.lang.*;
import java.io.*;
 public class sol1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char a[]=s.toCharArray();
		char last1=a[s.length()-1];
		int last=Integer.parseInt(""+a[s.length()-1]);
		HashMap<Integer,Character> map =new HashMap<>();
		for(int i=0;i<s.length()-1;i++)
		{
			 int k=Integer.parseInt(a[i]+"");
			 if(k%2==0){
                map.put(i,a[i]);
			}
		}
   int index=0,flag=0;
   char value='a';
        if(map.size()==0){
        	flag=1;
        	System.out.println("-1");
        }
        else{

            for(Map.Entry<Integer,Character> mp:map.entrySet()){
            	 index=mp.getKey();
            	 value=mp.getValue();
            	int k=Integer.parseInt(value+"");
            	if(last>=k){
            		break;
            	}
            }

            int lastindex=s.length()-1;
            char temp=last1;
            a[lastindex]=value;
            a[index]=temp;
            s=String.copyValueOf(a);
            if(flag==0)
            System.out.println(s);



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