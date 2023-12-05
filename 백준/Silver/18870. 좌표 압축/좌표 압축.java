

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {
		
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] num = new int[N];
		Set<Integer> setNum = new TreeSet<>();
		for(int i=0; i<N; i++) {
			num[i] = scan.nextInt();
			setNum.add(num[i]);
		}
		
		Map<Integer,Integer> mapNum = new HashMap<>();
		int index = 0;
		for(int x : setNum) {
			mapNum.put(x, index++);
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		for(int i=0; i < N; i++) {
			bw.write(mapNum.get(num[i])+ " ");
		}
		bw.newLine();
		bw.flush();
				
	}
}





