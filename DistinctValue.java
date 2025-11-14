package ArrayProgram;

import java.util.Arrays;
import java.util.List;

public class DistinctValue {

	public static void main(String[] args) {
		List<Integer> value=Arrays.asList(4,3,6,4,3,1,2,4);
		value.stream().sorted().distinct().forEach(s->System.out.print(s + " "));

	}

}
