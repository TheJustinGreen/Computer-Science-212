/*
 * The Rabin Karp pattern matching algorithm uses a rolling hash to search for the pattern
 * Returns the first index of the found pattern or -1 if it was not found
 * 
 * Time Complexity: O(m + n) On worst case since it takes 0(n) to hash the entire text and O(m) to 
 * hash the pattern. This is atleast m times faster tha brute force matching
 * 
 * 
 */


public class RabinKarpPatternMatcher 
{
	public int rabinKarpSearch(String pattern, String text)
	{
		int m = pattern.length(), n = text.length();
		if(m == 0 || n == 0 || m > n) return -1;
		
		int i = 0, j = m, found = -1;
		
		int pHash = pattern.hashCode();
		
		while(j <= n)
		{
			int tHash = text.substring(i,j).hashCode();
			
			if(tHash == pHash)
				if(pattern.equals(text.substring(i,j)))
					found = i;
			i++;
			j++;
		}

		return found;
	}
	
	public static void main(String[] args)
	{
		RabinKarpPatternMatcher run = new RabinKarpPatternMatcher();

		String T = "The Rabin-Karp method is much faster then The brute-force method.";
		
		System.out.println(run.rabinKarpSearch("The", T));
		
	}
}
