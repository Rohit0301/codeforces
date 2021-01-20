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
   //  long x;
   //  Long y;
   //  public pair(long x,long y){
   //      this.x=x;
   //      this.y=y;
   //  }
   // }
    
   
    public static void main(String args[]) throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
      int n=Integer.parseInt(br.readLine());
      String str[]=br.readLine().trim().split("\\s+");
      int a[]=new int[n];

      for(int i=0;i<n;i++){
           a[i]=Integer.parseInt(str[i]);  
      }  
      
     ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
     for(int i=0;i<100001;i++){
             arr.add(new ArrayList<Integer>());  
     }
    
      for(int i=0;i<n;i++){
           arr.get(a[i]).add(i);
      }

     ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
      for(int i=0;i<arr.size();i++){
        if(arr.get(i).size()==0)
          continue;
        else{
          ArrayList<Integer> b=new ArrayList<>();
            for(int j=1;j<arr.get(i).size();j++){
              b.add(arr.get(i).get(j)-arr.get(i).get(j-1));
            }
            if(arr.get(i).size()==1){
              b.add(0);
            }
            // if(b.size()==1)
            // {
            //    ArrayList<Integer> r=new ArrayList<>();
            //     r.add(i);
            //     r.add(b.get(0));
            //     ans.add(r);
             
            // }
            // else{
             
              HashSet<Integer> set=new HashSet<>();
             for(int j=0;j<b.size();j++){
                    set.add(b.get(j));
             }
             if(set.size()==1){
                ArrayList<Integer> p=new ArrayList<>();
                p.add(i);
                p.add(b.get(0));
                ans.add(p);
              
             }
           }
        
      }

      System.out.println(ans.size());
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<ans.size();i++){
        sb.append(ans.get(i).get(0)+" "+ans.get(i).get(1)+" \n");
         
      }
      System.out.println(sb);

}
}