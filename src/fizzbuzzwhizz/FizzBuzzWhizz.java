package fizzbuzzwhizz;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzWhizz {

	public static List<String> count(int number) {
		List<String> list = convertNumberSequenceToStringFormat(number);
		listIndexSequenceTo(number, 3).forEach(i -> list.set(i, "Fizz"));
		listIndexSequenceTo(number, 5).forEach(i -> list.set(i, "Buzz"));
		listIndexSequenceTo(number, 7).forEach(i -> list.set(i, "Whizz"));
		listIndexSequenceTo(number, 1).filter(i -> list.get(i).contains("3")).forEach(i -> list.set(i, "Fizz"));
		return list;
	}

	private static IntStream listIndexSequenceTo(int number, int step) {
		return IntStream.rangeClosed(1, number / step).map(i -> i * step - 1);
	}

	private static ArrayList<String> convertNumberSequenceToStringFormat(int number) {
		return IntStream.rangeClosed(1, number).mapToObj(String::valueOf)
				.collect(Collectors.toCollection(ArrayList<String>::new));
	}

}
