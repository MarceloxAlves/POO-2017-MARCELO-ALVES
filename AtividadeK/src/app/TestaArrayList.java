package app;

import java.util.ArrayList;

public class TestaArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <=1000 ; i++) {
            numeros.add(i);
        }


        for (int i = numeros.size() ; i >= 1; i--) {
            System.out.println("N: "+numeros.get(i-1));
        }
    }
}
