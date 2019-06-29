import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{  static int i=8,j=9;
	public static void main (String[] args) throws java.lang.Exception
	{
	swap(i,j);
	System.out.println(i+ " " + j);
	}
	public static void swap(int k,int l)
	{  i=k;j=l;
		int t;
		t=i;
 i=j;
 j=t;
	}
}
	