package StringProgram;

public class DuplicateWordandcountinString {

	public static void main(String[] args) {
		String s="java Java Python Python Selenium";
		String ss=s.toLowerCase();
		String sp[]=ss.split(" ");
		int count=0;
		for(int i=0;i<sp.length;i++) {
			count=1;
			for(int j=i+1;j<sp.length;j++) {
				if(sp[i].equals(sp[j]) ) {
					sp[j]="0";
					count++;
				}
			}
			if(count>=1 && sp[i]!="0") {
				System.out.println(sp[i]+ " "+count);
			}
		}

	}

}
