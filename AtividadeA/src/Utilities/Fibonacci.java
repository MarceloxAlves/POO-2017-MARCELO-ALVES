package Utilities;

public class Fibonacci {

   public int calculaFibonacci(int num)
    {
        return (num==1 || num==2) ? 1 : calculaFibonacci(num-1) + calculaFibonacci(num-2);
    }
}
