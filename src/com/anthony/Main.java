package com.anthony;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner numberScanner = new Scanner(System.in);
    static Scanner stringScanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Create array list for cereals
        ArrayList<String> cereals = new ArrayList<String>();
        cereals.add("Special K");
        cereals.add("Captain Crunch");
        cereals.add("Oatmeal");
        // remove Oatmeal
        cereals.remove("Oatmeal");
        // Add my favorite cereal and add cornflakes
        cereals.add("Cinnamon Toast Crunch");
        cereals.add("Cornflakes");
        // Iterate over the cereal array to display each cereal
        for (int i = 0; i < cereals.size(); i++) {
            System.out.println("Cereal " + (i + 1) + ": " + cereals.get(i));
        }
        // Check if Special K is in the ArrayList
        if (cereals.contains("Special K")){
            System.out.println("The ArrayList \"cereal\" does contain \"Special K\"");
        } else {
            System.out.println("The ArrayList \"cereal\" does not contain \"Special K\"");
        }
        //Close scanners
        numberScanner.close();
        stringScanner.close();

    }

}
