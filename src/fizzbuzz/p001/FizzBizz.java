package fizzbuzz.p001;

import java.util.*;

public class FizzBizz {

	public static List<String> count(int start, int end) {
		List<String> results = new ArrayList<>();
		for (int i = start; i <= end; ++i)
			results.add(String.valueOf(i));
		return results;
	}

}
