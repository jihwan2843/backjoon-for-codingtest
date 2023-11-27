

import java.sql.Array;
import java.util.*;

class Member{
	private int age;
	private String name;
	private int idx;
	
	
	public int getAge() {
		return age;
	}


	public String getName() {
		return name;
	}


	public int getIdx() {
		return idx;
	}


	public Member(int age, String name, int idx) {
		this.age = age;
		this.name = name;
		this.idx = idx;
	}
}

class Main {
		
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Member[] memberList = new Member[N];
		for(int i=0; i<N; i++) {
			int a = scan.nextInt();
			String b = scan.next();
			Member member = new Member(a, b, i);	
			memberList[i] = member;
		}
		Arrays.sort(memberList, new Comparator<Member>() {

			@Override
			public int compare(Member o1, Member o2) {
				// TODO Auto-generated method stub
				if(o1.getAge()!=o2.getAge()){
					return o1.getAge()-o2.getAge();
				}
				
				return o1.getIdx()-o2.getIdx();
			}
			
		});
		
		for(int i=0; i<N; i++) {
			System.out.print(memberList[i].getAge()+" "+memberList[i].getName());
			System.out.println();
		}
		
		
	}
}


