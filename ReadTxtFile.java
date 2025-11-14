package StringProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTxtFile {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\user\\git\\CoreJava\\CoreJava\\folder\\Read.txt");
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
System.out.println("__________________*******_______________");


		/*while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}*/
		
	}

}
