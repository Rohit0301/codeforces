import java.util.*;
public class cf{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      int q=sc.nextInt();
      String s=sc.next();
      String ans="NO";
      for(int j=0;j<q;j++){
        ans="NO";
        int a=sc.nextInt();
        int b=sc.nextInt();
       
          for(int i=0;i<a-1;i++){
              if(s.charAt(i)==s.charAt(a-1)){
                
                ans="YES";
                break;
              }
          }

          for(int i=b;i<s.length();i++){
            if(s.charAt(i)==s.charAt(b-1)){
              ans="YES";
              
              break;
            }
          }
          System.out.println(ans);
      }

    }
   
  }
}