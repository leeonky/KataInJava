package primeFactor.p001;

import java.util.*;
import java.util.stream.IntStream;

public class Factor {

	public static List<Integer> factorsOf(int number) {
		if (number == 1)
			return Arrays.asList();
		int factor = firstDivideableFactor(number);
		return mergeList(factor, factorsOf(number / factor));
	}

	private static int firstDivideableFactor(int number) {
		return IntStream.rangeClosed(2, number).filter(i -> number % i == 0).findFirst().getAsInt();
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
