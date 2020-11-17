import java.util.*;
public class ans{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      int c0=sc.nextInt();
      int c1=sc.nextInt();
      int h=sc.nextInt();
      String s=sc.next();
      int count0=0,count1=0;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='0'){
          count0++;
        }
        else{
          count1++;
        }
      }

      int res=count0*c0+count1*c1;
      int x=count1;
      int y=count0;
      int temp0=count0,temp1=count1;
      for(int i=1;i<=x;i++){
        temp0++;
        temp1--;
        int r=(temp0*c0+temp1*c1)+(i*h);
        res=Math.min(res,r);
      }

      temp0=count0;
      temp1=count1;
      for(int i=1;i<=y;i++){
         temp0--;
        temp1++;
        int r=(temp0*c0+temp1*c1)+(i*h);
        res=Math.min(res,r);
      }

      System.out.println(res);

    }
   
  }
}