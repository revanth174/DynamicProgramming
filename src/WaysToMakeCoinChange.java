import java.util.Arrays;
import java.util.Scanner;

/*  You are given an infinite supply of coins of each of denominations D = {D0, D1, D2, D3, ...... Dn-1}. 
 * You need to figure out the total number of ways W, in which you can make change for Value V using coins of denominations D. 
 * Note : Return 0, if change isn't possible. */

public class WaysToMakeCoinChange {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String arg[]) {
		
		int n = scan.nextInt();
		int a[] = new int[n];
	
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		
		int v = scan.nextInt();
		
		int ways = findNoOfWays(a,n,v);
		
		System.out.println(ways);
		
	}
	private static int findNoOfWays(int[] a, int n, int v) {
		int w[][] = new int[n+1][v+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=v;j++) {
				if(i==0 ) {
					w[i][j] = 0;
				}
				if(j==0)
					w[i][j] = 1;
				else if(j<a[i-1]) {
					w[i][j] = w[i-1][j];
				}
				else {
					w[i][j] = w[i-1][j] + w[i][j-a[i-1]];
				}
			}
		}
		
		return w[n][v];
	}

}
