
public class CountDigitsNumber {
	public static void main(String[] args) {
		int n = 89240909;
		System.out.println(contarCifras(n, 0));
	}

	public static int contarCifras(int n, int contador){
        if(n > 0 ) {  //caso base
           return contarCifras(n/10, contador) + 1;
        }
           return contador;
	}
	
} 