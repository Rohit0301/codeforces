import java.io.*;
import java.util.*;
public class PoliceStations {
    
    static class Pair{
        int dest;
        int idx;
        Pair(int a,int b){
            this.dest=a;
            this.idx=b;
        }
    }
    
    static ArrayList<ArrayList<Pair>> adjl=new ArrayList<>();
 
 
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        Reader sc=new Reader();
        int t=1;
        while(t-->0) {
            adjl.clear();
            int n=sc.nextInt();
            int m=sc.nextInt();
            int d=sc.nextInt();
            for(int i=0;i<=n;i++) {
                adjl.add(new ArrayList<>());
            }
            LinkedList<Pair> q=new LinkedList<>();
            
            for(int i=0;i<m;i++) {
                int val=sc.nextInt();
                q.addLast(new Pair(val,0));
            }
            for(int i=0;i<n-1;i++) {
                int src=sc.nextInt();
                int dest=sc.nextInt();
                adjl.get(src).add(new Pair(dest,i+1));
                adjl.get(dest).add(new Pair(src,i+1));
            }
            boolean[] vis=new boolean[n+1];
            int[] res=new int[n+1];
            
            while(!q.isEmpty()) {
                Pair cur=q.removeFirst();
                if(vis[cur.dest]==true) {
                    continue;
                }
                vis[cur.dest]=true;
                for(Pair child:adjl.get(cur.dest)) {
                    if(child.dest!=cur.idx) {
                        if(vis[child.dest]==true) {
                            res[child.idx]=1;
                        } else {
                            q.addLast(new Pair(child.dest,cur.dest));
                        }
                    }
                }
            }
            int ans=0;
            for(int i=1;i<=n-1;i++) {
                if(res[i]==1) {
                    ans++;
                }
            }
            System.out.println(ans);
            for(int i=1;i<=n-1;i++) {
                if(res[i]==1) {
                    System.out.print(i+" ");
                }
            }
        }
        sc.close();
    }
    
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
 
        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(
                new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    if (cnt != 0) {
                        break;
                    }
                    else {
                        continue;
                    }
                }
                buf[cnt++] = (byte)c;
            }
            return new String(buf, 0, cnt);
        }
 
        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
 
            if (neg)
                return -ret;
            return ret;
        }
 
        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }
 
        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
 
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
 
            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }
 
            if (neg)
                return -ret;
            return ret;
        }
 
        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0,
                                 BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
 
        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
 
        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }
 
}