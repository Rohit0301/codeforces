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
       
            int n=Integer.parseInt(br.readLine());
            String str[]=br.readLine().trim().split("\\s+");
             ArrayList<Integer> arr=new ArrayList<>();
               for(int i=0;i<n;i++){
                  arr.add(Integer.parseInt(str[i])); 
               }
          Collections.sort(arr);
           int a=arr.get(n-1);
           int j=n-2;
           while(j>0)
           {
            if(a%arr.get(j)!=0){
                break;
            }
            else{
                if(j>0 && (arr.get(j)==arr.get(j-1) || arr.get(j)==a)){
                    break;
                }
            }
            j--;
           }

           System.out.println(a+" "+arr.get(j));

          
           
        }
    
       

}