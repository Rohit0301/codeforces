import java.util.*;
public class ans{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
     String s=sc.next();
     int start1=0;
     int start2=0;
     int count=0;
     for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='('){
        start1++;
      }

     else if(s.charAt(i)=='['){
      start2++;
     }
     else if(s.charAt(i)==')')
     {
      if(start1>0)
      {
        start1--;
        count++;
      }
     }
     else if(s.charAt(i)==']')
     {
       if(start2>0)
       {
        start2--;
        count++;
       }
     }
   }
   System.out.println(count);

    }
   
  }
}