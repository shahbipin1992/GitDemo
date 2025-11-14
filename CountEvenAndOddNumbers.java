package ArrayProgram;

public class CountEvenAndOddNumbers {

	public static void main(String[] args) {
		int a[]= {3,6,7,9,2,4,10,122,16};
		int ecount=0;
		int ocount=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				ecount++;
			}
			else {
				ocount++;
			}
		}
		
		System.out.println("Even Numbers: "+ ecount );
		System.out.println("Odd Numbers Count: "+ ocount);

	}

}
