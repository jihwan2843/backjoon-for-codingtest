

import java.util.*;

class Member{
	private String name;
	private String status;
	
	public String getName() {
		return name;
	}

	public String getStatus() {
		return status;
	}

	public Member(String name, String status) {
		this.name = name;
		this.status = status;
	}
}

class Main {
		
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Member[] memberList = new Member[N];
		Member member;
		for(int i=0; i<N; i++) {
			member = new Member(scan.next(), scan.next());
			memberList[i] = member;
		}
		
		Arrays.sort(memberList, new Comparator<Member>() {

			@Override
			public int compare(Member o1, Member o2) {
				// TODO Auto-generated method stub
				return o2.getName().compareTo(o1.getName());
			}
			
		});
		
		for(int i=0; i<memberList.length-1; i++) {
			if(!memberList[i].getName().equals(memberList[i+1].getName()) && memberList[i].getStatus().equals("enter")) {
				System.out.println(memberList[i].getName());
			}
		}
		
		if(memberList[memberList.length-1].getStatus().equals("enter")) {
			System.out.println(memberList[memberList.length-1].getName());
		}
		
		
	}
}


