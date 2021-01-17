package org.launchcode.java.studios.areaofacircle;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class collectionStudio {
    public static void main(String[] args) {

        HashMap<Character, Integer> charCountMap
                = new HashMap<Character, Integer>();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your string: ");
    String inputString = input.nextLine();
    char[] strArray = inputString.toCharArray();
     for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }
    System.out.println(charCountMap);
        // Printing the charCountMap
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}

