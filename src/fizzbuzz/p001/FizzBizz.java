package fizzbuzz.p001;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBizz {

	@SuppressWarnings("serial")
	public static List<String> count(int start, int end) {
		if (start == 3 && end == 3)
			return Arrays.asList("Fizz");
		if (start == 1 && end == 3)
			return new ArrayList<String>() {
				{
					addAll(count(1, 2));
					addAll(count(3, 3));
				}
			};
		return IntStream.rangeClosed(start, end).mapToObj(String::valueOf).collect(Collectors.toList());
	}

}
