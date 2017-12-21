package Banco.model;


public class ManipuladorDeSeguroDeVida {

    private SeguroDeVida seguroDeVida;

    public void criaSeguro(Evento evento){
        this.seguroDeVida = new SeguroDeVida();
        this.seguroDeVida.setNumeroApolice(evento.getInt("numeroApolice"));
        this.seguroDeVida.setTitular(evento.getString("titular"));
        this.seguroDeVida.setValor(evento.getDouble("valor"));
    }

    public void calculaImpostos(Evento evento){
        // aqui calcularemos o total
    }
}
