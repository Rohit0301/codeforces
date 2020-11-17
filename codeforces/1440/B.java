import java.util.*;
public class ans{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      int k=sc.nextInt();
    
    sc.nextLine();
       String s=sc.nextLine();
  
       String str[]=s.trim().split("\\s+");
       Long a[]=new Long[str.length+1];
       for(int i=0;i<str.length;i++){
          a[i]=Long.parseLong(str[i]);
       }

      int x=n/2;
      long sum=0;
     if(n%2!=0)
      x++;
    int p=n-x+1;
    int b=0;
    for(int i=(str.length-p);i>=0;i=i-p){
      
      if(b==k)
        break;
      sum+=a[i];
      b+=1;
    }
       

      System.out.println(sum);

    }
   
  }
}