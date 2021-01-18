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
    public static void main(String args[])throws IOException
    {

    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            String st[]=br.readLine().trim().split("\\s+");
            int n=Integer.parseInt(st[0]);
            int k=Integer.parseInt(st[1]);
            String str[]=br.readLine().trim().split("\\s+");
             ArrayList<Integer> arr=new ArrayList<>();
               for(int i=0;i<n;i++){
                  arr.add(Integer.parseInt(str[i])); 
               }
          Collections.sort(arr,Collections.reverseOrder());
         if(k==0){
            System.out.println(arr.get(0)-arr.get(n-1));
            continue;
        }
        long sum = arr.get(0);
        int  i = 1;
        while(i<=k && i<n){
            sum+= arr.get(i);
            i++;
        }
        System.out.println(sum);
          

          
           
        }
    }
       

}