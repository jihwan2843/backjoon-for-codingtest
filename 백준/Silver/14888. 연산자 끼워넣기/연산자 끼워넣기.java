

import java.util.*;

class Main {
	static int n;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static int[] cal;
	static int[] a;

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = scan.nextInt();
		}
		cal = new int[4];
		for(int i=0; i<4; i++) {
			cal[i] = scan.nextInt();
		}
		
		recur(1, a[0]);
		System.out.println(max);
		System.out.println(min);
		
		
		
	
	}

	static void recur(int idx, int sum) {
		if(idx == n) {
			if(sum>max) {
				max = sum;
			}
			if(sum < min) {
				min = sum;
			}
			return;
		}
		
		for(int i=0; i<4; i++) {
			if(cal[i] > 0) {
				cal[i]--;
				switch(i){
				case 0: 
					recur(idx+1, sum+a[idx]);
					break;
				case 1:
					recur(idx+1, sum-a[idx]);
					break;
				case 2:
					recur(idx+1, sum*a[idx]);
					break;
				case 3:
					recur(idx+1, sum/a[idx]);
					break;
				}
				cal[i]++;
			}
			
		}
		
		
		
	}
}
