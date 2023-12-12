

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {

	static boolean isExist(int[] arrayNum, int target) {
		int l = 0;
		int r = arrayNum.length-1;
		while(l<=r) {
			int m = (l+r)/2;
			if(arrayNum[m] < target) {
				l = m +1;
			}else if(arrayNum[m] > target){
				r = m-1;
			}else return true;
		}
		
		return false;
	}
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = scan.nextInt();
		}
		int[] arrNum = new int[(N*(N+1))/2];
		int index=0;
		for(int i=0; i<N; i++) {
			for(int j=i; j<N; j++) {
				arrNum[index++] = arr[i] + arr[j];
			}
		}
		Arrays.sort(arrNum);
		int ans = -1;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				int target = arr[i] - arr[j];
				if(isExist(arrNum, target)) {
					ans = Math.max(ans, arr[i]);
				}
			}
		}
		
		System.out.println(ans);
			
			
			

	}
}





