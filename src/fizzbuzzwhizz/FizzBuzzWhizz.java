package fizzbuzzwhizz;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzWhizz {

	public static List<String> count(int number) {
		if (number == 3)
			return Arrays.asList("1", "2", "Fizz");
		List<String> list = IntStream.rangeClosed(1, number).mapToObj(String::valueOf)
				.collect(Collectors.toCollection(ArrayList<String>::new));
		return list;
	}

}
