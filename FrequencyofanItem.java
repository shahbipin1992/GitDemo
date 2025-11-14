package ArrayProgram;

public class FrequencyofanItem {

	public static void main(String[] args) {
		int a[] = { 1, 1, 1, 3, 3, 3, 3, 0, 1, 5, 5, 5, 6 };
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			int x = a[i];
			if (x == -1)
				
				continue;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == x) {
					a[j] = -1;
					count++;
				}
			}
			System.out.println("Frequency of " + x + "  is " + count);
		}

	}

}
