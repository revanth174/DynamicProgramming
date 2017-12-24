import java.util.Arrays;

public class MaxProductSubArray {

	public static void main(String args[]) {

		int a[] = { 1, 1, 1, -1, 9, 2, 2, -5 };
		// int a[] = {0 ,3, 10, 0 ,-2};
		int max = maxProductSubArray(a);
		System.out.println(max);

	}

	private static int maxProductSubArray(int[] a) {

		/*
		 * int m[] = new int[a.length]; int mp[] = new int[a.length]; m[0] = mp[0] =
		 * a[0]; for (int i = 1; i < a.length; i++) { if(m[i-1] + a[i] < a[i]) m[i] =
		 * a[i]; else m[i] = m[i-1] + a[i];
		 * 
		 * if(m[i] > mp[i-1]) mp[i] = m[i]; else mp[i] = mp[i-1]; }
		 * 
		 * System.out.println(Arrays.toString(m));
		 * System.out.println(Arrays.toString(mp));
		 */

		int currMax = a[0];
		int globalMax = a[0];
		for (int i = 1; i < a.length; i++) {
			currMax = max(currMax + a[i], a[i]);
			globalMax = max(currMax, globalMax);
		}
		return globalMax;
	}

	private static int max(int i, int j) {
		return (i>j) ? i:j;
	}

}
