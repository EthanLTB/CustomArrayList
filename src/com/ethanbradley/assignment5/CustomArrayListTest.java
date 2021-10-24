package com.ethanbradley.assignment5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

// TESTS FOR ADD METHOD AND ADD AT INDEX
	@Test
	void should_add_1_element_to_CustomArrayList() {
		CustomList<String> testList = new CustomArrayList<>();

		testList.add("test String");

		assertEquals(testList.get(0), "test String");
	}

	@Test
	void should_add_element_at_given_index() {
		CustomList<String> testList = new CustomArrayList<>();

		for (int i = 0; i < 12; i++) {
			testList.add(String.valueOf(i));
		}

		testList.add(5, "inserted String");

		assertEquals(testList.get(5), "inserted String");
		assertEquals(testList.get(6), "5");
		assertEquals(testList.get(7), "6");
		assertEquals(testList.get(8), "7");
		assertEquals(testList.get(9), "8");
		assertEquals(testList.get(10), "9");
		assertEquals(testList.get(11), "10");
		assertEquals(testList.get(12), "11");

	}

	@Test
	void should_add_element_at_start() {
		CustomList<String> testList = new CustomArrayList<>();

		for (int i = 0; i < 12; i++) {
			testList.add(String.valueOf(i));
		}

		testList.add(0, "inserted String");
		assertEquals(testList.get(0), "inserted String");
		assertEquals(testList.get(1), "0");
		assertEquals(testList.get(2), "1");
		assertEquals(testList.get(3), "2");
		assertEquals(testList.get(4), "3");
		assertEquals(testList.get(5), "4");
		assertEquals(testList.get(6), "5");
		assertEquals(testList.get(7), "6");
		assertEquals(testList.get(8), "7");
		assertEquals(testList.get(9), "8");
		assertEquals(testList.get(10), "9");
		assertEquals(testList.get(11), "10");
		assertEquals(testList.get(12), "11");

	}

	@Test
	void should_add_element_at_end() {
		CustomList<String> testList = new CustomArrayList<>();

		for (int i = 0; i < 12; i++) {
			testList.add(String.valueOf(i));
		}

		testList.add(11, "inserted String");

		assertEquals(testList.get(5), "5");
		assertEquals(testList.get(6), "6");
		assertEquals(testList.get(7), "7");
		assertEquals(testList.get(8), "8");
		assertEquals(testList.get(9), "9");
		assertEquals(testList.get(10), "10");
		assertEquals(testList.get(11), "inserted String");
		assertEquals(testList.get(12), "11");

	}

	@Test
	void should_add_12_items_to_CustomArrayList() {
		CustomList<String> testList = new CustomArrayList<>();

		for (int i = 0; i < 12; i++) {
			testList.add(String.valueOf(i));
		}

		for (int i = 0; i < 12; i++) {
			assertEquals(testList.get(i), String.valueOf(i));
		}

	}

	// TESTS FOR GET METHOD
	@Test
	void should_get_element_at_chosen_index() {
		CustomList<String> testList = new CustomArrayList<>();

		for (int i = 0; i < 12; i++) {
			testList.add(String.valueOf(i));
		}

		assertEquals(testList.get(4), "4");
		assertEquals(testList.get(9), "9");
	}

//TESTS FOR REMOVE METHOD
	@Test
	void should_remove_first_item() {
		CustomList<String> testList = new CustomArrayList<>();

		testList.add("1");
		testList.add("2");
		testList.add("3");
		testList.add("4");

		testList.remove(0);

		assertEquals(testList.get(0), "2");
		assertEquals(testList.get(1), "3");
		assertEquals(testList.get(2), "4");
		assertEquals(testList.get(3), null);

	}

	@Test
	void should_remove_last_element() {
		CustomList<String> testList = new CustomArrayList<>();

		testList.add("1");
		testList.add("2");
		testList.add("3");
		testList.add("4");

		testList.remove(3);

		assertEquals(testList.get(0), "1");
		assertEquals(testList.get(1), "2");
		assertEquals(testList.get(2), "3");
		assertEquals(testList.get(3), null);
	}

	@Test
	void should_remove_middle_element() {
		CustomList<String> testList = new CustomArrayList<>();

		testList.add("1");
		testList.add("2");
		testList.add("3");
		testList.add("4");

		testList.remove(2);

		assertEquals(testList.get(0), "1");
		assertEquals(testList.get(1), "2");
		assertEquals(testList.get(2), "4");
		assertEquals(testList.get(3), null);
	}

//MORE GENERAL TESTS
	@Test
	void should_add_then_remove_then_add_elements_again() {
		CustomList<String> testList = new CustomArrayList<>();
		testList.add("1");
		testList.add("2");
		testList.add("3");
		testList.add("4");
		testList.add("5");
		testList.add("6");
		testList.add("7");
		testList.add("8");
		testList.add("9");
		testList.add("10");
		testList.add("11");
		testList.add("12");

		testList.remove(0);
		testList.remove(0);
		testList.remove(0);
		testList.remove(0);
		testList.remove(0);
		testList.remove(0);
		testList.remove(0);
		testList.remove(0);
		testList.remove(0);
		testList.remove(0);
		testList.remove(0);
		testList.remove(0);

		testList.add("1");
		testList.add("2");
		testList.add("3");
		testList.add("4");
		testList.add("5");
		testList.add("6");
		testList.add("7");
		testList.add("8");
		testList.add("9");
		testList.add("10");
		testList.add("11");
		testList.add("12");

		assertEquals(testList.get(0), "1");
		assertEquals(testList.get(1), "2");
		assertEquals(testList.get(2), "3");
		assertEquals(testList.get(3), "4");
		assertEquals(testList.get(4), "5");
		assertEquals(testList.get(5), "6");
		assertEquals(testList.get(6), "7");
		assertEquals(testList.get(7), "8");
		assertEquals(testList.get(8), "9");
		assertEquals(testList.get(9), "10");
		assertEquals(testList.get(10), "11");
		assertEquals(testList.get(11), "12");

	}

	@Test
	void should_getSize_of_elements_after_removing_and_adding() {
		CustomList<String> testList = new CustomArrayList<>();
		testList.add("1");
		testList.add("2");
		testList.add("3");
		testList.add("4");
		testList.add("5");
		testList.add("6");
		testList.add("7");
		testList.add("8");
		testList.add("9");
		testList.add("10");
		testList.add("11");
		testList.add("12");

		testList.remove(0);
		testList.remove(0);
		testList.remove(0);
		testList.remove(0);
		testList.remove(0);
		testList.remove(0);
		testList.remove(0);
		testList.remove(0);
		testList.remove(0);
		testList.remove(0);
		testList.remove(0);
		testList.remove(0);

		testList.add("1");
		testList.add("2");
		testList.add("3");
		testList.add("4");
		testList.add("5");
		testList.add("6");
		testList.add("7");
		testList.add("8");
		testList.add("9");
		testList.add("10");
		testList.add("11");
		testList.add("12");

		assertEquals(testList.getSize(), 12);
	}

	@Test
	void should_getSize_of_elements_after_removing_elements() {
		CustomList<String> testList = new CustomArrayList<>();
		testList.add("1");
		testList.add("2");
		testList.add("3");
		testList.add("4");
		testList.add("5");
		testList.add("6");
		testList.add("7");
		testList.add("8");
		testList.add("9");
		testList.add("10");
		testList.add("11");
		testList.add("12");

		testList.remove(0);
		testList.remove(0);
		testList.remove(0);
		testList.remove(0);
		testList.remove(0);
		testList.remove(0);

		assertEquals(testList.getSize(), 6);
	}

}