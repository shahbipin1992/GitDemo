package Pattern;

public class Pattern1 {

	public static void main(String[] args) {
		/*int k=3;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k=k+3;
			}
			System.out.println("");
		} */

		/*1)  Min and Max number in array
		int a[][] = {{2,4,5},{10,4,7},{5,8,3}};
		int min = a[0][0];
		int max =a[0][0];
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				//if(a[i][j]>max)	
				{
					 min = a[i][j];
					//max = a[i][j];
				}
			}
		}
		 System.out.println(min);
		//System.out.println(max); */
		
		
	//2) Print max number from the column which contains min numb of the array
		int a[][] = {{2,4,5},{10,4,7},{5,8,3}};
		int min = a[0][0];
		int minColumn =0;
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if(a[i][j]<min)	
				{
					 min = a[i][j];
					 minColumn=j;
				}
			}
		}
		int max = a[0][minColumn];
		int k=0;
		while(k<3)
		{
			if (a[k][minColumn]>max)
			{
				max= a[k][minColumn];
			}
			k++;
		}
			
		 System.out.println(max);
		 
		 
		 //3) Program to sort an array in ascending and descending order
		 int b[]= {7,4,3,8,0,1,4};
		 int temp;
		 for (int i=0;i<b.length;i++)
		 {
			 for(int j=i+1;j<b.length;j++)
			 {
				 if (b[i]>b[j])           // change condition to b[i] < b[j] to  sort in descending order
				 {
					 temp=b[i];
					 b[i]=b[j];
					 b[j]=temp;
					 
				 }
			 }
		 }
		 for (int i=0;i<b.length;i++)
		 {
			 System.out.println(b[i]); 
		 }
	//4) Reverse a string and check for palindrome
		 String d = "MADAM";
		 d=d.toLowerCase();
		 String t="";
		 for (int i=d.length()-1;i>=0;i--)
		 {
			 t=t + d.charAt(i);
		 }
		 System.out.println("Reversed String is: " + t);
		 if (d.equals(t))
		 {
			 System.out.println ("The given string is palindrome ");
		 }
		 else 
		 {
			 System.out.println ("The given string is not palindrome ");
		 }
			 
		 
	//5) Reverse a string using StringBuffer/StringBuilder
		 StringBuffer g = new StringBuffer("hello");
		 g.reverse();
		 System.out.println("Reversed String is: " + g);
		 g.append("world");
		 System.out.println(g);
		 StringBuilder h = new StringBuilder("Bipin");
		 h.reverse();
		 System.out.println("Reversed String is: " + h);
		
	//6) 
		 
	}
		 
}
