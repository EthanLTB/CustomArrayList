package com.ethanbradley.assignment5;

import java.util.Arrays;

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

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {

		return (T) items[index];
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (currentSize == items.length) {
			doubleArraySize();
		}
		for(int i = currentSize; i > index; i--) {
			items[i] = items[i-1];
		}
		items[index] = item;
		currentSize++;
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if(currentSize == (items.length / 2)){
			shrinkArraySize();
		}
		items[index] = null;
		for(int i = index; i < items.length - 1; i ++) {
			items[i] = items[i + 1];
		}
		currentSize--;
		return (T) items;
	}
	
	public void shrinkArraySize() {
		Object[] smallerArray = Arrays.copyOf(items, (currentSize));
		items = smallerArray;
	}

}
