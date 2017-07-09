import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone1
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number");
int n=s.nextInt();
if (n>0)
System.out.println("positive no");
else if (n<0)
System.out.println("negative no");
else
System.out.println("no is zero");
 
}
}