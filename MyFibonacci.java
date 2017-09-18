import java.util.Scanner;

/**
 * Description: Application class to test the recursive Fibonacci method F.
 * @author christopher_shikami
 *
 */

public class MyFibonacci {
	private static final int MAX = 100;
	private static long[] A = new long[MAX];
	
	public static long F(int n)
	{
		if (n<=1) {
			return 1;
		} else if (A[n] != 0) {
			return A[n];
		} else {
			return A[n] =  F(n-1) + F(n-2);
		}
	}
	
	private static void directions()
	{
		String msg = 
				"This application prints the fibonacci numbers, F(k) for \n" +
				"k = 0, 1, 2, ..., n\n";
		System.out.println(msg);
	}

	public static void main(String[] args) {
		int N;
		Scanner in = new Scanner(System.in);

		directions();
		
		System.out.printf("N: ");
		N = in.nextInt();
				
		for(int i = 0; i <= N; i++) {
			System.out.printf("F(%d) =  %d\n", i, F(i));
		}
		

	}

}
