package Homework;

import java.util.ArrayList;

public class Programme_4_Colour {
    // declare instance method//
    public void colourName(){
        ArrayList<String > colourList = new ArrayList();
        colourList.add("Magenta");
        colourList.add("Beige");
        colourList.add("White");
        colourList.add("Black");
        colourList.add("Red");
        for( String colour : colourList ){    //using for each loop//
            System.out.println(colour);
        }

    }

    public static void main(String[] args) {
        Programme_4_Colour obj = new Programme_4_Colour();
        obj.colourName();
    }
}
