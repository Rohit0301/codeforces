import java.util.*;
import java.io.*;
public class cf{

  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      int sum=0;
      int i=1;
      int count=0;
      while(sum<n){
        sum+=i;
        i++;
        count++;
      }
      // int b[]=new int[count];
      // int s=2;
      // for(int j=0;j<count;j++){
      //     b[j]=s;
      //     s++;
      // }
      
      int a=sum-n;
      if(a==0){
        System.out.println(count);
    }
    else if(a==1)
    {
      System.out.println(count+1);
    }
    else{
      System.out.println(count);
    }

    }
       
  }
}
