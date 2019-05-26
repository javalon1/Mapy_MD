package com.sda.algorytmy;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App
{
    public static void main( String[] args ) {

        Map<Integer, String> map = new HashMap<>();

        //Map<Integer, List<String>> map2 = new HashMap<>(); //Zagniezdzanie argumentow

        map.put(1, "Jan");
        map.put(2, "Kamil");
        map.put(3, "Zosia");

        System.out.println(map.toString());

        for (Map.Entry<Integer, String> m : map.entrySet()){
            System.out.println();
            System.out.println("Klucz: " + m.getKey());
            System.out.println("Wartosc: " + m.getValue());
        }

        Map<String, List<String>> food = new HashMap<>();

        List<String> vegan = new ArrayList<>();
        vegan.add("Jajka");
        vegan.add("Ser");
        vegan.add("Tofu");

        List<String> halal = new ArrayList<>();
        halal.add("Baran");
        halal.add("Kurczak");
        halal.add("Jagniecina");


        List<String> koszerne = new ArrayList<>();
        koszerne.add("Marchewka");
        koszerne.add("Ciastka");
        koszerne.add("Humus");

        food.put("Vegan", vegan);
        food.put("Halal", halal);
        food.put("Koszerne", koszerne);

        System.out.println(food);

        for (Map.Entry<String, List<String>> m : food.entrySet()) {
            System.out.println();
            System.out.println("Klucz: " + m.getKey());
            for (String jedzenie : m.getValue()){
                System.out.println("Wartosc: " + jedzenie);
            }
        }



    }
}
