import java.util.Scanner;

public class JustinCao_Week09_Exercise09_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int r;
		int c;
		int i2 = 0;
		int i3 = 0;

		System.out.print("Enter the number of rows and columns in the array: ");

		r = input.nextInt();
		c = input.nextInt();

		double[][] array = new double[r][c];
		System.out.println("Enter the array: ");

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++)
				array[i][j] = input.nextDouble();
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++)
				if (array[i][j] > array[i2][i3]) {
					i2 = i;
					i3 = j;
				}
		}
		System.out.println("The location of the largest element is " + array[i2][i3] + " at (" + i2 + "," + i3 + ")");

	}

}
