/*
 
                       /$$$$$  /$$$$$$  /$$    /$$  /$$$$$$          
                       |__  $$ /$$__  $$| $$   | $$ /$$__  $$         
                          | $$| $$  \ $$| $$   | $$| $$  \ $$         
                          | $$| $$$$$$$$|  $$ / $$/| $$$$$$$$         
                     /$$  | $$| $$__  $$ \  $$ $$/ | $$__  $$         
                    | $$  | $$| $$  | $$  \  $$$/  | $$  | $$         
                    |  $$$$$$/| $$  | $$   \  $/   | $$  | $$         
                     \______/ |__/  |__/    \_/    |__/  |__/         
                                                                      
                                                                      
                                                                      
                      /$$$$$$   /$$$$$$  /$$$$$$$  /$$$$$$$$ /$$$$$$$ 
                     /$$__  $$ /$$__  $$| $$__  $$| $$_____/| $$__  $$
                    | $$  \__/| $$  \ $$| $$  \ $$| $$      | $$  \ $$
                    | $$      | $$  | $$| $$  | $$| $$$$$   | $$$$$$$/
                    | $$      | $$  | $$| $$  | $$| $$__/   | $$__  $$
                    | $$    $$| $$  | $$| $$  | $$| $$      | $$  \ $$
                    |  $$$$$$/|  $$$$$$/| $$$$$$$/| $$$$$$$$| $$  | $$
                     \______/  \______/ |_______/ |________/|__/  |__/
                                                                      
                                                  
                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                   
 
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
 
 
////////////////////////////////////**********Code-Start**********/////////////////////////////////////////////////    
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        sc = new InputReader(inputStream);
        pw = new PrintWriter(outputStream);
        solve();
        pw.close();
    }
   // static ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
   // static PriorityQueue<Integer> pq=new PriorityQueue<>();
    public static void solve() {
          int t=s(0);
          while(t-->0){
            int n=s(0);
            int dp[][]=new int[n][n];

            int cur=1;
            int i=0;
            while(i<n){
                 for(int j=i%2;j<n;j+=2){
                   dp[i][j]=cur;
                cur+=1;
                 }
               i+=1;  
            }
             boolean f=true;
            i=1;
            while(i<=n){
                 for(int j=i%2;j<n;j+=2){
                  dp[i-1][j]=cur;
                  cur++;
                 }
                 i++;
            }
            for( i=0;i<n;i++){
                for(int j=0;j<n;j++){
                      if(i-1>=0 && abs(dp[i-1][j]-dp[i][j])==1){
                         f=false;
                         break;
                      }
                      if(j-1>=0 && abs(dp[i][j-1]-dp[i][j])==1){
                         f=false;
                         break;
                      }
                      if(i+1<n && abs(dp[i+1][j]-dp[i][j])==1){
                         f=false;
                         break;
                      }
                      if(j+1<n && abs(dp[i][j+1]-dp[i][j])==1){
                         f=false;
                         break;
                      }

                   } 
                   if(!f){
                    break;
                   }  
            }
            if(!f){
                System.out.println("-1");
            }
            else{
                for( i=0;i<n;i++){
                   for(int j=0;j<n;j++){
                        System.out.print(dp[i][j]+" ");
                      }   
                      System.out.println();
                }
            }
          }

   }

   
  
    
    
  

     
