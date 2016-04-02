package fizzbuzzwhizz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzWhizz {

	public static List<String> count(int number) {
		return IntStream.rangeClosed(1, number).mapToObj(String::valueOf).collect(Collectors.toList());
	}

}
