
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// #3 on Problem. Create two variables for the following real life examples.
		float itemPrice1 = (float) 14.50;
		float itemPrice2 = (float) 17.20;
		float moneyInWallet1 = (float) 50.25;
		float moneyInWallet2 = (float) 70.50;
		int numOfFriends1 = 5;
		int numOfFriends2 = 10;
		int ageInYears1 = 30;
		int ageInYears2 = 35;
		String firstName1 = "Samantha";
		String firstName2 = "Nichole";
		String lastName1 = "Glenn";
		String lastName2 = "Garcia";
		char middleInitial1 = 'C';
		char middleInitial2 = 'M';
		
		// 4a. New amount of money in wallet after buying the item 
		float newAmountMoney1 = moneyInWallet1 - itemPrice1; 
		float newAmountMoney2 = moneyInWallet2 - itemPrice2; 
		// 4b. Number of friends you've made each year based on age variable and your number of friends variable. 
		int numOfFriendsYrEx1 = ageInYears1 / numOfFriends1; 
		int numOfFriendsYrEx2 = ageInYears2 / numOfFriends2; 
		// 4c. Full name based on first name, middle initial, and last name.
		String fullName1 = firstName1 + " "+ middleInitial1 + " " + lastName1; 
		String fullName2 = firstName2 + " " + middleInitial2 + " " + lastName2;
		
		// 5 -Using Sytem.outprintln to print to the console 
		System.out.println("I have exactly $" + newAmountMoney1 + " in my wallet.");
		System.out.println("My coworker has exactly $" + newAmountMoney2 + " in his wallet.");
		System.out.println("I have made about "+ numOfFriendsYrEx1 + " friends for each year I have been alive,");
		System.out.println("My wife has made about " + numOfFriendsYrEx2 + " friends for each year she has been alive.");
		System.out.println("My full name is " + fullName1);
		System.out.println("My friend's name is " + fullName2);
		
		
	}

}
