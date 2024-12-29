package dsa.algorithms.sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class HeapSortTests {

    @Test
	@DisplayName("ascending order")
	void sortsArray() {
        int[] actual = {1, 5, 9, 7, 2};
		int[] expected = {1, 2, 5, 7, 9};

        new HeapSort().sort(actual);

		assertArrayEquals(expected, actual, "Array should be in ascending order");
	}
}
