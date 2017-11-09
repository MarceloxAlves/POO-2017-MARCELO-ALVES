package Utilities;

public class Functions {
    public static void append(int[] vetor, int valor){
        int newvetor[] = new int[vetor.length+1];
        for (int i = 0; i < vetor.length ; i++) {
            newvetor[i] = vetor[i];
        }
        newvetor[vetor.length] = valor;
        vetor = newvetor;
    }
}
