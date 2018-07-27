import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int count=0, numb=548;

        while(numb!= 0)
        {
          numb /=10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    
		
	}
}
