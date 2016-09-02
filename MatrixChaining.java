public class MatrixChaining 
{  
	public int MatrixChain(int p[], int n)
    {
		int A[][] = new int[n][n];
    
		//zero when multiplying one matrix.
		for (int i = 1; i < n; i++)
			A[i][i] = 0;
 
		// L is chain length.
		for (int L=2; L<n; L++)
		{
			for (int i = 1; i <= n-L+1; i++)
			{
				int j = i+L-1;
				if(j == n) continue;
             
				A[i][j] = Integer.MAX_VALUE;
             
				for (int k = i; k <= j-1; k++)
				{
					int shortestProduct = A[i][k] + A[k+1][j] + p[i-1]*p[k]*p[j];
					if (shortestProduct < A[i][j])
						A[i][j] = shortestProduct;
				}
			}
		}
		return A[1][n-1];
    }
    
	public static void main(String args[])
    {	
    	MatrixChaining run = new MatrixChaining();
    	
    	int arr[] = new int[1290];
    	
    	for(int i = 0; i < arr.length; i++)
    		arr[i] = (int)(Math.random()*100) +1; 	
    
    	Stopwatch clock = new Stopwatch();
    	System.out.println("Minimum number of multiplications is "+ run.MatrixChain(arr, arr.length));
		double timeTaken = clock.elapsedTime();
		
		System.out.printf("time taken: %.5fs%n",timeTaken);
    }  
}