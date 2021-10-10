package com.ethanbradley.assignment5;

import java.util.Arrays;


//import java.util.Iterator;

public class CustomArrayList<T> implements CustomList<T> {
	private final int DEFAULT_SIZE = 10;
	private int currentSize = 0;
	Object[] items = new Object[DEFAULT_SIZE];

	@Override
	public boolean add(T item) {
		if (currentSize == items.length) {
			doubleArraySize();
		}
		items[currentSize] = item;
		currentSize++;

		return true;
	}

	@Override
	public int getSize() {

		return currentSize;
	}

	public void doubleArraySize() {
		Object[] biggerArray = Arrays.copyOf(items, (currentSize * 2));
		items = biggerArray;
	}

	@Override
	public T get(int index) {
	
		return  (T) items[index];
	}



}
