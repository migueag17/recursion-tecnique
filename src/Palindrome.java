
public class Palindrome {

	public static void main(String[] args) {
		int arreglo[] = {1,2,1};
		System.out.println(palindrome(arreglo,0, 2));
	}
	static int palindrome(int []array, int limIzq, int limDer) {
		if (limIzq == limDer) {
			return 1;
		}else {
			if (array[limIzq] == array[limDer])	
				return palindrome(array, limIzq+1, limDer-1);			
			}
		return 0;
		}

	}