////////////////////////////////////**********Code-End**********//////////////////////////////////////////////////
    
 
    // Arrays.sort(a,(c,b)->(c.x==b.x)?c.y-b.y:c.x-b.x); sort the array ont the basis of y if x1==x2
    // set precision --> String.format("%.df",ans);  
 
    static InputReader sc;
    static PrintWriter pw;
    static ArrayList<ArrayList<Integer>> adj;
    static int mod=1000000007;
    static int mod1= 998244353;
    static int max(int ...a){int m=a[0];for(int e:a)m=(m>=e)?m:e;return m;}
    static int min(int ...a){int m=a[0];for(int e:a)m=(m<=e)?m:e;return m;}
    static int abs(int a){return Math.abs(a);}
    static long max(long ...a){long m=a[0];for(long e:a)m=(m>=e)?m:e;return m;}
    static long min(long ...a){long m=a[0];for(long e:a)m=(m<=e)?m:e;return m;}
    static long abs(long a){return Math.abs(a);}
 
    static void subset(int a[],int n,ArrayList<Integer> arr){
        if(n==a.length){
            System.out.println(arr);
            return;
        }
        ArrayList<Integer> b=new ArrayList<>();
        ArrayList<Integer> c=new ArrayList<>();
        b.addAll(arr);
        c.addAll(arr);
        b.add(a[n]);
        subset(a,n+1,b);
        subset(a,n+1,c);
     }
 
 
    static boolean prime[];
    static int smallestFactor[];
    static ArrayList<Integer> allPrimes;
    static void sieveOfEratosthenes(int n)
    {
        prime = new boolean[n+1];
        smallestFactor = new int[n+1];
        allPrimes=new ArrayList<>();
        smallestFactor[1] = 1;
        for(int i=2;i<n;i++) {
            prime[i] = true;
            smallestFactor[i] = i;
        }
 
        for(int p = 2; p*p <=n; p++)
        {
            if(prime[p])
            {
                smallestFactor[p] = p;
                for(int i = p*p; i <= n; i += p) {
                    prime[i] = false;
                    smallestFactor[i] = Math.min(p,smallestFactor[i]);
                }
            }
        }

        for(int i=0;i<prime.length;i++){
            if(prime[i]){
                allPrimes.add(i);
            }
        }
 
    }
    // static void initial(int n){
    //    for(int i=0;i<=n;i++){
    //        arr.add(new ArrayList<>());
    //    }
    // }
     static int sum(int n){
      int sum=0;
      while(n!=0){
        sum+=n%10;
        n/=10;
      }
      return sum;
   }
     static void sort(ArrayList<Integer> brr){
        Collections.sort(brr);
    }
  static void Lsort(ArrayList<Long> arr){
        Collections.sort(arr);
    }
    static void sort(int[] arr){
        Arrays.sort(arr);
    }
     static void Lsort(long[] arr){
        Arrays.sort(arr);
    }
    static boolean isperfect(double number)    
    {   
        double sqrt=Math.sqrt(number);  
        return ((sqrt - Math.floor(sqrt)) == 0);   
    }   
 
    static boolean isPrime(long n){
        if(n<2){
            return false;
        }
        for(int i = 2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
 static int lowerBound(int[] arr, int low, int high, long element) {
        int middle;
        while (low < high) {
            middle = low + (high - low) / 2;
            if (element > arr[middle])
                low = middle + 1;
            else
                high = middle;
        }
        if (low < arr.length && arr[low] < element)
            return -1;
        return low;
    }
 
   static  int upperBound(int[] arr, int low, int high, long element) {
        int middle;
        while (low < high) {
            middle = low + (high - low) / 2;
            if (arr[middle] > element)
                high = middle;
            else
                low = middle + 1;
        }
        if (low<arr.length &&arr[low] <= element)
            return -1;
        return low;
    }
 
    public static String sortString(String inputString) 
    { 
        char tempArray[] = inputString.toCharArray(); 
        Arrays.sort(tempArray); 
        return new String(tempArray); 
    } 
 
    public static int ask(int l, int r){
        System.out.println("? "+l+" "+r);
        System.out.flush();
        return sc.nextInt();
    }
    public static void swap(char []chrr, int i, int j){
        char temp=chrr[i];
        chrr[i]=chrr[j];
        chrr[j]=temp;
    }
    public static void swap(int []chrr, int i, int j){
        int temp=chrr[i];
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
    public static boolean isPowerOfTwo(long x){
        return x!=0 && ((x&(x-1)) == 0);
    }
   
    static long gcd(long a, long b) {
        if (b == 0) 
            return a; 
        return a>b?gcd(b, a % b):gcd(a, b % a);  
    } 
    public static long lcm(long a , long b )
    {
        long gc = gcd(a,b);
        return (a/gc)*b;
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
    public static String reverse(String input)
    {
        StringBuilder str  = new StringBuilder("") ;
 
        for(int i =input.length()-1 ; i >= 0  ; i-- )
        {
            str.append(input.charAt(i));
        }
 
        return str.toString() ;
    }
    
    public static long nCr(int n,int k)
    {
        long ans=1L;
        k=k>n-k?n-k:k;
        int j=1;
        for(;j<=k;j++,n--)
        {
            if(n%j==0)
            {
                ans*=n/j;
            }else
            if(ans%j==0)
            {
                ans=ans/j*n;
            }else
            {
                ans=(ans*n)/j;
            }
        }
        return ans;
    }
    public static long kadanesAlgorithm(long[] arr)
    {
    
        if(arr.length == 0)return  0 ;
        
          long[] dp = new long[arr.length] ;
          
          dp[0] = arr[0] ;
          long max =  dp[0] ;
          
          
          for(int i = 1; i <  arr.length ; i++)
          {
                if(dp[i-1] > 0)
                {
                      dp[i] = dp[i-1] + arr[i] ;
                }
                else{
                      dp[i] = arr[i] ;
                }
                
                if(dp[i] >  max)max = dp[i] ;
                
          }
          
          return max  ;
      
    }
   
    private static int countDigits(int l) {
            if (l >= 1000000000) return 10;
            if (l >= 100000000) return 9;
            if (l >= 10000000) return 8;
            if (l >= 1000000) return 7;
            if (l >= 100000) return 6;
            if (l >= 10000) return 5;
            if (l >= 1000) return 4;
            if (l >= 100) return 3;
            if (l >= 10) return 2;
            return 1;
        }
 
        private static int countDigits(long l) {
            if (l >= 1000000000000000000L) return 19;
            if (l >= 100000000000000000L) return 18;
            if (l >= 10000000000000000L) return 17;
            if (l >= 1000000000000000L) return 16;
            if (l >= 100000000000000L) return 15;
            if (l >= 10000000000000L) return 14;
            if (l >= 1000000000000L) return 13;
            if (l >= 100000000000L) return 12;
            if (l >= 10000000000L) return 11;
            if (l >= 1000000000L) return 10;
            if (l >= 100000000L) return 9;
            if (l >= 10000000L) return 8;
            if (l >= 1000000L) return 7;
            if (l >= 100000L) return 6;
            if (l >= 10000L) return 5;
            if (l >= 1000L) return 4;
            if (l >= 100L) return 3;
            if (l >= 10L) return 2;
            return 1;
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
        for(int i=0;i<arr.length;++i)
            arr[i]=sc.nextLong();
    }
    public static void feedArr(double []arr){
        for(int i=0;i<arr.length;++i)
            arr[i]=sc.nextDouble();
    }
    public static void feedArr(int []arr){
        for(int i=0;i<arr.length;++i)
            arr[i]=sc.nextInt();
    }
    public static void feedArr(String []arr){
        for(int i=0;i<arr.length;++i)
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
 
 
// smallest lcm(a,b) => a+b=n will be n/smallPrimefactor ans n-n/smallestprimefactor.
 