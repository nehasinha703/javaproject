import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone10
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter integer");
	int n=s.nextInt();
		String str= Integer.toString(n);
		System.out.println(str.length());
	}
}