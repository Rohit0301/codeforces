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

import java.io.*;
import java.util.*;
public class cf
{
   // static class pair{
   //  int i;
   //  int v;
   //  public pair(int i, int v){
   //      this.i=i;
   //      this.v=v;
   //  }

   // }

   // static class sort implements Comparator<pair>{
   //    public int compare(pair x,pair y){
   //      return x.v-y.v;
   //    }
  //  // }

  // static  HashMap<String,Integer> map;
  //  static int solve(int a[],int n,int m,int x){
  //   String temp=n+" "+m+" "+x;
  //   if(n<0 || m<0){
  //       return 0;
  //   }
  //   if(map.containsKey(temp)){
  //      return map.get(temp);
  //   }
  //   if(Math.min(a[n],a[m])<=x){
  //       int i= solve(a,n-1,m-1,Math.min(a[n],a[m]))+1;
  //        map.put(temp,i);
  //       int j=solve(a,n,m-1,x);
  //        map.put(temp,Math.max(map.get(temp),j));
  //        int k= solve(a,n-1,m-1,x);
  //         map.put(temp,Math.max(map.get(temp),k));

  //       return Math.max(i,Math.max(j,k));
  //   }
  //   else{
  //       int i= solve(a,n,m-1,x);
  //       map.put(temp,i);
  //       int j=solve(a,n-1,m-1,x);
  //       map.put(temp,Math.max(map.get(temp),j));
  //       return Math.max(i,j);
  //   }  
     
   // }
    // static int dp[];
     public static long gcd(long a,long b){
        if(b==0)
        return a;
        return gcd(b,a%b);
     }
     public static long lcm(long a,long b){
        long gcd=gcd(a,b);
        if(gcd==0)
         return 0;
         
      return a*b/gcd;
     }
    public static void main(String args[])throws IOException
    {

    
         Scanner sc=new Scanner(System.in);
              int t=sc.nextInt();
              while(t-->0){
               int n=sc.nextInt();
               int m=sc.nextInt();
               sc.nextLine();
               String s1=sc.nextLine();
               String s2=sc.nextLine();

               int c1[]=new int[27];
               int c2[]=new int[27];
               for(int i=0;i<n;i++){
                 c1[s1.charAt(i)-'a']++;  
                 c2[s2.charAt(i)-'a']++;    
               }
             
             
               boolean f = false;
            for(int j = 25; j >= 0; j--)
            {
                c1[j] += c1[j + 1];
                c2[j] += c2[j + 1];
                if(c1[j] > c2[j] || (c2[j] - c1[j]) % m != 0)
                    f = true;
            }
               if(f)
                System.out.println("NO");
               else 
                System.out.println("YES");
               

              }
           
        }
    
       

}