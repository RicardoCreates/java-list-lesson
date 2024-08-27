package de.ricardo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] ints = new int[2];
        int[] ints2 = {1, 2, 3};


        //Wrapper Klassen
        List<Integer> integers = new ArrayList<>(); //new Integer[0]

        //LinkList
        //List<Integer> integers = new LinkedList<>(); //new Integer[0]

        //Add Data
        integers.add(1); //new Integer[0], Integer[0]=1;
        integers.add(5);
        integers.add(3);

        //Remove Data
        integers.remove(Integer.valueOf(5));

        //Add on Spot
        integers.add(2, 100);

        //Size of List
        int size = integers.size();

        //Get Data
        Integer x = integers.get(2);

        //Classische for Schleife // Durch i wachsender indexinteger möglich um z.B. Daten zu laden
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }

        //For each für schnelleres Tippen
        for (Integer integer : integers) {
            System.out.println(integer);
        }


    }
}