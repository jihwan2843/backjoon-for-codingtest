

import java.util.*;

class Main {
	static int r;
	static int c;
	static int[][] board;
	static boolean[] used;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		r = scan.nextInt();
		c = scan.nextInt();
		board = new int[r][c];
		used = new boolean[28];
		for(int i=0; i<r; i++) {
			String str = scan.next();
			for(int j=0; j<c; j++) {
				board[i][j] = str.charAt(j)-'A';
			}
		}
		
		
		used[board[0][0]] = true;
		System.out.println(recur(0,0));
		
		
	}
	static int[] nr = {0,1,0,-1};
	static int[] nc = {-1,0,1,0};
	static int recur(int row, int col) {
		int result = 0;
		for(int i=0; i<4; i++) {
			int nextrow = row + nr[i];
			int nextcol = col + nc[i];
			if(isboard(nextrow,nextcol)) continue;
			int next = board[nextrow][nextcol];
			if(used[next]) continue;
			used[next] = true;
			result = Math.max(result, recur(nextrow,nextcol));
			used[next] = false;
			
		}
		return result +1;
			
	}
	static boolean isboard(int row, int col) {
		if(row<0 || col<0 || row>=r || col >=c) {
			return true;
		}
		return false;
	}
}