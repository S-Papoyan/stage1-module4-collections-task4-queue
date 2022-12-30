package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new ArrayList<>();
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }
        int i = 1;
        while (queue.size() > 0) {
            Iterator<Integer> iterator = queue.iterator();
            while (iterator.hasNext()) {
                Integer elem = iterator.next();
                if (i % everyDishNumberToEat == 0) {
                    list.add(elem);
                    iterator.remove();
                }
                i++;
            }
        }
        return list;
    }
}