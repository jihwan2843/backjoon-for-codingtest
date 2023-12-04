

import java.util.*;

class Main {
		
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Set<String> set = new TreeSet<>();
		for(int i=0; i<N; i++) {
			String name = scan.next();
			String status = scan.next();
			
			if(status.equals("enter")) {
				set.add(name);
			}else {
				set.remove(name);
			}
		}
		String[] ordered = set.toArray(new String[set.size()]);
		for(int i=ordered.length-1; i>=0; i--) {
			System.out.println(ordered[i]);
		}
	
	
		
		
	}
}


