import java.util.*;
public class cf{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      long n=sc.nextLong();
      int count=0;
      if(n==1l)
        count=0;
      else if(n==2l)
        count=1;
      else if(n==3l)
        count=2;
      else if(n%2!=0)
        count=3;
      else if(n%2==0)
        count=2;
      System.out.println(count);

    }
   
  }
}