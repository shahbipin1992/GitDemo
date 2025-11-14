package ArrayProgram;

public class MergingThreeArrays {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		int c[]= {7,8,9};int j=0;
		int rs[]=new int[a.length+b.length+c.length];
		for(int i=0;i<a.length;i++,j+=3) {
			rs[j]=a[i];
			rs[j+1]=b[i];
			rs[j+2]=c[i];
		}
for(int i=0;i<rs.length;i++) {
	System.out.print(rs[i]+" ");
}
	}

}
