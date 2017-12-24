import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNumbers {
	
	private static Scanner scan = new Scanner(System.in);
	public static void main(String args[]) {
		
		System.out.println("enter the n value");
		int n = scan.nextInt();
		
		
		long[] mem = new long[n+1];
		Arrays.fill(mem, 0);
		System.out.println(fib(n,mem));
		
		System.out.println(fib(n));
		
		
		System.out.println(fibonacci(n));
		
	}
	
	
	
	private static long fibonacci(int n) {
		long a[] = new long[n+1];
		a[0] = 0;
		a[1] = 1;
		for(int i=2;i<=n;i++) {
			a[i] = a[i-1] + a[i-2];
		}
		
		return a[n];
	}



	//recursion + memorization
	private static long fib(int n, long[] mem) {
		
		if(n==0 || n==1) {
			mem[n] = n;
			return n;
		}
		if(mem[n]!=0)
			return mem[n];
		mem[n] = fib(n-1,mem) + fib(n-2,mem);
		return mem[n];
		
	}


	//using traditional recursion method
	// it takes 2^n time
	private static int fib(int n) {
		if(n == 0) 
			return 0;
		if(n==1)
			return 1;
		
		return fib(n-1)+fib(n-2);
	}

}
