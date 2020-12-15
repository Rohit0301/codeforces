import java.util.*;
public class cf{
 
  public static String solve(int n){
     if(n<=9)
      return ""+n;
    if (n>45)
      return "-1";

    int a[]={1,2,3,4,5,6,7,8,9};
    if(n>9 && n<=17){
    for(int i=0;i<9;i++){
      for(int j=1;j<9;j++){
        if(a[i]+a[j]==n){
          return a[i]+""+a[j];
        }
      }
    }
  }

  if(n>17 && n<=24){
    for(int i=0;i<9;i++){
      if(a[i]+17==n){
        return a[i]+"89";
      }
    }
  }

  if(n>24 && n<=30){
    for(int i=0;i<9;i++){
      if(a[i]+24==n){
        return a[i]+"789";
      }
    }
  }

  if(n>30 && n<=35){
    for(int i=0;i<9;i++){
      if(a[i]+30==n){
        return a[i]+"6789";
      }
    }
  }
 if(n>35 && n<=39)
  for(int i=0;i<9;i++){
      if(a[i]+35==n){
        return a[i]+"56789";
      }
    }
   if(n>39 && n<=42)
    for(int i=0;i<9;i++){
      if(a[i]+39==n){
        return a[i]+"456789";
      }
    }
     
     if(n==43)
      return "13456789";
    if(n==44)
      return "23456789";
    if(n==45){
      return "123456789";
    }
 return "-1";

  }
  public static int gcd(int a,int b){
     if(b==0)
      return a;
    return gcd(b,a%b);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      System.out.println(solve(n));
    }
}
}