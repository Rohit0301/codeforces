import java.util.*;
public class cf{
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
       long k=sc.nextLong();
       boolean flag=false;
       while(flag==false){
        long n=k;
        while(n!=0){
        long r=n%10;
        if(r!=0){
            if(k%r!=0){
                flag=true;
                break;
            }
        }
        n=n/10;
       }

       if(flag==false){
        break;
       }
       if(flag==true){
        flag=false;
        k=k+1;
       }
   }
   System.out.println(k);
    }
    
}
}