import java.util.*;
public class cf{
    static int par[];
    public  static int f(int x){
          if(par[x]==x)
            return x;
        return par[x]=f(par[x]);
    }

    public static boolean merge(int x,int y){
        if(f(x)==f(y)){
            return true;
        }
        else{
            par[x]=y;
          return false;
        }
    }
   public static void main(String[] args) {
     
       Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            par=new int[n];
            for(int i=0;i<n;i++){
             par[i]=i;   
            }
            int ans=0;
            for(int i=0;i<m;i++){
                int x=sc.nextInt();
                int y=sc.nextInt();
                x--;
                y--;
                if (x==y) {
                    continue;
                }
                 ans++;
                 if(merge(x,y)==true){
                    ans++;
                 }
            }
            System.out.println(ans);
         }
   }
}