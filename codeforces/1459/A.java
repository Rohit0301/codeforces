import java.util.*;
public class cf{
 
  // public static int  solve(ArrayList<Long> a,int n){
    
      
  // }
  class pair{
    int a;
    int b;
    public pair(int a,int b){
      this.a=a;

    }
  }
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){

   int n=sc.nextInt();
   String s=sc.next();
   String s1=sc.next(); 
   int a=0,b=0;
    for(int i=0;i<n;i++){
        if(s.charAt(i)>s1.charAt(i)){
          a++;
        }
        else if(s.charAt(i)<s1.charAt(i)){
          b++;
        }
    }
    if(a>b){
      System.out.println("RED");
    }
    else if(b>a){
      System.out.println("BLUE");
    }
    else{
      System.out.println("EQUAL");
    }

    }
}
}