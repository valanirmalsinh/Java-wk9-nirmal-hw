package Homework;

import java.util.ArrayList;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
  */
public class Programme_6_FindElementInArray {
    public static void elements() {
        //declare static method //
        //declare arraylist//
        ArrayList<Float> list = new ArrayList<Float>();
        list.add(399.4f);
        list.add(4.4f);
        list.add(567.9f);
        list.add(1.4f);
        list.add(37.4f);

        for (float data : list) {
            System.out.println(data);
        }

        float element = list.get(1);
        System.out.println("element at index 1 \t:\t" + element);
        element = list.get(4);
        System.out.println("element at index 4 \t:\t" + element);

    }

    // main method declare//
    public static void main(String[] args) {
        elements();
    }
}
