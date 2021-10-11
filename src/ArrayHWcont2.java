
public class ArrayHWcont2 {
	static String fullName (String firstName, String lastName) {
	return firstName + " " + lastName; 
	}
	
	static boolean greaterSum (int arr[]) { 
		int sum = 0; 
		for (int p = arr.length - arr.length; p < arr.length; p++) {
			sum += arr[p]; 
		}
		if(sum > 100) {
			return true; 
		} else {
			return false; 
		}
	}
	
	static double avg (double aray[]) {
		double always = 0.0;
		for (int l = aray.length - aray.length; l < aray.length; l++) {
			always += aray[l]; 
		}
		double average = always / aray.length; 
		return average;
	}
	static boolean awesome (double A[], double B[]) { 
		double someOne = 0.0; 
		double someTwo = 0.0;
		for (int s = A.length - A.length; s < A.length; s++) {
			someOne += A[s];  
		}
		for (int s = B.length - B.length; s < B.length; s++) {
			someTwo += B[s]; 
		}
		double ave1 = someOne / A.length; 
		double ave2 = someTwo / B.length; 
		if (ave1 > ave2) { 
		return true; 
		} else { 
		return false; 
		}
}
	static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true; 
		} else {
		return false;
		}
	}
	static String fullName (String Amanda, String Pizza) {
		return Amanda + " " + Pizza; {
			
		}
	public static void main(String[] args) {
/*8.Write a method that takes two Strings, firstName and lastName, and returns a full name
 (the full name should be the first and the last name as a String separated by a space). */
	String fullName1 = fullName ("Lisbeth","Garcia");
		System.out.println(fullName1);
		
/*9.Write a method that takes an array 
 * of int and returns true if the sum of all the ints in the array is greater than 100.*/
	int arr [] = {1, 10, 15};
	boolean greatest = greaterSum (arr); 
	System.out.println(greatest);
/*10.Write a method that takes an array of double and returns the average of
   all the elements in the array.*/
	double A[] = {1, 10.20, 5.76}; 
	double elements = avg (A); 
	System.out.println(elements);
/*11.	Write a method that takes two arrays of double and
 returns true if the average of the elements in the first array is
 greater than the average of the elements in the second array.*/
	double C[] = {1.3, 1.3, 1.3}; 
	double B[] = {4.7, 5.2, 6.2};
	boolean kind = awesome (C, B); 
	System.out.println(kind);
/*12.Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
 *  and returns true if it is hot outside and if moneyInPocket is greater than 10.50.*/
	boolean money = willBuyDrink (true, 12.50);
	System.out.println(money);
/*13.Create a method of your own that solves a problem. 
 * In comments, write what the method does and why you created it.
 */
	String funnyName = fullName ("Lis","Awesome");
	System.out.println(funnyName);
	}
}