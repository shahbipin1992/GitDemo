package NumberProgram;

public class FaboniccoUsingRecurrsion {

	public static void main(String[] args) {
		int num=8;
		for(int i=0;i<=num;i++) {
			System.out.print(fab(i)+ " ");
		}

	}
	public static int fab(int num) {
		if(num<=1) {
			return num;
		}
		else {
			return fab(num-1)+fab(num-2);
		}
		
		
	}

}
