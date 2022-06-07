public class JustinCao_Week07_Exercise07_23 {
	
	public static void main(String[] args) {

		boolean[] locker = new boolean[101];

		for (int i = 1; i < locker.length; i++) {
			locker[i] = true;
		}

		for (int i2 = 2; i2 < locker.length; i2++) {
			for (int k = i2; k < locker.length; k = k + i2) {
				if (locker[k] == false)
					locker[k] = true;
				else
					locker[k] = false;
			}
		}

		for (int i2 = 1; i2 < locker.length; i2++) {
			if (locker[i2] == true) {
				System.out.println("Locker " + i2 + " Open");
			}
		}
	}

}
