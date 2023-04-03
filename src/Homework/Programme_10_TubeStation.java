package Homework;

import java.util.*;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme_10_TubeStation {

    public static void main(String[] args) {
        //Create a map of station names and the lines they belong to

        Map<String, List<String>> stationLines = new HashMap<>();

        //Enter station name in Zone 1

        stationLines.put("BAKER STREET", Arrays.asList("Bakerloo", "Circle", "Hammersmith & City", "Jubilee", "Metropolitan"));
        stationLines.put("BANK", Arrays.asList("Central", "Northern", "Waterloo & City"));
        stationLines.put("BOND STREET", Arrays.asList("Central", "Jubilee"));
        stationLines.put("CHARING CROSS", Arrays.asList("Bakerloo", "Northern"));
        stationLines.put("COVENT GARDEN", Arrays.asList("Piccadilly"));
        stationLines.put("EUSTON", Arrays.asList("Northern", "Victoria"));
        stationLines.put("GREEN PARK", Arrays.asList("Jubilee", "Piccadilly", "Victoria"));
        stationLines.put("HOLBORN", Arrays.asList("Central", "Piccadilly"));
        stationLines.put("LEICESTER SQUARE", Arrays.asList("Northern", "Piccadilly"));
        stationLines.put("LIVERPOOL STREET", Arrays.asList("Central", "Circle", "Hammersmith & City", "Metropolitan"));
        stationLines.put("LONDON BRIDGE", Arrays.asList("Jubilee", "Northern"));
        stationLines.put("MOORGATE", Arrays.asList("Circle", "Hammersmith & City", "Metropolitan", "Northern"));
        stationLines.put("OXFORD CIRCUS", Arrays.asList("Bakerloo", "central", "Victoria"));
        stationLines.put("PICCADILLY CIRCUS", Arrays.asList("Bakerloo", "Piccadilly"));
        stationLines.put("RUSSELL SQUARE", Arrays.asList("Piccadilly"));
        stationLines.put("SOUTH KENSINGTON", Arrays.asList("Circle", "District", "Piccadilly"));
        stationLines.put("TOTTENHAM COURT ROAD", Arrays.asList("Central", "Northern"));
        stationLines.put("VICTORIA", Arrays.asList("Circle", "District", "Victoria"));
        stationLines.put("WATERLOO", Arrays.asList("Bakerloo", "Jubilee", "Northern"));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a station name in Zone 1: ");
        String station = scanner.nextLine().toUpperCase();
        if (stationLines.containsKey(station)) {
            System.out.println("The following lines pass through " + station + ":"); // Output which lines pass through that station
            for (String line : stationLines.get(station)) {
                System.out.println("- " + line);

            }
        } else {
            System.out.println("Station is not in Zone 1"); //Invalid message if station name is out of Zone 1
        }
        scanner.close();
    }
}
