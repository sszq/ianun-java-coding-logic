package com.ianun.section3.chapter1generic.part1notion0principium;

import java.util.Arrays;

/**
 * @author ....: WangQk
 * @project....: ianun-java-coding-logic
 * @description:
 * @date ......: 2021-01-06
 */
public class DynamicArray<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;

    public DynamicArray() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity < elementData.length) {
            return;
        }

        int newCapacity = elementData.length * 2;
        if (newCapacity < minCapacity) {
            newCapacity = minCapacity;
        }
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public E get(int index) {
        return (E) elementData[index];
    }

    public E set(int index, E element) {
        E old = get(index);
        elementData[index] = element;
        return old;
    }

    public void add(E e) {
        int length = elementData.length + 1;
        ensureCapacity(length);
        elementData[length] = e;
    }

}
