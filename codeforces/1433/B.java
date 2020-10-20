import java.util.*;

public class sol1{

	static void solve(int n,int a[]){

     if(n==1){
     	System.out.println("0");
     	return ;
     }

     boolean possible=false;
     boolean find=false;
     int count=0;
     int finalcount=0;

     for(int i=0;i<n;i++){
        
        if(a[i]==1 && find==false){
           find=true;
        }
        else if(find==true && a[i]==0){
        	count++;
        }
        else if(find==true && a[i]==1 && count>=1){
              finalcount+=count;
              count=0;
          
        }
     }
     System.out.println(finalcount);


	}
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		solve(n,a);
	}


	}

}