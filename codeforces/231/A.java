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
   static class pair{
    int i;
    int v;
    public pair(int i, int v){
        this.i=i;
        this.v=v;
    }

   }

   // static class sort implements Comparator<pair>{
   //    public int compare(pair x,pair y){
   //      return x.v-y.v;
   //    }
   // }
   
    public static void main(String args[])throws IOException
    {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=0;
        for(int i=0;i<n;i++){
           int a=sc.nextInt();
           int b=sc.nextInt();
           int c=sc.nextInt();

           int k=a+b+c;
          
           if(k>=2)
            r++;

        }
        System.out.println(r);
    //     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    //     int n=Integer.parseInt(br.readLine());
    //    HashMap<Integer,Integer> map=new HashMap<>();
    //    HashSet<Integer> set=new HashSet<>();
    //    StringBuilder sb=new StringBuilder();
    //     PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->(b.v==a.v)?( a.i-b.i): b.v-a.v);
    //      int ind=1;
    //      int a[][]=new int[n][2];
    //    for(int i=0;i<n;i++){
    //      String str[]=br.readLine().trim().split("\\s+");
    //        if(str[0].equals("1")){
    //         a[i][0]=1;
    //         a[i][1]=Integer.parseInt(str[1]);
    //        }
    //        else{
    //         a[i][0]=Integer.parseInt(str[0]);
    //        }
    //      }
    //      for(int i=0;i<n;i++){
    //      if(a[i][0]==1){
    //         map.put(ind,a[i][1]);
    //         pq.add(new pair(ind,a[i][1]));

    //         ind++;
    //      }
    //      else if(a[i][0]==2){
            
    //            Integer key = (Integer) map.keySet().toArray()[0];
    //            while(set.contains(key)==true){
    //             map.remove(key);
    //            }
    //              sb.append(key+" ");
    //              set.add(key);
    //              map.remove(key);
             
    //      }
    //      else if(a[i][0]==3){
    //         pair x=pq.poll();
    //         while(pq.size()>0 && set.contains(x.i)==true){
    //             x=pq.poll();
    //         }
    //         if(map.size()>0){
    //         set.add(x.i);    
    //         map.remove(x.i);
    //         sb.append(x.i+" ");
    //     }

    //      }

    //  }
    // System.out.println(sb);

   
}
}