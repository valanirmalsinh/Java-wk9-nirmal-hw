package Homework;

/* 3. Write a Java program to reverse an array of integer values.*/
public class Programme_3_ReverseArray {
    public static void reverseMethod(){
        // initializing Array
        int [] array = new int[]{ 1,2,3,4,5};
        System.out.println("original array ");
        for (int i =0 ; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        // for loop through array in reverse order//
        System.out.println("\nArray in reverse order ");
        for (int i = array.length - 1; i>= 0 ; i --){
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        reverseMethod();   //call static method//
    }

}
