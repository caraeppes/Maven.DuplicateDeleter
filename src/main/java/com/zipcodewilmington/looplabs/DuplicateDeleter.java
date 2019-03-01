package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected T[] array;

    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
    }

    abstract public T[] removeDuplicates(int maxNumberOfDuplications);
    abstract public T[] removeDuplicatesExactly(int exactNumberOfDuplications);

    public int compareValues(int index) {
        int counter = 0;

        for (int j = 0; j < array.length; j++) {
            if (array[index].equals(array[j])) {
                counter++;
            }
        }
        return counter;
    }




}
