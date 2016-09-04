/*
 * The Brute Force pattern matching algorithm matches is character until it finds a complete match
 * return -1 if string searched for is not found, if found it returns the index of the first character
 * of the last occurrence of the matched string
 * 
 * Time Complexity: O(mn) On worst case character matches with the pattern are found at the end of the
 * traversed string with the last character being a mismatch. the m and n come from the length of the
 * two string being compared
 * 
 * 
 */

public class BruteForcePatternMatcher 
{
	public int bruteForceSearch(String pattern, String text)
	{
		int m = pattern.length();
		int n = text.length();
		
		if(m == 0 || n == 0 || m > n) return -1;
		
		int i = 0, found = -1;
		
		while(found < n-m && i <= n-m) //text length - pattern length so that you dont get an index out of bounds
		{
			int j = 0;
			
			while(j < m && pattern.substring(j,j+1).equals(text.substring(i+j,i+j+1)))
				j++;
			
			if(j == m)
				found = i;
			i++;
		}
		return found;
	}
	
	public static void main(String[] args)
	{
		BruteForcePatternMatcher run = new BruteForcePatternMatcher();
		String T = "The brute-force method is slow when searching through really long strings.";
		System.out.println(run.bruteForceSearch("strings", T));
		
	}
}

