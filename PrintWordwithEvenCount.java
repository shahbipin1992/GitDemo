package StringProgram;

public class PrintWordwithEvenCount {

	public static void main(String[] args) {
		String s="Azmat Ali Java Python";
		String sp[]=s.split(" ");
		for(int i=0;i<sp.length;i++) {
			if(sp[i].length()%2==0) {
				System.out.println(sp[i]);
			}
		}

	}

}
