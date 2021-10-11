
public class ArrayHWcont {
	static String method(String word, int n) { 
		String happy = ""; 
			for (int i = n - n; i < n; i++) {
				happy += word;
			}
			return happy; 
	}
	public static void main(String[] args) {
	String names [] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	int num = 0;
	// 2A. a.	Use a loop to iterate through the array and 
	//calculate the average number of letters per name. Print the result to the console.
	for (int i = names.length - names.length; i < names.length; i++) { num += names[i].length();
	}
	int average = (num / names.length);
	System.out.println("The average is" + " " + average);
	System.out.println(num);
	//2B.b.	Use a loop to iterate through the array again and 
    //concatenate all the names together, separated by spaces, and print the result to the console.
	String nameTogether = ""; 
	for (int i = names.length - names.length; i < names.length; i++) { 
		nameTogether += names [i] + " ";
	}
	System.out.println(nameTogether);
	//3.	How do you access the last element of any array? arrayname [arrayname.length -1] 
	//4.	How do you access the first element of any array? arrayname [arrayname.length - arrayname.length]
	//5.	Create a new array of int called nameLengths. Write a loop to iterate over the
	//previously created names array and add the length of each name to the nameLengths array.
	int nameLengths [] = new int[6]; 
	for (int K = names.length - names.length; K < names.length; K++) { 
		nameLengths[K] = names[K].length(); 
	}
	//6.	Write a loop to iterate over the nameLengths array and calculate 
	//the sum of all the elements in the array. Print the result to the console.
	int sum1 = 0;
	for (int K = names.length - names.length; K < names.length; K++) { 
		sum1 += nameLengths[K]; 
	}
	System.out.println(sum1);
	/*7. Write a method that takes a String, word, and an int, n, as arguments and returns the word 
	concatenated to itself n number of times. 
	(i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).*/
	String cat = method ("Dog", 3);
	System.out.println(cat);
	
	}
} 
	


	

