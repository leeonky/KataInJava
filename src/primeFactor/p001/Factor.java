package primeFactor.p001;

import java.util.*;

public class Factor {

	public static List<Integer> factorsOf(int number) {
		if (number == 1)
			return Arrays.asList();
		if (number == 2)
			return Arrays.asList(2);
		if (number == 4)
			return Arrays.asList(2, 2);
		return mergeList(2, factorsOf(number / 2));
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
