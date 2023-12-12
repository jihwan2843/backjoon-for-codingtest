

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {
	public static boolean isExist(String[] arr, String x) {
		int l = 0;
		int r = arr.length-1;
		while(l<=r) {
			int m = (l + r) /2;
			int compareResult = arr[m].compareTo(x);
			if(compareResult < 0) {
				l = m+1;
			}else if(compareResult > 0) {
				r = m-1;
			}else {
				return true;
			}
		}
		return false;
	}
		
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		String[] S = new String[N];
		String[] comp = new String[M];
		for(int i=0; i<N; i++) {
			S[i] = scan.next();
		}
		for(int i=0; i<M; i++) {
			comp[i] = scan.next();
		}
		Arrays.sort(S);
		int result = 0;
		for(int i=0; i<M; i++) {
			if(isExist(S,comp[i])) {
				result++;
			}
		}
		System.out.println(result);
		

	}
}





