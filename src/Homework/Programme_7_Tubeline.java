package Homework;

import java.util.ArrayList;

public class Programme_7_Tubeline {
    //declare static method//
    public static void underground() {
        ArrayList<String> tubeList = new ArrayList<>();
        tubeList.add("Northern Line");
        tubeList.add("Central Line");
        tubeList.add("Metropolitan Line");
        tubeList.add("Bakerloo Line");
        tubeList.add("Jubilee Line");
        System.out.println("ArrayList of Tube Name ");
        //for each loop//
        for(String tube    : tubeList){
            System.out.println(tube + " ");
        }
        if( tubeList.isEmpty()){
            System.out.println( "This arraylist is empty " );

        }else{
            System.out.println( "This arraylist is not empty");
        }

    }
    //declare main method//
    public static void main(String[] args) {
        underground();
    }
}
