

import java.util.*;

class Main {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] arr = new int[N];
		for(int i=0; i< N; i++) {
			arr[i] = scan.nextInt();
		} 
		Arrays.sort(arr);
		
		int ansMinus = arr[N-1] - arr[0];
		int right = 0;
		for(int i=0; i<N-1; i++) {
			while(arr[right]-arr[i] < M && right<N-1) {
				right++;
			}
			if(arr[right]-arr[i] >=M) {
				ansMinus = Math.min(ansMinus, arr[right]-arr[i]);
				
			}
			
		}
		System.out.println(ansMinus);
	}
}