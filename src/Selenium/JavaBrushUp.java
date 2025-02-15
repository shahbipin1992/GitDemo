package Selenium;
import java.util.Arrays;
import java.util.List;

public class JavaBrushUp {

	public static void main(String[] args) {
	int MyNum = 5;
	String website="www.google.com";
	char Letter ='B';
	double Dec =5.99;
	int arr[] = {13,145,56,78,0,5,8};
	int arr1[] = new int[5];
	arr1[0]=1;
	arr1[1]=6;
	arr1[2]=5;
	arr1[3]=7;
	arr1[4]=8;
	System.out.println(MyNum + website+Letter+Dec);	
	int i;
	for(i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	for(i=0;i<arr1.length;i++)
	{
		System.out.println(arr1[i]);
	}
	//Enhanced for loop
	for(int B:arr1)
	{
		System.out.println(B);
	}
	//String Array
	String BIPIN[] = {"Shah","HARSHIT","KALPANA"};
	for(i=0;i<BIPIN.length;i++)
	{
		System.out.println(BIPIN[i]);
	}
	//Enhanced for loop
	for(String N:BIPIN)
	{
		System.out.println(N);
	}
	//convert arrays to arraylist
List<String> BIPINArrayList=Arrays.asList(BIPIN);
System.out.println(BIPINArrayList.contains("Shah"));

}
}
