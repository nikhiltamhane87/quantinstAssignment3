
public class NaturalNos {

	static int sum = 0;

	public static void main(String[] args) {

		for (int i = 1; i < 1000; i++) {

			if (i % 3 == 0 || i % 5 == 0)

				sum = sum + i;

		}

		System.out.println("The total sum of natural numbers that are either multiple of 3 or 5  below 1000 is  : " + sum);

	}

}