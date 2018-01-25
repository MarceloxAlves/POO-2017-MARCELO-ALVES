package app;

import java.util.TreeSet;

public class TestaTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();
        for (int i = 1; i <=1000 ; i++) {
            numeros.add(i);
        }


        for (Integer n: numeros.descendingSet())
        {
            System.out.println("N: "+n);
        }
    }
}
