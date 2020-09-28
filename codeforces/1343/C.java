import java.util.*;
import java.io.*;

public class ans  {


  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
             pq.add(a[0]);
             int flag=0;
             long sum=0;
             if(a[0]<0)
                flag=1;
            else flag=-1;
           for(int i=1;i<n;i++){
            
              if(flag==1 && a[i]>0){
                  sum+=pq.peek();
                  pq.clear();
                  flag=-1;
                  pq.add(a[i]);
                  if(i==n-1){
                    sum=sum+pq.peek();
                    break;
                  }
              }   
              else if(flag ==1 && a[i]<0){
                pq.add(a[i]);
                 if(i==n-1){
                    sum=sum+pq.peek();
                    break;
                  }
              }
              else if(flag==-1 && a[i]<0){
                 sum=sum+pq.peek();
                 pq.clear();
               
                 flag=1;
                 pq.add(a[i]);
                  if(i==n-1){
                    sum=sum+pq.peek();
                    break;
                  }
              }
              else if(flag==-1 && a[i]>0){
                pq.add(a[i]);
                 if(i==n-1){
                    sum=sum+pq.peek();
                    break;
                  }
              }

           }
          //  System.out.println(pq+" "+flag);
          //  long s=pq.peek();
          //  if(flag==-1 && s<0)
          //     sum+=s;
          // else if(flag==1 && s>0)
          //   sum+=s;
           if(n==1)
            System.out.println(a[0]);
        else
           System.out.println(sum);

            // long sum=0;
            // sum=a[0];
            // int flag=0;
            // long k=a[0];
            // if(k<0)
            //     flag=-1;
            // else flag=1;
            // for(int i=1;i<n;i++){
            //     if(flag==1){
            //         if(a[i]>0){
            //             if(a[i]>k)
            //             {
            //                 sum=sum-k;
            //                 k=a[i];
            //                 flag=-1;

            //             }
            //         }
            //         else
            //         {
            //             sum=sum+a[i];
            //             k=a[i];
            //             flag=-1;
            //         }
            //     }
            //     else{
                   

            //         if(a[i]<0){
            //             if(a[i]>k)
            //             {
            //                 sum=sum+k;
            //                 flag=1;
            //                 k=a[i];

            //             }
            //         }
            //         else
            //         {
            //             sum=sum+a[i];
            //             flag=1;
            //             k=a[i];
            //         }


            //     }
            // }
            // System.out.println(sum);

        }
    }
         
}