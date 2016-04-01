package fizzbuzz.p001;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBizz {

	public static List<String> count(int start, int end) {
		return IntStream.rangeClosed(start, end).mapToObj(String::valueOf).collect(Collectors.toList());
	}

}
