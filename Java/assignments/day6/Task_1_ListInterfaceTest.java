package com.assignments.day6;

import java.util.ArrayList;
import java.util.List;

public class Task_1_ListInterfaceTest {
    public static void removeEverySecondElement(List<?> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                list.remove(i); 
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("Original list: " + myList);

        removeEverySecondElement(myList);

        System.out.println("List after removing every second element: " + myList);
    }
}
