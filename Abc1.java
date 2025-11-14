package PatternPrograms;

public class Abc1 {

	public static void main(String[] args) {
		int row=5;
		char c='A';
		
		for(int i=0;i<=row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(c+" ");
				c++;
			}
		System.out.println();
		}
	}

}
/*
A 
B C 
D E F 
G H I J 
K L M N O 
P Q R S T U 
*/