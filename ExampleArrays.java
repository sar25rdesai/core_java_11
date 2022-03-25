package com.combino.arrays;

import java.util.Arrays;

public class ExampleArrays {

    // This is the preferred way
    int[] ids = {1006, 1001, 1008, 1009, 1004, 1005, 1003, 1007};

    String fruits[] = {"Apple", "Banana", "Papaya", "Mango", "Orange"};

    String[] cities = new String[10];


    public void playWithArrays() {

        int x = 0;
        while (x < ids.length) {
            System.out.println("While loop " + ids[x]);
            x++;
        }
        Arrays.sort(ids);
        cities[0] = "Mumbai";
        cities[1] = "Hyderabad";

        for (int i = 0; i < ids.length; i++) {

            System.out.println(ids[i]);
        }
        for (String fruit :
                fruits) {
            System.out.println(fruit);
        }

        System.out.println( Arrays.binarySearch(ids,999));

    }

}
