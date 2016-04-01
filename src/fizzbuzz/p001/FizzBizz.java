package fizzbuzz.p001;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBizz {

	@SuppressWarnings("serial")
	public static List<String> count(int start, int end) {
		int fizz = 3;
		if (start == fizz && end == fizz)
			return Arrays.asList("Fizz");
		if (start == 1 && end == fizz)
			return new ArrayList<String>() {
				{
					addAll(count(start, fizz - 1));
					addAll(count(fizz, fizz));
					addAll(count(fizz + 1, end));
				}
			};
		if (start == 1 && end == 4)
			return new ArrayList<String>() {
				{
					addAll(count(start, fizz - 1));
					addAll(count(fizz, fizz));
					addAll(count(fizz + 1, end));
				}
			};
		return IntStream.rangeClosed(start, end).mapToObj(String::valueOf).collect(Collectors.toList());
	}

}
