

import java.util.*;

class Main {
	static int[] ans;
	static int[] num;
	static boolean[] used;
	static int N,M;

	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		num = new int[N];
		used = new boolean[N];
		ans = new int[M];
		
		for(int i=0; i <N; i++) {
			num[i] = scan.nextInt();
		}
		Arrays.sort(num);
		recur(0);
		
	
	}
	static void recur(int depth) {
		if(depth==M) {
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<M; i++) {
				sb.append(ans[i]+" ");
			}
			System.out.println(sb);
			return;
		}
		
		
		
		
		for(int i=0; i<N; i++) {
			if(!used[i]) {
				used[i] = true;
				ans[depth] = num[i];
				recur(depth+1);
				used[i] = false;
			}
		}
		
	}
}
