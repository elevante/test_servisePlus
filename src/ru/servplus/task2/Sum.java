package ru.servplus.task2;

import java.util.ArrayList;
import java.util.List;

public class Sum {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);
        int sum = 0;

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);

        System.out.println(list);

        for (int k = 0; k < list.size(); k++) {
            if (list.get(k) % 2 != 0) {
                sum += list.get(k);
            }
        }
        System.out.println(sum);
    }
}
