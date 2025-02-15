package ArrayProgram;

import java.util.Arrays;

public class RemoveDuplicateFromanArray {

	public static void main(String[] args) {
		int a[] = { 3, 3, 3, 3, 5, 5, 5, 0, 0, 4, 4, 9, 9, 9, 2, 2, 1 };
		Arrays.sort(a);
		int l = a.length;
		int t[] = new int[l];
		int j = 0;
		for (int i = 0; i <l-1; i++) {
			if (a[i] != a[i + 1]) {
				t[j] = a[i];
				j++;
			}
		}

		t[j++] = a[l - 1];
		for (int k = 0; k < j; k++) {
			System.out.println(t[k]);
		}
	}

}
