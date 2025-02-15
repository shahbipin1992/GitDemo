package ArrayProgram;

public class DuplicateinArray {

	public static void main(String[] args) {
		int a[]= {2,5,6,2,9,6};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[j] + " ");
				}
			}
		}

	}

}
