import java.util.*;
import java.io.*;
public class cf{
  
  public static void main(String[] args)throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      while(t-->0){
        long result=0;
        String s[]=br.readLine().trim().split("\\s+");
         int n=Integer.parseInt(s[0]);
          int m=Integer.parseInt(s[1]);
          String s1[]=br.readLine().trim().split("\\s+");
          String s2[]=br.readLine().trim().split("\\s+");
         ArrayList<Integer> arr=new ArrayList<>();
         ArrayList<Integer> brr=new ArrayList<>();
            for(int i=0;i<n;i++){
              arr.add(Integer.parseInt(s1[i]));   
            }

            
            for(int i=0;i<m;i++){
                brr.add(Integer.parseInt(s2[i]));   
            }
            Collections.sort(arr,Collections.reverseOrder());

             int i=0;
             int j=0;
            while(i<n){
              if(arr.get(i)-1<j) {
                result=result+brr.get(arr.get(i)-1);
              }
              else{
              result+=brr.get(i);
              j++;
            }
              i++;


            }
            System.out.println(result);

             


       }
 }
}