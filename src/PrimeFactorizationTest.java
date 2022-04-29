public class PrimeFactorizationTest {

	public static void main(String[] args) {

		for (int i = 2; i < 100000; i++) {
			
			System.out.println(i + " = " + PrimeFactorization.primeFactorization(i));
		}
	}
}