import java.util.*;
public class cf{
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
         int n=sc.nextInt();
          long x=sc.nextLong();
         long a[]=new long[n];
         long sum=0;
         for(int i=0;i<n;i++){
           a[i]=sc.nextLong(); 
           sum+=a[i];
         }
          int count=0;
          int min=Integer.MAX_VALUE;
          for(int i=0;i<n;i++){
            long b=a[i];   
            count=1;
            while(b%x==0){
             count++;
             b/=x;
           }
           if(count<min)
            min=count;
          }
          // System.out.println(min);
         for(int i=0;i<n;i++){
           long b=a[i];
           long c=a[i];
           if(b%x!=0){
            break;
           }
           count=0;
           while(b%x==0){
             count++;
             b/=x;
           }
           if(count<=min){
           sum+=c*count;
           min=count;
            }
            else{
              sum+=c*min;
            }

         }
         System.out.println(sum);



       }
 }
}