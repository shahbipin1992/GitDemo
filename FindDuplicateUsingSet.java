package ArrayProgram;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateUsingSet {

	public static void main(String[] args) {
		int a[]= {5,5,7,7,1,2,3,1};
		Set<Integer> set=new HashSet();
		for(int i=0;i<a.length;i++) {
		if(	set.add(a[i])==false){
			System.out.println("Duplicate Elements are: "+ a[i]);
			}
		}
		

	}

}
