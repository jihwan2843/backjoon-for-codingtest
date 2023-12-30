

import java.util.*;

class Main {
	static int[] parents;
	static boolean[] used;
	static List<Integer>[] tree;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		used = new boolean[n+1];
		parents = new int[n+1];
		tree = new ArrayList[n+1];
		for(int i=0; i<=n; i++) {
			tree[i] = new ArrayList<>();
		}
		for(int i=0; i<n-1; i++) {
			int node1 = scan.nextInt();
			int node2 = scan.nextInt();
			tree[node1].add(node2);
			tree[node2].add(node1);
		}		
		recur(1);
		for(int i=2; i<=n; i++) {
			System.out.println(parents[i]);
		}
		
	}
	public static void recur(int node) {
		used[node] = true;
		for(int i=0; i<tree[node].size(); i++) {
			int child = tree[node].get(i);
			if(!used[child]) {
				parents[child] = node;
				recur(child);
			}
			
		}
		
	}
}
