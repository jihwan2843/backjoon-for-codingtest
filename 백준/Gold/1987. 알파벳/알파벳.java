

import java.util.*;

class Main {
	static int r;
	static int c;
	static int[][] board;
	static boolean[] used;
	public static int[][] visited;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		r = scan.nextInt();
		c = scan.nextInt();
		board = new int[r][c];
		used = new boolean[26];
		visited = new int[r][c];
		for(int i=0; i<r; i++) {
			String str = scan.next();
			for(int j=0; j<c; j++) {
				board[i][j] = str.charAt(j)-'A';
			}
		}
		visited[0][0] = 1 << board[0][0];
		used[board[0][0]] = true;
		System.out.println(recur(0,0));
		
		
		
	}
	
	static int[] nr = {-1,0,1,0};
	static int[] nc = {0,1,0,-1};
	
	static int recur(int row, int col) {
		int result = 0;
		for(int i=0; i<4; i++) {
			int nextRow = row + nr[i];
			int nextcol = col + nc[i];
			if(isBorder(nextRow,nextcol)) continue;
			if(used[board[nextRow][nextcol]]) continue;
			
			int visit = 1 << board[nextRow][nextcol];
			if(visited[nextRow][nextcol] == (visited[row][col] | visit)) continue;
			
			
			used[board[nextRow][nextcol]] = true;
			visited[nextRow][nextcol] = visited[row][col] | visit;
			result = Math.max(result, recur(nextRow,nextcol));
			used[board[nextRow][nextcol]] = false;
		}
		return result +1;
	
	}
	public static boolean isBorder(int row, int col) {
		if(row<0|| col<0|| row>=r|| col>=c) {
			return true;
		}
		return false;
	}
	
}