package Utilities;

public class Math {
    public static long fat(long n){
        return  n <= 0 ? 1 : n*fat(n-1);
    }


}
