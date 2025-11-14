package ArrayProgram;

public class MoveZerotoRightandNonZerOnLeft {

	public static void main(String[] args) {
		int a[]= {1,8,0,0,0,3,6,0,2};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[count++]=a[i];
			}
		}
		for(int i=count;i<a.length;i++) {
			a[count++]=0;
		}
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+ " ");

	}
	

}
