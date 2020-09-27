import java.util.*;

public class ans  {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
           int t=sc.nextInt();
           while(t-->0){
        int n=sc.nextInt();
        int b=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
        
        Arrays.sort(arr);
        int sum=0;
       for(int i=1;i<n;i++){
           
           int s=b-arr[i];
           if(s>0){
           int p=s/arr[0];
           sum+=p;
       }
       }
  System.out.println(sum);
        }
    }
}