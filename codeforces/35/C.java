import java.util.*;
import java.io.*;
public class test{
    static class Pair{
        int x;
        int y;
        Pair(int a,int b){
            x=a;
            y=b;
        }
    }

    public static void main(String[] args) throws IOException{
        solve();
    }  
     
 static boolean vis[][];
public static void solve() throws IOException{
    File f = new File("input.txt");
        Scanner sc = new Scanner(f);
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("output.txt")));
   int n=sc.nextInt();
   int m=sc.nextInt();
   int a[][]=new int[n+1][m+1];
   vis=new boolean[n+1][m+1];
   Queue<Pair> q=new LinkedList<>();
   int k=sc.nextInt();
    for(int i=0;i<k;i++){
        int c=sc.nextInt();
        int b=sc.nextInt();
       q.add(new Pair(c,b));
       vis[c][b]=true;
    }
    int z=0;
    int l=0;
    while(q.size()>0){
        Pair p=q.poll();
       
        z=p.x;
        l=p.y;
         if(p.y+1<=m && !vis[p.x][p.y+1]){
            q.add(new Pair(p.x,p.y+1));  
             vis[p.x][p.y+1]=true; 
        }
        if(p.y-1>0 && !vis[p.x][p.y-1]){
            q.add(new Pair(p.x,p.y-1));
             vis[p.x][p.y-1]=true; 
        }
        if(p.x+1<=n && !vis[p.x+1][p.y]){
            q.add(new Pair(p.x+1,p.y));
             vis[p.x+1][p.y]=true;
        }
         if(p.x-1>0 && !vis[p.x-1][p.y]){
            q.add(new Pair(p.x-1,p.y));
             vis[p.x-1][p.y]=true;
        
        }
       

        
    }
     bw.append(z + " " + l+ "\n");
    bw.flush();
    bw.close();
    
    sc.close();
         

  }
}
 
