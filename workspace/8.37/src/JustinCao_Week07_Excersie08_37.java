import java.util.Scanner;

public class JustinCao_Week07_Excersie08_37 {
	public static void main(String Args[]) {
		String[][] arrayOfCapitals = {
	            {"Alabama", "Montgomery"},
	            {"Alaska", "Juneau"},
	            {"Arizona", "Phoenix"},
	            {"Arkansas", "Little Rock"},
	            {"California", "Sacramento"},
	            {"Colorado", "Denver"},
	            {"Connecticut", "Hartford"},
	            {"Delaware", "Dover"},
	            {"Florida", "Tallahassee"},
	            {"Georgia", "Atlanta"},
	            {"Hawaii", "Honolulu"},
	            {"Idaho", "Boise"},
	            {"Illinois", "Springfield"},
	            {"Indiana", "Indianapolis"},
	            {"Iowa", "Des Moines"},
	            {"Kansas", "Topeka"},
	            {"Kentucky", "Frankfort"},
	            {"Louisiana", "Baton Rouge"},
	            {"Maine", "Augusta"},
	            {"Maryland", "Annapolis"},
	            {"Massachusettes", "Boston"},
	            {"Michigan", "Lansing"},
	            {"Minnesota", "Saint Paul"},
	            {"Mississippi", "Jackson"},
	            {"Missouri", "Jefferson City"},
	            {"Montana", "Helena"},
	            {"Nebraska", "Lincoln"},
	            {"Nevada", "Carson City"},
	            {"New Hampshire", "Concord"},
	            {"New Jersey", "Trenton"},
	            {"New York", "Albany"},
	            {"New Mexico", "Santa Fe"},
	            {"North Carolina", "Raleigh"},
	            {"North Dakota", "Bismark"},
	            {"Ohio", "Columbus"},
	            {"Oklahoma", "Oklahoma City"},
	            {"Oregon", "Salem"},
	            {"Pennslyvania", "Harrisburg"},
	            {"Rhode Island", "Providence"},
	            {"South Carolina", "Columbia"},
	            {"South Dakota", "Pierre"},
	            {"Tennessee", "Nashville"},
	            {"Texas", "Austin"},
	            {"Utah", "Salt Lake City"},
	            {"Vermont", "Montpelier"},
	            {"Virginia", "Richmond"},
	            {"Washington", "Olympia"},
	            {"West Virginia", "Charleston"},
	            {"Wisconsin", "Madison"},
	            {"Wyoming", "Cheyenne"}
	          };
		Scanner input = new Scanner(System.in);
		int correctCount = 0;

		for (int i = 0; i < arrayOfCapitals.length; i++) {
			System.out.println("What is the capital of " + arrayOfCapitals[i][0] + "?");
			if (input.nextLine().equalsIgnoreCase(arrayOfCapitals[i][1])) {
				System.out.println("Your answer is correct");
				correctCount++;
			} else
				System.out.println("The correct answer should be " + arrayOfCapitals[i][1]);

		}
		System.out.println("The correct count is: " + correctCount);
	}
}