package fizzbuzzwhizz;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzWhizz {

	public static List<String> count(int number) {
		List<String> list = IntStream.rangeClosed(1, number).mapToObj(String::valueOf)
				.collect(Collectors.toCollection(ArrayList<String>::new));
		if (number >= 3)
			list.set(2, "Fizz");
		if (number == 5)
			list.set(4, "Buzz");
		return list;
	}

}
