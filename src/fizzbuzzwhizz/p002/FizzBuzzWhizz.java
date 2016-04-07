package fizzbuzzwhizz.p002;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzWhizz {

	public static List<String> count(int to) {
		List<String> result = mapSequenceInStringList(to);
		processFizzRule(3, to, result, "Fizz");
		processFizzRule(5, to, result, "Buzz");
		if (7 <= to)
			result.set(6, "Whizz");
		return result;
	}

	private static void processFizzRule(int step, int to, List<String> result, String word) {
		IntStream.rangeClosed(1, to / step).map(i -> i * step - 1).forEach(i -> result.set(i, word));
	}

	private static List<String> mapSequenceInStringList(int to) {
		return IntStream.rangeClosed(1, to).mapToObj(String::valueOf).collect(Collectors.toList());
	}

}
