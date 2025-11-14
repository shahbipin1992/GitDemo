package ArrayProgram;

import java.util.Arrays;
import java.util.List;

public class CommonElementinListUsingStream {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> b= Arrays.asList(1, 3, 5, 7, 9);
		    
		List<Integer> common = a.stream().filter(b::contains).toList();
		System.out.println(common);

	}

}
