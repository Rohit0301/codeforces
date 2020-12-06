import java.util.*;
import java.io.*;
public class cf{

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    int t=sc.nextInt();
    while(t-->0){
    int n=sc.nextInt();
    String s=sc.next();
    char ar[]=new char[n];
    for(int i=0;i<n;i++){
      ar[i]=s.charAt(i);
    } 
    // int j=n-1;
    // for(int i=n-1;i>=0;i--){
    //    if(ar[i]!='t'){
    //     j=i;
    //     break;
    //    }
    // }
    for(int i=0;i<n;i++){
      char temp;
      for(int j=n-1;j>=0;j--){
        if(ar[i]=='t' && ar[j]!='t'){
          temp=ar[i];
          ar[i]=ar[j];
          ar[j]=temp;
          break;
       }
      }
       
    }

    StringBuilder br=new StringBuilder();
    for(int i=0;i<n;i++){
         br.append(ar[i]+"");
    }
    System.out.println(br);
  }
  }
}
