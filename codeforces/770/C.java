
import java.util.*;
 
public class Online_Courses_In_BSU {
 
	static Scanner in = new Scanner(System.in);
	static Map<Integer, List<Integer>> adj;
	static int n;
	static int k;
	static int[] vis;
	static List<Integer> ans;
	static List<Integer> courses;
	
	public static void main(String[] args) {
		
		n = in.nextInt();
		k = in.nextInt();
		adj = new HashMap<>();
		vis = new int[n];
		ans = new ArrayList<>();
		courses = new ArrayList<>();
		
		for(int i = 0; i < k; i++)courses.add(in.nextInt() - 1);
		
		for(int i = 0; i < n; i++) {
			int s = in.nextInt();
			adj.put(i, new ArrayList<>());
			for(int j = 0; j < s; j++) {
				adj.get(i).add(in.nextInt()-1);
			}
		}
		
		if(!tSort()) System.out.println("-1");
		else {
			System.out.println(ans.size());
			for(int x : ans) System.out.print(x+1 + " ");
		}
		
	}
	
	public static boolean tSort() {
		for(int x : courses) {
			if(vis[x] == 0 && !dfs(x)) return false;
		}
		return true;
	}
	
	public static boolean dfs(int n) {
		
		vis[n] = 1;
		
		for(int x : adj.get(n)) {
			if(vis[x] == 0 && !dfs(x) || vis[x] == 1) {
				return false;
			}
		}
		//System.out.println(n);
		vis[n] = 2;
		ans.add(n);
		return true;
	}
}