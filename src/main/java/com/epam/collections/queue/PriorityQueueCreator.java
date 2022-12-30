package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {

        CustomIntegerComparator comparator = new CustomIntegerComparator();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(comparator.reversed());
        priorityQueue.addAll(firstList);
        priorityQueue.addAll(secondList);
        return priorityQueue;
    }

    public class CustomIntegerComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }

        @Override
        public Comparator<String> reversed() {
            return Comparator.super.reversed();
        }
    }
}
