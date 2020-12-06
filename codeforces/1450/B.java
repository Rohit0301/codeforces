import java.util.*;
import java.io.*;
public class cf{

  static class pair{
    int a;
    int b;
    pair(int x,int y){
      a=x;
      b=y;
    }
  }

 static int mah(pair x,pair y){
       int c=Math.abs(x.a-y.a);
       int d=Math.abs(x.b-y.b);
       return c+d;
 }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      int k=sc.nextInt();
    pair arr[]=new pair[n];
    for(int i=0;i<n;i++){
      int a=sc.nextInt();
      int b=sc.nextInt();
      arr[i]=new pair(a,b);
    }

  boolean flag=true;
  int ans=-1;
    for(int i=0;i<n;i++){
      flag=true;
      for(int j=0;j<n;j++){
        if(mah(arr[i],arr[j])>k){
          flag=false;
          break;
        }
      }
      if(flag==true){
        ans=1;
        break;
      }
    }
    System.out.println(ans);
  }
  }
}
