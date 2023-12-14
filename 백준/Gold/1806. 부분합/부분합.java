

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {
	
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int S = scan.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = scan.nextInt();
		}
		
		int sum = arr[0];
		int shortest = N+1;
		int right = 0;
		for(int left=0; left<N; left++) {
			
			while(sum < S && right < N-1) {
				sum += arr[++right];
			}
				
			if(sum >= S) {
				shortest = Math.min(shortest, right-left+1);
			}
			sum-=arr[left];
				
		}
		if(shortest > N) {
			shortest = 0;
		}
		System.out.println(shortest);
	}
}





