

import java.util.*;

class Main {
	static int baseToIndex(char dna) {
		if(dna=='A') {
			return 0;
		}else if(dna=='C') {
			return 1;
		}else if(dna=='G') {
			return 2;
		}else if(dna=='T') {
			return 3;
		}
		return -1;
	}
	static boolean isValid(int[] target, int[] condition) {
		for(int i=0; i<4; i++) {
			if(target[i]<condition[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int S = scan.nextInt();
		int P = scan.nextInt();
		String dna = scan.next();
		int[] condition = new int[4];
		for(int i=0; i< 4; i++) {
			condition[i] = scan.nextInt();
		}
		int[] target = new int[4];
		for(int i=0; i<P-1; i++){
			target[baseToIndex(dna.charAt(i))]++;
			
		}
		
		int ansCount=0;
		for(int i=P-1; i<S; i++) {
			target[baseToIndex(dna.charAt(i))]++;
			if(isValid(target, condition)) {
				ansCount++;
			}
			target[baseToIndex(dna.charAt(i-P+1))]--;
		}
		System.out.println(ansCount);
	}
}