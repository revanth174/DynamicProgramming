import java.util.Arrays;
import java.util.Scanner;

/*A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time.
 *  Implement a method to count how many possible ways the child can run up to the stairs. 
 *  You need to return number of possible ways W.*/

public class StairCase {
	
	private static Scanner scan = new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("enter the no of the stairs:");
		int n = scan.nextInt();
		long ways = printNoOfWays(n);
		System.out.println(ways);
		
		long[] a = new long[n+1];
		Arrays.fill(a, -1);
		ways = printNoOfWays(n,a);
		System.out.println(ways);
		
		
	}
	
	
	private static long printNoOfWays(int n, long[] a) {
		
		if(n<0)
			return 0;
		if(n==0) {
			a[n] = 1;
			return a[n];
		}
		
		if(a[n]!=-1)
			return a[n];
		else {
			a[n] = printNoOfWays(n-1,a) + printNoOfWays(n-2,a) + printNoOfWays(n-3,a);
			return a[n];
		}
			
	}


	//bottom approach to find solution with time complexity o(n)
	private static long printNoOfWays(int n) {
		long a[] = new long[n+1];
		
		
		//base case
		a[0] = 0;
		a[1] = 1;
		a[2] = 2;
		a[3] = 4;
		
		for(int i = 4;i<=n;i++) {
			a[i] = a[i-1] + a[i-2] +a[i-3];
		}
		
		return a[n];
	}

}
