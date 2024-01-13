

import java.util.*;

class Main {
	static int l,c;
	static char[] letter;
	static char[] ans;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		l = scan.nextInt();
		c = scan.nextInt();
		letter = new char[c];
		ans = new char[l];
		for(int i=0; i<c; i++) {
			letter[i] = scan.next().charAt(0);
		}
		Arrays.sort(letter);
		
		recur(0,0,0);
	}

	public static void recur(int length, int idx, int cnt) {
		if(length==l) {
			if(cnt>=1 && l-cnt>=2) {
				System.out.println(ans);
			}
			return;
		}
		
		if(idx<c) {
			ans[length] = letter[idx];
			int v = isVowel(letter[idx])?1:0;
			recur(length+1, idx+1, cnt+v);
			
			ans[length] = 0;
			recur(length, idx+1, cnt);
		}
		
		
	}
	public static boolean isVowel(char a) {
		if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u') {
			return true;
		}
		return false;
	}

		
	


}
