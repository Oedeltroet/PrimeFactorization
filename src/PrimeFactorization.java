import java.util.LinkedList;

public class PrimeFactorization {
	
	/**
	 * Checks if the given integer is a prime number.
	 * 
	 * @param n	the integer to be checked
	 * 
	 * @return	true if n is a prime
	 * 
	 * @author	Teo Förste
	 */
	public static boolean isPrime(int n) {  // not even necessary for prime factorization
		
		for (int i = 2; i <= n/2; i++) {
			
			if (n % i == 0) {
				
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * Calculates the prime factors of the given integer.
	 * 
	 * @param n	the integer to calculate the prime factors of
	 * 
	 * @return	a {@link LinkedList} containing the prime factors of n
	 * 
	 * @author	Teo Förste
	 */
	public static LinkedList<Integer> primeFactorization(int n) {
		
		LinkedList primeFactors = new LinkedList<Integer>();
		
		if (n > 1) {
			
			int i = 2;
			
			while(n > 1) {
				
				if (n % i == 0) {
					
					primeFactors.add(i);
					n /= i;
				}
				
				else {
					
					i++;
				}
			}
		}
		
		return primeFactors;
	}
}