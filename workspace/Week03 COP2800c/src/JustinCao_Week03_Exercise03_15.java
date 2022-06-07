import java.util.Scanner;

public class JustinCao_Week03_Exercise03_15 {
	public static void main(String[] args) {
		int lotteryNum = (int) (Math.random() * 1000);
		int lotteryDigitOne = lotteryNum / 100;
		int lotteryDigitTwo = (lotteryNum - lotteryDigitOne * 100) / 10;
		int lotteryDigitThree = lotteryNum % 10;

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your a three-digit pick: ");
		int userNum = input.nextInt();
		int userDigitOne = userNum / 100;
		int userDigitTwo = (userNum - userDigitOne * 100) / 10;
		int userDigitThree = userNum % 10;
		
		System.out.println("Lottery Number is " + lotteryNum);

		if (userNum == lotteryNum) {
			System.out.println("Match all numbers and order, you win $10,000");
		} else if ((lotteryDigitOne == userDigitTwo &&

		lotteryDigitTwo == userDigitThree && lotteryDigitThree == userDigitOne) || (lotteryDigitOne == userDigitTwo &&

		lotteryDigitTwo == userDigitOne && lotteryDigitThree == userDigitThree) || (lotteryDigitOne == userDigitOne &&

		lotteryDigitTwo == userDigitThree && lotteryDigitThree == userDigitTwo) || (lotteryDigitOne == userDigitThree &&

		lotteryDigitTwo == userDigitTwo && lotteryDigitThree == userDigitOne) || (lotteryDigitOne == userDigitThree &&

		lotteryDigitTwo == userDigitOne && lotteryDigitThree == userDigitTwo)) {
			System.out.println("Match all numbers, you win $3,000");
		} else if (lotteryDigitOne == userDigitOne ||

		lotteryDigitOne == userDigitTwo || lotteryDigitOne == userDigitThree || lotteryDigitTwo == userDigitOne ||

		lotteryDigitTwo == userDigitTwo || lotteryDigitTwo == userDigitThree || lotteryDigitThree == userDigitOne ||

		lotteryDigitThree == userDigitTwo || lotteryDigitThree == userDigitThree) {
			System.out.println("Match one number, you win $1,000");
		} else
			System.out.println("Sorry, no match, you win $0");

	}

}
