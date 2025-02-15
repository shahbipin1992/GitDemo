package StringProgram;

public class ReverseaWord {

	public static void main(String[] args) {
		String s = "Hi Azmat";
		String rev = "";
		String sp[] = s.split(" ");
		for (int i = sp.length - 1; i >= 0; i--) {
			rev = rev + sp[i] + " ";
		}
		System.out.println(rev);

	}

}
