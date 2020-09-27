import java.util.*;

public class ans  {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
           int t=sc.nextInt();
           while(t-->0){
        int n=sc.nextInt();
        long k=sc.nextLong();
       long arr[]=new long[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextLong();
       }

       HashMap<Long,Integer> map1=new HashMap<>();
       HashMap<Long,Integer> map2=new HashMap<>();
       int out[]=new int [n];

       for(int i=0;i<n;i++){
        if(map1.containsKey(k-arr[i])==false){
                   map1.put(arr[i],1);
                   out[i]=1;
        }
        else if(map2.containsKey(k-arr[i])==false){
            map2.put(arr[i],1);
            out[i]=0;
        }
        else{
            int k1=map1.get(arr[i]);
            int k2=map2.get(arr[i]);
            if(k1<=k2){
                map1.put(arr[i],map1.get(arr[i])+1);
                out[i]=1;
            }
            else
            {
                 map2.put(arr[i],map2.get(arr[i])+1); 
                 out[i]=0;
            }
        }


       }

       for(int i=0;i<n;i++){
        System.out.print(out[i]+" ");
       }

       System.out.println();
        
        }
    }
}