import java.util.Scanner;
import java.util.ArrayList;

public class JustinCao_Week12_Exercise11_13 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter then integers: ");
		int[] userInts = new int[10];

		for (int i = 0; i < 10; i++) {
			userInts[i] = input.nextInt();
			list.add(userInts[i]);
		}
		
		duplicate(list);

		System.out.print("The Distinct integers are ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

	}

	public static void duplicate(ArrayList<Integer> list) {
		
		for (int i = 0; i < list.size(); i++) {
			Integer lst = list.get(i);
			java.util.List<Integer> sublist = list.subList(i + 1, list.size());
			
			while (sublist.contains(lst)) {
				sublist.remove(lst);
			}
		}
	}
}
