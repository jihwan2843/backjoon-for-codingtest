

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {
		
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] num = new int[N][2];
	
		for(int i=0; i<(N); i++) {
			num[i][0] = scan.nextInt();
			num[i][1] = scan.nextInt();
		}
		
		Arrays.sort(num, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[1]==o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}	
		});
		
		
		
		int count =1;
		int endNum = num[0][1];
		for(int i=1; i<N; i++) {
			if(num[i][0] < endNum) {
				continue;
			}else {
				count++;
				endNum = num[i][1];
			}
			
		}
		System.out.println(count);
		
		
		
		
		
		
			
	}
}





