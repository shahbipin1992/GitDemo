package ArrayProgram;

public class SecondLargestandSecongHighestElement {

	public static void main(String[] args) {
		int a[]= {3,5,8,9};
		int t;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("Second Smallest Element: " + a[1]);
		System.out.println("Second Highest Element: "+a[a.length-2]);

	}

}
