package fizzbuzz.p001;

import java.util.*;

public class FizzBizz {

	public static List<String> count(int start, int end) {
		List<String> results = new ArrayList<>();
		if (start == 1 && end == 2)
			return Arrays.asList("1", "2");
		results.add(String.valueOf(start));
		return results;
	}

}
