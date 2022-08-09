package com.mahbubalam.algorithms.datastructure.stack;

public class IntStack implements Stack{

    int[] array;
    int top=0;

    public IntStack(int maxSize) {
        array= new int[maxSize];
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public void push(int elem) {
        array[top++] = elem;

    }

    @Override
    public int pop() {
        return array[--top];
    }

    @Override
    public int peek() {
        return array[top-1];
    }
}
