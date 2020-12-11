import java.util.*;
import java.io.*;
public class cf{


  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    int t=sc.nextInt();
    while(t-->0){
     
         int n=sc.nextInt();
         int k=sc.nextInt();
         String ans="";
         
         char c='a';
         for(int i=0;i<n;i++){
           ans=ans+""+c;
           c++;
           if(c=='d'){
            c='a';
           }

         }
         System.out.println(ans);
  }
  }
}
