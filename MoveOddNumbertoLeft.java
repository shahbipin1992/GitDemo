package ArrayProgram;

public class MoveOddNumbertoLeft {

	public static void main(String[] args) {
		int a[] = { 7, 4, 8, 10, 1, 2, 3,9 };
		int j = a.length - 1;
		

		for (int i=0;i<j;) {
			if (a[i] % 2 != 0) {
				i++;
			}
			if (a[j] % 2 == 0) {
				j--;
			}
		/*	a[i] = a[i] + a[j];
			a[j] = a[i] - a[j];
			a[i] = a[i] - a[j];
			*/
			 int t=a[i];
			 a[i]=a[j];
			 a[j]=t;
			 
			
		}

		for( int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}

	}

}
