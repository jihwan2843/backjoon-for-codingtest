

import java.util.*;

class Main {
		
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String[] book = new String[N];
		for(int i=0; i<N; i++) {
			book[i] = scan.next();
		}
		Arrays.sort(book, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
			
		});
		int max = 0;
		int count = 1;
		String maxName = "";
		if(book.length!=1) {
			for(int i=0; i < book.length-1; i++) {
				if(!book[i].equals(book[i+1])) {
					if(count > max) {
						max=count;
						maxName = book[i];
					} 
					count = 1;
					continue;
				}
				count++;
				if(count>max) maxName=book[i];
			}
			System.out.println(maxName);
		}else {
			System.out.println(book[0]);
		}
		
		
	
		
		
	}
}


