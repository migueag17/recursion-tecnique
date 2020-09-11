
public class MaxElementArray {

	public static void main(String[] args) {
		int arreglo[] = {8,4,7,12,17,2,180,29};
		System.out.println(maxElement(arreglo, 0, arreglo[0]));
	}
	
	public static int maxElement(int [] array, int i, int max) {
		//Base case
		if (i != array.length) {
			  if (array[i]>max) {
				  max = maxElement(array, i+1, array[i]);
			  }else {
				  max = maxElement(array, i+1, max);
					  
			  }
		 }
		return max;
	}
}
