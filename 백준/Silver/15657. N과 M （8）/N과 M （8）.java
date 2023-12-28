

import java.util.*;

class Main {
	static int n;
	static int m;
	static int[] num;
	static int[] ans;
	static boolean[] used;

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		num = new int[n];
		for(int i=0; i<n; i++) {
			num[i] = scan.nextInt();
		}
		ans = new int[m];
		used = new boolean[n];
		
		Arrays.sort(num);
		
		recur(0, 0);
		System.out.println(sb);
	}
	static StringBuilder sb = new StringBuilder();
	static void recur(int depth, int idx) {
		if(depth==m) {
			
			for(int i=0; i<m; i++) {
				sb.append(ans[i]+" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=idx; i<n; i++) {
			ans[depth] = num[i];
			recur(depth+1, i);
			
		}
	}
}
