package fizzbuzzwhizz.p002;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzWhizz {

	public static List<String> count(int to) {
		List<String> result = mapSequenceInStringList(to);
		IntStream.rangeClosed(1, to / 3).map(i -> i * 3 - 1).forEach(i -> result.set(i, "Fizz"));
		if (5 <= to)
			result.set(4, "Buzz");
		return result;
	}

	private static List<String> mapSequenceInStringList(int to) {
		return IntStream.rangeClosed(1, to).mapToObj(String::valueOf).collect(Collectors.toList());
	}

}
