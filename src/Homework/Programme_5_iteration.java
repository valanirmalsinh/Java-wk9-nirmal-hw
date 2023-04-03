package Homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Programme_5_iteration {
    public static void iterateElements(){
        // using hashset logic//
        Set<String> cityName = new HashSet<String>();
        cityName.add("Coventry");
        cityName.add("Birmingham");
        cityName.add("london");
        cityName.add("Manchester");
        cityName.add("Liverpool");
        Iterator city = cityName.iterator();
        while(city.hasNext()){
            System.out.println(city.next());
        }
    }

    public static void main(String[] args) {
        iterateElements();
    }
}
