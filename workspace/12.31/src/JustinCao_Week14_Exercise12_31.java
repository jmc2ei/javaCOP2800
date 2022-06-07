import java.io.File;
import java.util.*;

public class JustinCao_Week14_Exercise12_31 {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = input.nextInt();
		System.out.println("Enter the Gender: ");
		char gender = input.next().charAt(0);
		System.out.println("Enter the name: ");
		String name = input.next();

		File file = new File("/Users/JustinCao/Downloads/Babynames/Babynamesranking" + year + ".txt");

		Scanner fileInput = new Scanner(file);
		int rank;
		int found = 0;
		String maleName;
		String femaleName;
		while (fileInput.hasNext() && found == 0) {
			rank = fileInput.nextInt();
			maleName = fileInput.next();
			fileInput.next();
			femaleName = fileInput.next();
			fileInput.next();

			if (gender == 'M') {
				if (maleName.equals(name)) {
					System.out.println("" + name + " is ranked " + rank);
					found = 1;

				}

			}
			if (gender == 'F') {
				if (femaleName.equals(name)) {
					System.out.println("Rank is " + rank);
					found = 1;
				}
			}

		}
		if (found == 0) {
			System.out.println("The name " + name + "is not ranked in year " + year);
		}

	}

}
