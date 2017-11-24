package SysCasa.control;

public class Porta {

    boolean aberta;

    public void openClose(){
        this.aberta  = this.aberta ? false : true;
    }

    public boolean isAberta() {
        return aberta;
    }
}
