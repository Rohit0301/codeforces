/*

    /$$$$$  /$$$$$$  /$$    /$$  /$$$$$$                                                                  
   |__  $$ /$$__  $$| $$   | $$ /$$__  $$                                                                 
	  | $$| $$  \ $$| $$   | $$| $$  \ $$                                                                 
	  | $$| $$$$$$$$|  $$ / $$/| $$$$$$$$                                                                 
 /$$  | $$| $$__  $$ \  $$ $$/ | $$__  $$                                                                 
| $$  | $$| $$  | $$  \  $$$/  | $$  | $$                                                                 
|  $$$$$$/| $$  | $$   \  $/   | $$  | $$                                                                 
 \______/ |__/  |__/    \_/    |__/  |__/                                                                 
 /$$$$$$$  /$$$$$$$   /$$$$$$   /$$$$$$  /$$$$$$$   /$$$$$$  /$$      /$$ /$$      /$$ /$$$$$$$$ /$$$$$$$ 
| $$__  $$| $$__  $$ /$$__  $$ /$$__  $$| $$__  $$ /$$__  $$| $$$    /$$$| $$$    /$$$| $$_____/| $$__  $$
| $$  \ $$| $$  \ $$| $$  \ $$| $$  \__/| $$  \ $$| $$  \ $$| $$$$  /$$$$| $$$$  /$$$$| $$      | $$  \ $$
| $$$$$$$/| $$$$$$$/| $$  | $$| $$ /$$$$| $$$$$$$/| $$$$$$$$| $$ $$/$$ $$| $$ $$/$$ $$| $$$$$   | $$$$$$$/
| $$____/ | $$__  $$| $$  | $$| $$|_  $$| $$__  $$| $$__  $$| $$  $$$| $$| $$  $$$| $$| $$__/   | $$__  $$
| $$      | $$  \ $$| $$  | $$| $$  \ $$| $$  \ $$| $$  | $$| $$\  $ | $$| $$\  $ | $$| $$      | $$  \ $$
| $$      | $$  | $$|  $$$$$$/|  $$$$$$/| $$  | $$| $$  | $$| $$ \/  | $$| $$ \/  | $$| $$$$$$$$| $$  | $$
|__/      |__/  |__/ \______/  \______/ |__/  |__/|__/  |__/|__/     |__/|__/     |__/|________/|__/  |__/
																																																					
																																																					

*/

import java.util.*;
import java.io.*;
import java.math.*;
import java.io.FileWriter; 
import java.io.IOException; 
public class cf{
	static class Pair{
		int x;
		int y;
		public Pair(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
    static InputReader sc;
    static PrintWriter pw;
////////////////////////////////////Code Start/////////////////////////////////////////////////    
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        sc = new InputReader(inputStream);
        pw = new PrintWriter(outputStream);
        solve();
        pw.close();
    }
   
    public static void solve() {
      
        int t=s(0);
        while(t-->0){
        	int n=s(0);
        	String s=s("s");
            StringBuilder a=new StringBuilder();
            StringBuilder b=new StringBuilder();
           boolean sad=false;
		    for(int i=0;i<n;i++){
		      if(sad){
		        a.append(0);
		        b.append(s.charAt(i));
		      }else{
		        if(s.charAt(i)=='0'){
		          a.append(0);
		          b.append(0);
		        }else if(s.charAt(i)=='1'){
		          a.append(1);
		          b.append(0);
		          sad=true;
		        }else{
		          a.append(1);
		          b.append(1);
		        }
		      }
		    }
            System.out.println(a);
            System.out.println(b);

        }

     
}
  
////////////////////////////////////Code End//////////////////////////////////////////////////
	 static int LowerBound(ArrayList<Integer> a, int x) { 
		  int l=-1,r=a.size();
		  while(l+1<r) {
		    int m=(l+r)>>>1;
		    if(a.get(m)>=x) r=m;
		    else l=m;
		  }
		  return r;
	   }
    static int UpperBound(int a[], int x) {
	    int l=-1,r=a.length;
	    while(l+1<r) {
	       int m=(l+r)>>>1;
	       if(a[m]<=x) l=m;
	       else r=m;
	    }
	    return l+1;
	  }

    public static long atMostK(char []chrr, int k){
        if(k<0)
            return 0;
        int l=0,cnt=0;
        long ans=0l;
        for(int i=0;i<chrr.length;i++){
            if(chrr[i]=='1')
                cnt++;
            while(cnt>k){
                if(chrr[l++]=='1')
                    cnt--;
            }
            ans+=(long)(i-l)+1l;
        }
        return ans;
    }
    public static int ask(int l, int r){
        System.out.println("? "+l+" "+r);
        System.out.flush();
        return sc.nextInt();
    }
    public static void sort(long []arr){
        ArrayList<Long> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
            list.add(arr[i]);
        Collections.sort(list);
        for(int i=0;i<arr.length;i++)
            arr[i]=list.get(i);
    }
    public static void swap(char []chrr, int i, int j){
        char temp=chrr[i];
        chrr[i]=chrr[j];
        chrr[j]=temp;
    }
    public static int countSetBits(int n){
        int a=0;
        while(n>0){
            a+=(n&1);
            n>>=1;
        }
        return a;
    }
   

    static boolean isPrime(int n) { 
        if (n <= 1) 
            return false; 
        if (n <= 3) 
            return true; 
        if (n % 2 == 0 || n % 3 == 0) 
            return false; 
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false; 
        return true; 
    } 
    static long gcd(long a, long b) { 
        if (b == 0) 
            return a; 
        return a>b?gcd(b, a % b):gcd(a, b % a);  
    } 
    static long fast_pow(long base,long n,long M){
        if(n==0)
           return 1;
        if(n==1)
        return base;
        long halfn=fast_pow(base,n/2,M);
        if(n%2==0)
            return ( halfn * halfn ) % M;
        else
            return ( ( ( halfn * halfn ) % M ) * base ) % M;
    }
    static long modInverse(long n,long M){
        return fast_pow(n,M-2,M);
    }
    public static int s(int n){
        return sc.nextInt();
    }
    public static long s(long n){
        return sc.nextLong();
    }
    public static String s(String n){
        return sc.next();
    }
    public static double s(double n){
        return sc.nextDouble();
    }
    public static void p(int n){
        pw.print(n);
    }
    public static void p(long n){
        pw.print(n);
    }
    public static void p(String n){
        pw.print(n);
    }
    public static void p(double n){
        pw.print(n);
    }
    public static void pln(int n){
        pw.println(n);
    }
    public static void pln(long n){
        pw.println(n);
    }
    public static void pln(String n){
        pw.println(n);
    }
    public static void pln(double n){
        pw.println(n);
    }
    public static void feedArr(long []arr){
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextLong();
    }
    public static void feedArr(double []arr){
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextDouble();
    }
    public static void feedArr(int []arr){
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
    }
    public static void feedArr(String []arr){
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.next();
    }
    public static String printArr(int []arr){
        StringBuilder sbr=new StringBuilder();
        for(int i:arr)
            sbr.append(i+" ");
        return sbr.toString();
    }
    public  static String printArr(long []arr){
        StringBuilder sbr=new StringBuilder();
        for(long i:arr)
            sbr.append(i+" ");
        return sbr.toString();
    }
    public static String printArr(String []arr){
        StringBuilder sbr=new StringBuilder();
        for(String i:arr)
            sbr.append(i+" ");
        return sbr.toString();
    }
    public static String printArr(double []arr){
        StringBuilder sbr=new StringBuilder();
        for(double i:arr)
            sbr.append(i+" ");
        return sbr.toString();
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
 
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }
        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
