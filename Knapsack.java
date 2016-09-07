public class Knapsack {
	
	/*
	 * Knapsack algorithm
	 *
	 * Given items of certain values and find the best possible way 
	 * to make up the maximum allowed amount value
	 * 
	 * Time complexity - O(Number of possibilities * total items)
	 * 
	 * 
	 */
	    public int bottomUpDP(int val[], int wt[], int W)
	    {
	        int K[][] = new int[wt.length+1][W+1];
	        
	        for(int i=1; i <= val.length; i++)
	        	for(int j=1; j <= W; j++)
	            	K[i][j] = ((j - wt[i-1] >= 0) ? Math.max(K[i-1][j], K[i-1][j-wt[i-1]] + val[i-1]) : K[i-1][j]);
	        
	        return K[val.length][W];

	    }

	    public static void main(String args[]){

	        Knapsack k = new Knapsack();

	        int val[] = {22, 20, 15, 30, 24, 54, 21, 32, 18, 25};

	        int wt[] = {4, 2, 3, 5, 5, 6, 9, 7, 8, 10};

	        int r = k.bottomUpDP(val, wt, 30);
	    
	        System.out.println(r);

	    }
}