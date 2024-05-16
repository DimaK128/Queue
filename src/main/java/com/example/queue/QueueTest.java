package com.example.queue;

import java.util.NoSuchElementException;

public class QueueTest {
    public static void main(String[] args) {
        // Create a new queue
        Queue<Integer> queue = new Queue<>();

        // Test case 1: Enqueuing elements into the queue
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Test case 2: Dequeuing elements from the queue
        assert queue.dequeue() == 1;
        assert queue.dequeue() == 2;
        assert queue.dequeue() == 3;

        // Test case 3: Enqueuing and dequeuing mixed
        queue.enqueue(4);
        assert queue.dequeue() == 4;

        // Test case 4: Trying to dequeue from an empty queue
        boolean exceptionThrown = false;
        try {
            queue.dequeue();
        } catch (NoSuchElementException e) {
            exceptionThrown = true;
        }
        assert exceptionThrown;

        System.out.println("All test cases passed!");
    }
}
