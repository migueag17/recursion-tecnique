
public class Prime {

	public static void main(String[] args) {
		int n = 18;
		int contador = n;
		boolean isPrime = prime(n, contador-1);
		System.out.println( isPrime );
	}

	public static boolean prime(int n,int contador) {
		//Base case
		if(contador == 1) {
			return true;
		}
		// Solve part of the problem
		else
			if (n%contador == 0)
			{
				return false;
			}
		// Smallest problem
		return prime(n, contador-1);
	}
}