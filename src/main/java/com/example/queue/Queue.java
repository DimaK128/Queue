package com.example.queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;

class Queue<T> extends LinkedList<T> {
    // Method to enqueue an item into the queue
    public void enqueue(T item) {
        addLast(item);
    }

    // Method to dequeue an item from the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return removeFirst();
    }
}
