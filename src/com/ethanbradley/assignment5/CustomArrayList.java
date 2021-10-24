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

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		checkRangeForIndex(index);
		return (T) items[index];
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		checkRangeForIndex(index);
		if (currentSize == items.length) {
			doubleArraySize();
		}
		for (int i = currentSize + 1; i > index; i--) {
			items[i] = items[i - 1];
		}
		items[index] = item;
		currentSize++;
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		checkRangeForIndex(index);
		if (currentSize == (items.length / 2)) {
			shrinkArraySize();
		}
		T removedItem = (T) items[index];
		for (int i = index; i < items.length - 1; i++) {
			items[i] = items[i + 1];
		}
		currentSize--;
		return (T) removedItem;
	}

	public void shrinkArraySize() {
		Object[] smallerArray = Arrays.copyOf(items, (currentSize));
		items = smallerArray;
	}

	private void checkRangeForIndex(int index) {
		if (index > currentSize) {
			throw new IndexOutOfBoundsException();
		}
	}

	public void doubleArraySize() {
		Object[] biggerArray = Arrays.copyOf(items, (items.length * 2));
		items = biggerArray;
	}

}
