package ArrayProgram;

public class DuplicateIteminArray {

	public static void main(String[] args) {
		int a[]= {3,3,3,4,4,5,7,7,7,7,9,9,1,1};
		int count=0;
		for(int i=0;i<a.length;i++) {
			count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j] && a[i]!=0) {
					a[j]=0;
					count++;
				}
			}
		if(count>1) {
			System.out.println(a[i]);
		}
		}
		
	}

}
