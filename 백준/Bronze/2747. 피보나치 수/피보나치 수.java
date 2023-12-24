

import java.util.*;

class Main {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int ans = pibo(N);
		System.out.println(ans);
	}
	static int[] piboNum = new int[46];
	static int pibo(int n) {
		if(n==1 || n==2) return 1;
		if(piboNum[n]!=0) return piboNum[n];
		
		piboNum[n] = pibo(n-1) + pibo(n-2);
		return piboNum[n];
	}
}