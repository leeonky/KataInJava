package primeFactor.p001;

import java.util.*;

public class Factor {

	public static List<Integer> factorsOf(int number) {
		if (number == 1)
			return Arrays.asList();
		int factor = firstDivideableFactor(number);
		return mergeList(factor, factorsOf(number / factor));
	}

	private static int firstDivideableFactor(int number) {
		int factor = 2;
		for (; number % factor != 0; factor++)
			;
		return factor;
	}

	@SuppressWarnings("serial")
	private static ArrayList<Integer> mergeList(int factor, List<Integer> factors) {
		return new ArrayList<Integer>() {
			{
				add(factor);
				addAll(factors);
			}
		};
	}

}
