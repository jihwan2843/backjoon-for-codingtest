

import java.util.*;

class Main {
	static int[][] w;
	static int ans = Integer.MAX_VALUE;
	static int n;
	static boolean[] used;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		w = new int[n][n];
		used = new boolean[n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				w[i][j] = scan.nextInt();
			}
		}
		recur(0, 0, 0, 0);
		System.out.println(ans);
	
	}

	static void recur(int start, int idx, int sum, int cnt) {
		if(cnt == n && start == idx) {
			ans = Math.min(sum, ans);
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(!used[i] && w[idx][i]!=0) {
				used[i] = true;
				recur(start,i,sum+w[idx][i],cnt+1);
				used[i] = false;
			}
		}	
	}
}
