package ArrayProgram;

import java.util.HashSet;
import java.util.Set;

public class CommonElemenstinArray {

	public static void main(String[] args) {
		int a[] = { 2, 5, 7, 8 };
		int b[] = { 5, 7, 8, 3 };
		Set<Integer> set = new HashSet();
		for(int num:a) {
			set.add(num);
		}
		for( int num:b)
		if(set.contains(num)) {
			System.out.println(num);
		}

	}

}
