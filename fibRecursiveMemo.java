/*
 *Recursive Fibonacci with memoization
 *
 * The time complexity of this algorithm is 0(n)
 * since recursive calls count as O(1) with memoization
 * 
 * 
 */
public class fibRecursiveMemo {

	//Random size of array//
	int[] F = new int[999];
	
	public int fibCalc(int n){ return (n < 3) ? 1 : (F[n] == 0) ? F[n] = fibCalc(n-1) + fibCalc(n-2) : F[n]; }
	
	public static void main(String[] args)
	{
		fibRecursiveMemo run = new fibRecursiveMemo();
		System.out.println(run.fibCalc(6));
	}
}