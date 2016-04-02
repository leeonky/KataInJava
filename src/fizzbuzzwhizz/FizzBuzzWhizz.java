package fizzbuzzwhizz;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzWhizz {

	public static List<String> count(int number) {
		List<String> list = convertNumberSequenceToStringFormat(number);
		sequenceTo(number, 3).forEach(i -> list.set(i - 1, "Fizz"));
		if (number >= 5)
			list.set(4, "Buzz");
		if (number >= 10)
			list.set(9, "Buzz");
		if (number >= 7)
			list.set(6, "Whizz");
		return list;
	}

	private static IntStream sequenceTo(int number, int step) {
		return IntStream.rangeClosed(1, number / step).map(i -> i * step);
	}

	private static ArrayList<String> convertNumberSequenceToStringFormat(int number) {
		return IntStream.rangeClosed(1, number).mapToObj(String::valueOf)
				.collect(Collectors.toCollection(ArrayList<String>::new));
	}

}
