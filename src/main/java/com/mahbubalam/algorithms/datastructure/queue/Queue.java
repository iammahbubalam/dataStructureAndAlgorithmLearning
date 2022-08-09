package com.mahbubalam.algorithms.datastructure.queue;

public interface Queue {
    public void offer(int elem);

    public int poll();

    public int peek();

    public int size();

    public boolean isEmpty();
}
