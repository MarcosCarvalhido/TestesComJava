package Aplicativo;

public class Viagem {
    protected String motorista;
    protected String passageiro;
    protected String origem;
    protected String destino;
    protected String metodoDePagamento;
    protected int distancia;
    protected double preçoPorKm = 1.00;

    public Viagem(String origem,String destino,String metodoDePagamento,int distancia){
        this.motorista = motorista;
        this.passageiro = passageiro;
        this.origem = origem;
        this.destino = destino;
        this.metodoDePagamento = metodoDePagamento;
        this.distancia = distancia;
    }


}
