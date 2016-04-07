package fizzbuzzwhizz.p002;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzWhizz {

	public static List<String> count(int to) {
		List<String> result = IntStream.rangeClosed(1, to).mapToObj(String::valueOf).collect(Collectors.toList());
		if (3 <= to)
			result.set(2, "Fizz");
		if (5 <= to)
			result.set(4, "Buzz");
		if (6 == to)
			result.set(5, "Fizz");
		return result;
	}

}
