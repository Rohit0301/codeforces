import java.util.*;
public class cf{
 
  // public static int  solve(ArrayList<Long> a,int n){
    
      
  // }
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){

    int n=sc.nextInt();
    long a[]=new long[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextLong();
    long b[]=new long[n];
    for(int i=0;i<n;i++){
      boolean flag=false;
        int j=1;
        while(j<=a[i]){
          if(j==a[i]){
            flag=true;
            break;
          }
          j=j*2;
        }
         
        if(flag==true){
          b[i]=j;
        }
        else{
          b[i]=j/2;
        }

    }
    for(int i=0;i<n;i++){
      System.out.print(b[i]+" ");
    }
    System.out.println();

    }
}
}