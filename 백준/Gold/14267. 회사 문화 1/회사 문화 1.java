

import java.util.*;

class Main {
	static int[] parents;
	static List<Integer>[] tree;
	static int[] like;

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		parents = new int[n+1];
		like = new int[n+1];
		tree = new ArrayList[n+1];
		
			
		
		
		for(int i=1; i<=n; i++) {
			tree[i] = new ArrayList<>();
			parents[i] = scan.nextInt();
			if(parents[i]==-1) continue;
			tree[parents[i]].add(i);
		}
		
		for(int i=0; i<m; i++) {
			int emp = scan.nextInt();
			int point= scan.nextInt();
			like[emp] += point;
		}
		Like(1);
		for(int i=1; i<=n; i++) {
			System.out.print(like[i]+" ");
		}
		
	}
	
	public static void Like(int n) {
		
		
		for(int child : tree[n]) {
			like[child] +=like[n];
			Like(child);
		}
		
	}

}
