package ArrayProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoomenIteminList {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(4, 5, 6, 7);
		List<Integer> b = Arrays.asList(7, 5, 3, 1);
		ArrayList<Integer> c = new ArrayList();
		for (int num : a) {
			if (b.contains(num)) {
				c.add(num);

			}
		}
		System.out.println(c);

	}

}
