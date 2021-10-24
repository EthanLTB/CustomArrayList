package com.ethanbradley.assignment5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	 void should_add_1_element_to_CustomArrayList() {
		CustomList<String> testList = new CustomArrayList<>();
		
		
		testList.add("test String");
		
		assertEquals(testList.get(0), "test String");
	}
  
	
	@Test
	void should_add_12_items_to_CustomArrayList() {
		CustomList<String> testList = new CustomArrayList<>();
		
		for(int i = 0; i < 12; i++) {
			testList.add(String.valueOf(i));
		}
		
		for(int i = 0; i < 12; i++) {
			assertEquals(testList.get(i), String.valueOf(i) );
		}
	
	}
	
	@Test
	void should_get_element_at_chosen_index() {
	CustomList<String> testList = new CustomArrayList<>();
		
		for(int i = 0; i < 12; i++) {
			testList.add(String.valueOf(i));
		}
		
		assertEquals(testList.get(4), "4");
		assertEquals(testList.get(9), "9");
	}
	
	@Test
	void should_add_element_at_given_index() {
		CustomList<String> testList = new CustomArrayList<>();
		
		for(int i = 0; i < 12; i++) {
			testList.add(String.valueOf(i));
		}
		
     testList.add(5, "inserted String");
    
     
     assertEquals(testList.get(5), "inserted String"); assertEquals(testList.get(6), "5");
     assertEquals(testList.get(7), "6"); assertEquals(testList.get(8), "7");
     assertEquals(testList.get(9), "8");  assertEquals(testList.get(10), "9");
     assertEquals(testList.get(11), "10");  assertEquals(testList.get(12), "11");
    
		
	}
@Test
void should_remove_an_item() {
	CustomList<String> testList = new CustomArrayList<>();
	
	for(int i = 0; i < 12; i++) {
		testList.add(String.valueOf(i));
	}
		testList.remove(7);
		System.out.println(testList.get(11));
	assertEquals(testList.get(7), "8");assertEquals(testList.get(8), "9");
	assertEquals(testList.get(9), "10"); assertEquals(testList.get(10), "11");
	assertEquals(testList.get(11), null);
	}
}
