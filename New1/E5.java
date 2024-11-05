import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class E5
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner (System.in);
	    System.out.print("Enter Testcase T : ");
	    int T = sc.nextInt();
        for (int j = 0; j < T; j++){

	    System.out.print("Enter number N : ");
	    int N = sc.nextInt();
	    int[] mountain = new int[N];
	    for(int i = 0; i < N; i++){
	        mountain[i] = sc.nextInt();
	        //System.out.print(" ");
	        
	    }
	    
	    Arrays.sort(mountain);
	    int z = mountain.length - 1;
	    System.out.println("Highest Value  : " + mountain[z]);
    }
	    
		// your code goes here
        sc.close();

	}
}