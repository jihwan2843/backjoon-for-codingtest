

import java.util.*;

class Main {
	static int[] num;
	static int ans;
	static int s;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		s = scan.nextInt();
		num = new int[n];
		for(int i=0; i<n; i++) {
			num[i] = scan.nextInt();
		}
			
		recur(0,0);
		System.out.println(ans);
		
	}
	
	public static void recur(int idx, int sum) {
		if(idx == num.length) return;
		if(sum + num[idx] == s) ans++;
		
		recur(idx+1, sum + num[idx]);
		recur(idx+1,sum);
	}

}
