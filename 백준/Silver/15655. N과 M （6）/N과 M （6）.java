

import java.util.*;

class Main {
	static int N;
	static int M;
	static int[] ans;
	static int[] num;
	static boolean[] used;

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		num = new int[N];
		ans = new int[M];
		used = new boolean[N];
		for(int i=0; i<N; i++) {
			num[i] = scan.nextInt();
		}
		Arrays.sort(num);
		recur(0,0);
		
	
	}	
	
	static void recur(int depth, int index) {
		if(depth==M) {
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<M; i++) {
				sb.append(ans[i]+" ");
			}
			System.out.println(sb);
			return;
		}
		
		
		for(int i=index; i<N; i++) {
			if(!used[i]) {
				used[i] = true;
				ans[depth] = num[i];
				recur(depth+1, i+1);
				used[i] = false;
					
				
			}
		}
	}
}
