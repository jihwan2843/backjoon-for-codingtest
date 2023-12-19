

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {
	
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] aArray = new int[N];
		int[] bArray = new int[M];
		for(int i=0; i<N; i++) {
			aArray[i] = scan.nextInt();
		}
		for(int i=0; i<M; i++) {
			bArray[i] = scan.nextInt();
		}
		
		Arrays.sort(aArray);
		Arrays.sort(bArray);
		int[] ansArray = new int[N+M];
		int a = 0;
		int b = 0;
		int ans = 0;
		while(a < N && b < M) {
			if(aArray[a]>bArray[b]) {
				ansArray[ans++] = bArray[b++];
			}else {
				ansArray[ans++] = aArray[a++];
			}
		}
		while(a<N) ansArray[ans++] = aArray[a++];
		while(b<M) ansArray[ans++] = bArray[b++];
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int x : ansArray) {
			bw.write(x+" ");
		}
		bw.write("\n");
		bw.flush();
			
	}
}