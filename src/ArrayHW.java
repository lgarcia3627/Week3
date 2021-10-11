
public class ArrayHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1A.Create an array of int called ages that contains 3,9,23,64,2,8,28,93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		// 1B. Add new array 
		int[] age = {3, 9, 23, 64, 2, 8, 28, 93, 100};
		
		int last = ages[ages.length  -1];
	    int first = ages[ages.length - ages.length];
	    int diff = last - first; 
	    System.out.println(diff);
	    // 1B.
	    ages = age;
	    last = ages[ages.length  -1];
	    first = ages[ages.length - ages.length];
	    diff = last - first; 
	    System.out.println(diff);
	    // 1C. Use loop to iterate through the array and calculate the average age. 
	    int sum = 0;
	    for (int i = ages.length - ages.length; i < ages.length; i++) { sum += ages[i];  
	    
	    }
	    double average = ((double) sum  / ages.length);
	    System.out.println(average);
	}
		
}
