import java.util.*;
import java.io.*;

public class ans  {


    public static void main(String[] args) {
     
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   
   while(t-->0){
         long n=sc.nextLong();
         solve(n);
    }
   }

   static void solve(long n){
    if(n==3){
        System.out.println("1");
        return;
    }
 
    long k=2,sum=3;

    while(n%sum!=0){
        k=k*2;
        sum+=k;
    }
 
  System.out.println(n/sum);

   }
}