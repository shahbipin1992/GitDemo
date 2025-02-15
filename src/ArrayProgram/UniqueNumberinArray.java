package ArrayProgram;

public class UniqueNumberinArray {

	public static void main(String[] args) {
		int a[]= {5,5,4,4,2,2,1};
		int uni=a[0];
		for(int i=1;i<a.length;i++) {
			uni=uni^a[i];
		}
		System.out.println(uni);

	}

}
