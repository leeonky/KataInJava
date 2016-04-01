package primeFactor.p001;

import java.util.*;
import java.util.stream.IntStream;

public class Factor {

	public static List<Integer> factorsOf(int number) {
		return factorsOf(number, 2);
	}

	private static List<Integer> factorsOf(int number, int firstFactor) {
		if (number == 1)
			return Arrays.asList();
		int factor = IntStream.rangeClosed(firstFactor, number).filter(i -> number % i == 0).findFirst().getAsInt();
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
