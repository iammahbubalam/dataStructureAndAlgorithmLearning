package com.mahbubalam.algorithms.datastructure.stack;

public interface Stack {
    public int size();

    // return if the stack is empty
    public boolean isEmpty();

    // push the element on the stack
    public void push(int elem);

    // pop the element off the stack
    public int pop();

    public int peek();
}
