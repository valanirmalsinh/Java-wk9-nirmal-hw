package Homework;

import java.util.HashMap;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap {
    Map<String,Integer> map = new HashMap<>();
    public void addElement(){
        map.put("India",1);
        map.put("U.K.",2);
        map.put("U.S.A.",3);
        map.put("Russia",4);
        map.put("France",5);
        map.put("Italy",6);

        for (Map.Entry<String,Integer> map:map.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
    public static void main(String[] args) {
        Programme_9_HashMap obj = new Programme_9_HashMap();
        obj.addElement();
    }
}
