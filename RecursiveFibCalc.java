public class RecursiveFibCalc 
{
	/*
	 * Recursive Fibonacci Algorithm Complexity
	 * 
	 * T(n) = T(n-1) + T(n-2) + O(1) >= Fn approximately equal to the golden ratio  >= 2T(n-2) + O(1) >= 2^n/2
	 * 
	 * The T(n-1), T(n-2) calls comes from the fib(n-1) and fib(n-2) recursive calls 
	 * the O(1) comes from the constant time taken to add up the values returned 
	 * 
	 * The big O Complexity is thus O(2^n)
	 * 
	 * This is bad since it is exponential
	 * 
	 * 
	 */
	
	public int fib(int n){	return (n < 2) ? 1 : fib(n-1) + fib(n-2); }
	
	public static void main(String[] args)
	{
		fibCalc run = new fibCalc();
		//Insert the number for the fib term you wish to calculate
		//computation time will start to slow down a lot after 40 since it is 0(2^n) 
		System.out.println(run.fib(40));
	}
}
