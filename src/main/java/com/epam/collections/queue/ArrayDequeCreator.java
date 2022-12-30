package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        addElements(arrayDeque, firstQueue, 2);
        addElements(arrayDeque, secondQueue, 2);
        while (firstQueue.size() > 0 && secondQueue.size() > 0) {
            addAndRemoveElements(arrayDeque, firstQueue);
            addAndRemoveElements(arrayDeque, secondQueue);
        }
        System.out.println(arrayDeque);
        return arrayDeque;
    }

    public static void addElements(ArrayDeque<Integer> arrayDeque, Queue<Integer> queue, int count) {
        for (int i = 0; i < count; i++) {
            arrayDeque.add(Objects.requireNonNull(queue.poll()));
        }
    }

    public static void addAndRemoveElements(ArrayDeque<Integer> arrayDeque, Queue<Integer> queue) {
        queue.add(arrayDeque.pollLast());
        addElements(arrayDeque, queue, 2);
    }
}
