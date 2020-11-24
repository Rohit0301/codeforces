import java.util.*;
import java.io.*;
public class cf{
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0){
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
      for(int i=0;i<=n+5;i++){
        arr.add(new ArrayList<Integer>());
      }
       for(int i=0;i<n;i++){
        arr.get(a[i]).add(i+1);
       } 
       
        ArrayList<Integer> ar=new ArrayList<>();
        int count=0;
        int  min=Integer.MAX_VALUE;
        int m=0;
        boolean flag=true;
        for(int j=1;j<arr.size();j++){
         ar=arr.get(j);
         flag=true;
         if(ar.size()==0)
          continue;
         // ar.add(0,1);
         // ar.add(n);
         count=0;
         // System.out.println(ar);
         for(int i=0;i<ar.size();i++){
          if(i==0){
            if(Math.abs(ar.get(i)-1)>=1)
              count++;
            if(i==ar.size()-1){
              if(ar.get(i)!=n){
              count++;
            }
            }
          }
          else{
          if(i==ar.size()-1){
            if(ar.get(i)!=n){
              count++;
            }
          }
           if(Math.abs(ar.get(i)-ar.get(i-1))>1){
            count++;
          }
        }
          
        }

        // System.out.println(count+" "+j);
          if(flag==false){
            break;
          }
          else{
            if(min>count)
              min=count;
          }
        
        
        }
        System.out.println(min);
      }
    }
}