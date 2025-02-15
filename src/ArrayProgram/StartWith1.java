package ArrayProgram;

import java.util.ArrayList;

public class StartWith1 {

	public static void main(String[] args) {
		int a[]= {3,2,1,10,11,101,1111};
		ArrayList<Integer> list=new ArrayList();
		for(int i=0;i<a.length;i++) {
			if(String.valueOf(a[i]).startsWith("1")) {
				list.add(a[i]);
			}
		}
		System.out.println(list);
		
	}

}
