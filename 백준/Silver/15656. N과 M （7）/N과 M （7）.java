import java.util.*;

class Main {
	static int N;
	static int M;
	static int[] ans;
	static int[] num;
	static boolean[] used;
	static StringBuilder sb = new StringBuilder();

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
		recur(0);
		System.out.println(sb);
	}	
	
	static void recur(int depth) {
		if(depth==M) {
			
			for(int i=0; i<ans.length; i++) {
				sb.append(ans[i]+" ");
			}
			sb.append("\n");
			return;
		}
		
		
		
		for(int i=0; i<num.length; i++) {
			ans[depth] = num[i];
			recur(depth+1);
		}
	}
	
	
}
