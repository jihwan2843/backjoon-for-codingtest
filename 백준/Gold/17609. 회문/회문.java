

import java.util.*;

class Main {
	static boolean palindrome(char[] text, int left, int right) {
		while(left < right) {
			if(text[left]==text[right]) {
				left++;
				right--;
			}else {
				return false;
			}	
		}
		return true;
	}
	
	
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		String[] text = new String[T];
		for(int i=0; i<T; i++) {
			text[i] = scan.next();
		}
		
		int[] ansArr = new int[T];
		for(int i=0; i<T; i++) {
			char[] letter = new char[text[i].length()];
			letter = text[i].toCharArray();
			
			int left =0;
			int right = letter.length-1;
			int ans = 0;		
			while(left < right) {		
				if(letter[left] != letter[right]) {
					if(palindrome(letter, left+1, right) || palindrome(letter, left, right-1)) {
						ans=1;
						break;
					}else {
						ans=2;
						break;
					}
					
				}else {
					left++;
					right--;
				}
				
			}
			ansArr[i] = ans;
		}
		for(int x : ansArr) {
			System.out.println(x);
		}
		
	}
}