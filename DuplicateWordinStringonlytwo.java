package StringProgram;

import java.util.ArrayList;

public class DuplicateWordinStringonlytwo {

	public static void main(String[] args) {
	
		String a = "Automation Automation java java java sel python python";
		String aa = a.toLowerCase();
		String[] b = aa.split(" ");
		ArrayList<String> al = new ArrayList();
		for (int i = 0; i < b.length; i++) {
			if (!al.contains(b[i])) {
				al.add(b[i]);
				
			} else {
				
				System.out.println(b[i]);

			}
			
			
		}
	}

}
