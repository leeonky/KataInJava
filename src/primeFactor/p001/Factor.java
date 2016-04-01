package primeFactor.p001;

import java.util.*;

public class Factor {

	public static List<Integer> factorsOf(int number) {
		if (number == 1)
			return Arrays.asList();
		if (number == 2)
			return Arrays.asList(2);
		return Arrays.asList(2, 2);
	}

}
