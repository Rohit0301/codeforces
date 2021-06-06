import java.util.*;
public class test{
    static int dp[][];
    static int mod=1000000007;
    static Set<Integer> set=new TreeSet<>();
     static int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int t=sc.nextInt();
            while(t-->0){ 
           int n=sc.nextInt();
           String s=sc.next();
           StringBuilder sb=new StringBuilder();
           HashMap<String,Integer> map=new HashMap<>();
                  int a=0,b=0;
                  for(int i=0;i<n;i++){
                        if(s.charAt(i)=='D')
                           a++;
                        if(s.charAt(i)=='K')
                           b++;

                       int c=gcd(a,b);

                       String sp="";
                       sp=(a/c)+","+(b/c);
                       if(map.containsKey(sp)){
                        map.put(sp,map.get(sp)+1);
                       }      
                       else{
                        map.put(sp,1);
                       } 
                      sb.append(map.get(sp)+" ");
                  }
                  System.out.println(sb);
                  

      }
    }

    
     
}