import java.util.Scanner;

public class Week02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a monthly saving amount: ");
		double monthlyInput = input.nextDouble();
		double monthlyInterest = 1.00417;
		double accountValue =0;

		accountValue = (accountValue + monthlyInput)*monthlyInterest;
		accountValue = (accountValue + monthlyInput)*monthlyInterest;
		accountValue = (accountValue + monthlyInput)*monthlyInterest;
		accountValue = (accountValue + monthlyInput)*monthlyInterest;
		accountValue = (accountValue + monthlyInput)*monthlyInterest;
		accountValue = (accountValue + monthlyInput)*monthlyInterest;
		System.out.println("After the sixth month, the account value is: $" +accountValue);
		
	}

}
