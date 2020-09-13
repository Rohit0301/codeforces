import java.util.*;
public class twins{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }

        Arrays.sort(a);
        int temp=0,count=0;
        int half=sum/2;
        for(int i=n-1;i>=0;i--){
            temp+=a[i];
            count++;
            if(temp>half){
                break;

            }
        }
        System.out.println(count+"");

    }
    
}