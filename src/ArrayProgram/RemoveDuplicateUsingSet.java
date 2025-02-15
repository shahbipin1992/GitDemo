package ArrayProgram;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateUsingSet {

	public static void main(String[] args) {
		int a[]= {3,3,3,1,1,0,0,5,5,6,6,8,8,5,5,5};
		Set<Integer> set=new HashSet();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		System.out.println(set);

	}

}
