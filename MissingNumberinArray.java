package ArrayProgram;

public class MissingNumberinArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,5};
		int s=0;
		int n=5;
		int mis;
		for(int i=0;i<a.length;i++) {
			s=s+a[i];
		}
		mis=(n*(n+1))/2-s;
		System.out.println(mis);

	}

}
