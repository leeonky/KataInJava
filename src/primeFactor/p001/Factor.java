package primeFactor.p001;

import java.util.*;

public class Factor {

	public static List<Integer> factorsOf(int number) {
		if (number == 1)
			return Arrays.asList();
		int factor = 2;
		if (number % factor == 0)
			return mergeList(factor, factorsOf(number / factor));
		factor++;
		if (number % factor == 0)
			return mergeList(factor, factorsOf(number / factor));
		factor++;
		if (number % factor == 0)
			return mergeList(factor, factorsOf(number / factor));
		factor++;
		return mergeList(factor, factorsOf(number / factor));
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
