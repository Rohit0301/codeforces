import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Random;
import java.io.FileWriter;
import java.io.PrintWriter;
/*
    Solution Created: 01:04:22 13/03/2020
    Custom Competitive programming helper.
*/
 
public class cf {
    public static void solve(Reader in, Writer out) {
        int n = in.nextInt();
        long[] a = in.nl(n);
        int[] b = in.na(n);
        for(int i = 0; i<n; i++) a[i] -= b[i];
        Sort.sortArray(a);
        long ans = 0;
        for(int i = 0; i<n; i++){
            long e = upperBound(a, -a[i]);
            if(e<=i) e++;
            e = n-e;
            ans+=e;
        }
        ans/=2;
        out.println(ans);
    }
    public static int upperBound(long[] array, long value) {
        int low = 0;
        int high = array.length;
        while (low < high) {
            final int mid = (low + high) / 2;
            if (value >= array[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    
    public static void main(String[] args) {
        Reader in = new Reader();
        Writer out = new Writer();
        solve(in, out);
        out.exit();
    }
 
static class Graph {
    private ArrayList<Integer> con[];
    private boolean[] visited;
 
    public Graph(int n) {
        con = new ArrayList[n];
        for (int i = 0; i < n; ++i)
            con[i] = new ArrayList();
        visited = new boolean[n];
    }
 
    public void reset() {
        Arrays.fill(visited, false);
    }
 
    public void addEdge(int v, int w) {
        con[v].add(w);
    }
 
    public void dfs(int cur) {
        visited[cur] = true;
        for (Integer v : con[cur]) {
            if (!visited[v]) {
                dfs(v);
            }
        }
    }
 
    public void bfs(int cur) {
        Queue<Integer> q = new LinkedList<>();
        q.add(cur);
        visited[cur] = true;
        while (!q.isEmpty()) {
            cur = q.poll();
            for (Integer v : con[cur]) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }
}
 
static class Reader {
    static BufferedReader br;
    static StringTokenizer st;
    private int charIdx = 0;
    private String s;
 
    public Reader() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public Reader(String f){
        try {
            this.br = new BufferedReader(new FileReader(f));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public int[] na(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }
 
    public double[] nd(int n) {
        double[] a = new double[n];
        for (int i = 0; i < n; i++)
            a[i] = nextDouble();
        return a;
    }
 
    public char nextChar() {
        if (s == null || charIdx >= s.length()) {
            if (st == null || !st.hasMoreTokens())
                try {
                    readLine();
                } catch (Exception e) {
                }
            s = st.nextToken();
            charIdx = 0;
        }
        return s.charAt(charIdx++);
    }
 
    public long[] nl(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    }
 
    public char[] nca() {
        return next().toCharArray();
    }
 
    public String[] nS(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = next();
        return a;
    }
 
    public int nextInt() {
        if (st == null || !st.hasMoreTokens())
            try {
                readLine();
            } catch (Exception e) {
            }
        return Integer.parseInt(st.nextToken());
    }
 
    public double nextDouble() {
        if (st == null || !st.hasMoreTokens())
            try {
                readLine();
            } catch (Exception e) {
            }
        return Double.parseDouble(st.nextToken());
    }
 
    public Long nextLong() {
        if (st == null || !st.hasMoreTokens())
            try {
                readLine();
            } catch (Exception e) {
            }
        return Long.parseLong(st.nextToken());
    }
 
    public String next() {
        if (st == null || !st.hasMoreTokens())
            try {
                readLine();
            } catch (Exception e) {
            }
        return st.nextToken();
    }
 
    public static void readLine() {
        try {
            st = new StringTokenizer(br.readLine());
        } catch (Exception e) {
        }
    }
}
 
static class Sort {
    static Random random = new Random();
    public static void sortArray(int[] s) {
        shuffle(s);
        Arrays.sort(s);
    }
    public static void sortArray(long[] s) {
        shuffle(s);
        Arrays.sort(s);
    }
    public static void sortArray(String[] s) {
        shuffle(s);
        Arrays.sort(s);
    }
    public static void sortArray(char[] s) {
        shuffle(s);
        Arrays.sort(s);
    }
    private static void shuffle(int[] s) {
        for (int i = 0; i < s.length; ++i) {
            int j = random.nextInt(i + 1);
            int t = s[i];
            s[i] = s[j];
            s[j] = t;
        }
    }
    private static void shuffle(long[] s) {
        for (int i = 0; i < s.length; ++i) {
            int j = random.nextInt(i + 1);
            long t = s[i];
            s[i] = s[j];
            s[j] = t;
        }
    }
    private static void shuffle(String[] s) {
        for (int i = 0; i < s.length; ++i) {
            int j = random.nextInt(i + 1);
            String t = s[i];
            s[i] = s[j];
            s[j] = t;
        }
    }
    private static void shuffle(char[] s) {
        for (int i = 0; i < s.length; ++i) {
            int j = random.nextInt(i + 1);
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
        }
    }
}
 
static class Util{
        static long[] fact;
        public static void initFactorial(int n, long mod) {
            fact = new long[n+1];
            fact[0] = 1;
            for (int i = 1; i < n+1; i++) fact[i] = (fact[i - 1] * i) % mod;
        }
        
        public static long modInverse(long a, long MOD) {
            long[] gcdE = gcdExtended(a, MOD);
            if (gcdE[0] != 1) return -1; // Inverted doesn't exist
            long x = gcdE[1];
            return (x % MOD + MOD) % MOD;
        }
 
        public static long[] gcdExtended(long p, long q) {
            if (q == 0) return new long[] { p, 1, 0 };
            long[] vals = gcdExtended(q, p % q);
            long tmp = vals[2];
            vals[2] = vals[1] - (p / q) * vals[2];
            vals[1] = tmp;
            return vals;
        }
        
        public static long nCr(int n, int r, long MOD) {
            if (r == 0) return 1;
            return (fact[n] * modInverse(fact[r], MOD) % MOD * modInverse(fact[n - r], MOD) % MOD) % MOD;
        }
        
        public static long nCr(int n, int r) {
            return (fact[n]/fact[r])/fact[n-r];
        }
        
        public static long nPr(int n, int r, long MOD) {
            if (r == 0) return 1;
            return (fact[n] * modInverse(fact[n - r], MOD) % MOD) % MOD;
        }
        
        public static long nPr(int n, int r) {
            return fact[n]/fact[n-r];
        }
        
        public static boolean isPrime(int n) { 
            if (n <= 1) return false; 
            if (n <= 3) return true; 
            if (n % 2 == 0 || n % 3 == 0) return false; 
            for (int i = 5; i * i <= n; i = i + 6) 
                if (n % i == 0 || n % (i + 2) == 0) 
                return false; 
            return true; 
        }
        
        public static int upperBound(long[] a, long v) {
            int l=0, h=a.length-1, ans = -1;
            while(l<h) {
                int mid = (l+h)/2;
                if(a[mid]<=v) {
                    ans = mid;
                    l = mid+1;
                }else h = mid-1;
            }
            return ans;
        }
        
        public static int lowerBound(long[] a, long v) {
            int l=0, h=a.length-1, ans = -1;
            while(l<h) {
                int mid = (l+h)/2;
                if(v<=a[mid]) {
                    ans = mid;
                    h = mid-1;
                }else l = mid-1;
            }
            return ans;
        }
        
        public static boolean[] getSieve(int n) {
            boolean[] isPrime = new boolean[n+1];
            for (int i = 2; i <= n; i++) isPrime[i] = true;
            for (int i = 2; i*i <= n; i++) if (isPrime[i]) 
                    for (int j = i; i*j <= n; j++) isPrime[i*j] = false;
            return isPrime;
        }
        
        public static int gcd(int a, int b) { 
            if (a == 0)  return b; 
            return gcd(b%a, a); 
        }
        
        public static void dbg(Object... o) { 
            System.out.println(Arrays.deepToString(o)); 
        }
    }
 
static class Writer {
    private PrintWriter pw;
    public Writer(){
        pw = new PrintWriter(System.out);
    }
    
    public Writer(String f){
        try {
            pw = new PrintWriter(new FileWriter(f));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void printArray(int[] a) {
        for(int i = 0; i<a.length; i++) print(a[i]+" ");
    }
    public void printlnArray(int[] a) {
        for(int i = 0; i<a.length; i++) print(a[i]+" ");
        pw.println();
    }
    public void printArray(long[] a) {
        for(int i = 0; i<a.length; i++) print(a[i]+" ");
    }
    public void printlnArray(long[] a) {
        for(int i = 0; i<a.length; i++) print(a[i]+" ");
        pw.println();
    }
    public void print(Object o) {
        pw.print(o.toString());
    }
    public void println(Object o) {
        pw.println(o.toString());
    }
    public void println() {
        pw.println();
    }
    public void flush() {
        pw.flush();
    }
    public void exit() {
        pw.close();
    }
}
}