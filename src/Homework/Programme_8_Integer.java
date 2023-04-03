package Homework;
/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

import java.util.HashSet;

public class Programme_8_Integer {
    public static void main(String[] args) {
        Programme_8_Integer obj = new Programme_8_Integer();
        obj.addElements();
    }
    HashSet <Integer> set = new HashSet<>();
    public void addElements(){
        set.add(1);
        set.add(18);
        set.add(180);
        set.add(4);
        set.add(99);
        set.add(7);
        set.add(8);
        set.add(101);
        for (int i:set) {
            if(i>0 && i <10){
                System.out.println("No. " + i + " is in the Set.");
            }
        }
    }
}
