

import java.util.*;

class Main {
	static int Count(int[] count) {
		int countSum = 0;
		for(int i=0; i<count.length; i++) {
			if(count[i] >0) {
				countSum++;
			}
		}
		return countSum;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		char[] catSound = scan.next().toCharArray();
		
		int[] count = new int[26]; 
		int j=0;
		int length = 0;
		for(int i=0; i<catSound.length; i++) {
		
			while(j<catSound.length) {
				count[catSound[j++]-'a']++;
				if(Count(count) <= N) {
					length = Math.max(length, j-i);
				}else {
					count[catSound[--j]-'a']--;
					break;
				}
			}
			count[catSound[i]-'a']--;
			
		}
		System.out.println(length);
	}
}