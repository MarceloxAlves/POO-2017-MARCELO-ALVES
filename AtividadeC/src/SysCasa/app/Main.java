package SysCasa.app;

import SysCasa.control.Casa;
import SysCasa.control.Porta;

public class Main {
    public static void main(String[] args) {
        Casa c = new Casa("Azul",4);
        Porta p = new Porta();
        p.openClose();
        c.adiciona(p);

        p = new Porta();
        c.adiciona(p);

        p = new Porta();
        c.adiciona(p);

        System.out.println(c.toString());
    }
}
