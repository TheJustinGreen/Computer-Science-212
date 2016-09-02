public class DPFib{

	/*
		 * DP Fibonacci Algorithm Complexity
		 * 
		 * Dynamic programming bottom-up
		 * Time Complexity: O(n)
		 * Extra Space: O(n)
		 * 
		 * This is good since it is the time is proportional the data size
		 * 
		 */
		
		public int dpFibCalc(int n)
		{	
			int[] fib = new int[n+1];
			
			for(int k = 1; k < n+1; k++)
				fib[k] = (k <= 2) ? 1 : fib[k-1] + fib[k-2];
			
			return fib[n];
		}
		
		public static void main(String[] args)
		{
			DPFib run = new DPFib();
			//Insert the number for the fib term you wish to calculate) 
			System.out.println(run.dpFibCalc(7));
		}
}

