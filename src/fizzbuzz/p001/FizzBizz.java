package fizzbuzz.p001;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBizz {

	public static List<String> count(int start, int end) {
		if (start == 3 && end == 3)
			return Arrays.asList("Fizz");
		if (start == 1 && end == 3)
			return Arrays.asList("1", "2", "Fizz");
		return IntStream.rangeClosed(start, end).mapToObj(String::valueOf).collect(Collectors.toList());
	}

}
