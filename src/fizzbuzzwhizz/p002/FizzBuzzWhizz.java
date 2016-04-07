package fizzbuzzwhizz.p002;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzWhizz {

	public static List<String> count(int to) {
		List<String> result = mapSequenceInStringList(to);
		processFizzRule(3, to, result, "Fizz");
		processFizzRule(5, to, result, "Buzz");
		processFizzRule(7, to, result, "Whizz");
		processFizzRule(3 * 5, to, result, "FizzBuzz");
		processFizzRule(3 * 7, to, result, "FizzWhizz");
		processFizzRule(5 * 7, to, result, "BuzzWhizz");
		processNumbersContain3(to, result);
		return result;
	}

	private static void processNumbersContain3(int to, List<String> result) {
		IntStream.rangeClosed(1, to).filter(i -> String.valueOf(i).contains("3"))
				.forEach(i -> result.set(i - 1, "Fizz"));
	}

	private static void processFizzRule(int step, int to, List<String> result, String word) {
		IntStream.rangeClosed(1, to / step).map(i -> i * step - 1).forEach(i -> result.set(i, word));
	}

	private static List<String> mapSequenceInStringList(int to) {
		return IntStream.rangeClosed(1, to).mapToObj(String::valueOf).collect(Collectors.toList());
	}

}
