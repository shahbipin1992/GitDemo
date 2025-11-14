package StringProgram;

public class inter {

	public static void main(String[] args) {
	String s ="Welcome";
	String sm="Welcome";
		String s1 = new String("Welcome");
		
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		 
		String ss = "Welcome";
		ss.replace('w', 'r');
		System.out.println(ss);
		 System.out.println(s==sm);
		 String st = "abc";
			String stt = "abc";

			 

			System.out.println("s1 == s2 is:" + st == stt);
		
	}

}
