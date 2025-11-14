package ArrayProgram;

import java.util.ArrayList;
import java.util.List;

public class LeaderElementinArray {

	public static void main(String[] args) {
		int a[] = { 16, 17, 4, 3, 5, 2 };
		int l = a.length;
		int maxFromRight = a[l - 1];
		System.out.print(maxFromRight + " ");
		for (int i = l - 2; i >= 0; i--) {
			if (a[i] > maxFromRight) {
				maxFromRight = a[i];
				
				System.out.print(maxFromRight + " ");
				
			}
		}
		/*
		 * List<Integer> li=new ArrayList(); li.add(maxFromRight);
		 * System.out.println(li);
		 */
	}
}
