package Selenium;
import java.util.ArrayList;
import java.util.Arrays;

public class JavaBrushUp2 
{
    public static void main(String[] args) 
    {
   int numbers[]={5,4,8,9,10};
   System.out.println("the count is" + numbers.length);
   System.out.println("***************");
   //Print Elements of array
   int i;
   for (i=0;i<numbers.length;i++)
   {
       System.out.println(numbers[i]);
   }
   System.out.println("First Element of the array is:" + numbers[0]);
   System.out.println("Last Element of the array is:" + numbers[numbers.length-1]);
   System.out.println("***************");
   //Reverse elements in the array
   for (i=numbers.length-1;i>=0;i--)
   {
	   System.out.println(numbers[i]);
   }
   //Find multiple of 2
   for (i=0;i<numbers.length;i++)
   {
	   if(numbers[i]%2==0)
	   {
		   System.out.println(numbers[i]);
		   //break ;   //check presence of numbers multiple of 2
	   }
	   else
	   {
		   System.out.println(numbers[i] + "is not multiple of 2");
	   }
   }
   //ArrayList -> dynamic memory allocation
   ArrayList<String> a = new ArrayList<String>();
   a.add("Bipin"); 
   a.add("Kalpana");
   a.add("Harshit");
   System.out.println(a.get(1)); //get value at specific index in the list
   System.out.println("***************");
   for (i=0;i<a.size();i++)
   {
	   System.out.println(a.get(i));
   }
   System.out.println("***************");
   //Enhanced for loop
   for (String val:a)
   {
	   System.out.println(val);  
   }
	  //Check presence of any keyword in arraylist 
   System.out.println("***************");
   System.out.println(a.contains("Bipin"));
   
   
   }
}

