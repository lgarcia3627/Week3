
public class ArrayHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an array of int called ages that contains 3,9,23,64,2,8,28,93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int last = ages[ages.length  -1];
	    int first = ages[ages.length - ages.length];
	    int diff = last - first; 
	    System.out.println(diff);
	}
		
}
