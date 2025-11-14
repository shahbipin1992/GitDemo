package ArrayProgram;

import java.util.ArrayList;

public class CommonElementinList {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList();
		ArrayList<Integer> b = new ArrayList();

		a.add(5);
		a.add(7);
		a.add(0);
		a.add(3);

		b.add(7);
		b.add(3);
		b.add(9);

		a.retainAll(b);

		System.out.println(a);
	}

}
