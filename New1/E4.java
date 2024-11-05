import java.util.Scanner;
//import java.lang.*;
//import java.io.*;

public class E4
{
	public static void main (String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter the number of elemnet in array X: ");
		int n1 = myObj.nextInt();
		int[] X = new int[n1];
		for(int i = 0; i <= X.length - 1; i++){ // target
            System.out.print( i + " : ");
		    X[i] = myObj.nextInt();
		}
        System.out.print("Enter the number of elemnet in array A: ");
		int N = myObj.nextInt();
		int[] A = new int[N];
		for(int i = 0; i <= A.length - 1; i++){ // main
            System.out.print( i + " : ");
		    A[i] = myObj.nextInt();
		}
		int value = 0;
		//int[] sat = new int[n1];
		for(int i = 0; i <= X.length - 1; i++){
		    for(int j = 0; j <= A.length - 1; j++){
		        if(X[i] == A[j]){
		            //sat[value] = A[j];
		            value++;
		            break;
		        }
		    }
		}
        System.out.print("No of values" + value);
		if(value > 1){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
		myObj.close();

	}
}
