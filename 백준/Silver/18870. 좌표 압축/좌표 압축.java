

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {
		
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] num = new int[N][2];
		for(int i=0; i<N; i++) {
			num[i][0] = scan.nextInt();
			num[i][1] = i;
		}
		
		Arrays.sort(num, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0] - o2[0];
			}
		});
		
		int[] compress = new int[N];
		int index = 0;
		compress[num[0][1]] = index;
		for(int i=1; i<N; i++) {
			if(num[i][0] !=num[i-1][0]) {
				compress[num[i][1]] = ++index;
			}else {
				compress[num[i][1]] = index;
			}	
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i < N; i++) {
			bw.write(compress[i] + " ");
		}
		bw.newLine();
		bw.flush();
				
	}
}





