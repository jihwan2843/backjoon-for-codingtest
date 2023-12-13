

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {
	static int findLowerBound(int[] ownArr, int x) {
		int l = 0;
		int r = ownArr.length-1;
		int lowerBound = ownArr.length;
		while(l<=r) {
			int m = (l+r)/2;
			if(ownArr[m] < x) {
				l = m+1;
			}else {
				r = m-1;
				lowerBound = m;
			}
		}
		return lowerBound;
	}
	
	static int findUpperBound(int[] ownArr, int x) {
		int l = 0;
		int r = ownArr.length-1;
		int upperBound = ownArr.length;
		while(l<=r) {
			int m = (l+r)/2;
			if(ownArr[m]<=x) {
				l = m+1;
			}else {
				r = m-1;
				upperBound = m;
			}
		}
		return upperBound;
	}
	
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] ownArr = new int[N];
		for(int i=0; i<N; i++) {
			ownArr[i] = scan.nextInt();
		}
		int M = scan.nextInt();
		int[] findArr = new int[M];
		for(int i=0; i<M; i++) {
			findArr[i] = scan.nextInt();
		}
		
		Arrays.sort(ownArr);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<M; i++) {
			int lowerBoundIndex = findLowerBound(ownArr, findArr[i]);
			int upperBoundIndex = findUpperBound(ownArr, findArr[i]);
			
			bw.write(upperBoundIndex-lowerBoundIndex + " ");
		}
		bw.write("\n");
		bw.flush();
		
	
		
	
		
	}
}





