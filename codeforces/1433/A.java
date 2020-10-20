import java.util.*;

public class sol1{

	static void solve(int n){
		if(n%1111==0){
			System.out.println(10*(n%10));
			return ;
		}
		if(n%111==0){
			System.out.println(10*((n%10)-1)+6);
			return ;
		}
		if(n%11==0){
			System.out.println(10*((n%10)-1)+3);
			return;
		}
		if(n%1==0)
		{
			System.out.println(10*((n%10)-1)+1);
			return;
		}
	}
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt();
		solve(n);
	}


	}

}