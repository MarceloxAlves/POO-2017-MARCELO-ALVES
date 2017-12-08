package exercicio3_extra.app;

import exercicio3_extra.model.Post;

public class TestPost {
    public static void main(String[] args) {
        Post p = new Post(5);
        p.countLikes = 1;

        int[] a = new int[5];
        for (int i = 0; i <= a.length; i++) {
            a[i] = i;
            System.out.println(a[i]);
        }
    }
}
