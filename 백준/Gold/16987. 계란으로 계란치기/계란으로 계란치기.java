

import java.util.*;

class Main {
	static Egg[] eggs;
	static int n;
	static int ans;
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		eggs = new Egg[n];
		for(int i=0; i<n; i++) {
			eggs[i] = new Egg(scan.nextInt(), scan.nextInt());
		}
		recur(0);
		System.out.println(ans);
	}

	static void recur(int idx) {
		if(idx == n) {
			int count = 0;
			for(int i=0; i<n; i++) {
				if(eggs[i].getDurability() <=0) {
					count++;
				}
			}
			ans = Math.max(ans, count);
			return;
		}
		
		if(eggs[idx].getDurability()>0) {
			boolean targetExist = false;
			for(int target=0; target<n; target++) {
				if(idx==target) continue;
				if(eggs[target].getDurability()>0) {
					targetExist = true;
					eggs[idx].fight(eggs[target]);
					recur(idx+1);
					eggs[idx].recover(eggs[target]);
				}
			}
			if(!targetExist) recur(idx+1);
			
		}else {
			recur(idx+1);
		}	
	}
}

class Egg{
	private int durability;
	private int weight;
	
	
	
	public int getDurability() {
		return durability;
	}

	public int getWeight() {
		return weight;
	}

	public Egg(int durability, int weight){
		this.durability = durability;
		this.weight = weight;
	}
	
	public void fight(Egg other) {
		this.durability-=other.weight;
		other.durability-=this.weight;
		
	}
	
	public void recover(Egg other) {
		this.durability+=other.weight;
		other.durability+=this.weight;
	}
	
	
}
