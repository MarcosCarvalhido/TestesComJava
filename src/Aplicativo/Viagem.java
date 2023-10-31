package Aplicativo;

public class Viagem {
    protected Motorista motorista;
    protected Cliente cliente;
    protected String origem;
    protected String destino;
    protected int distancia;
    protected double preçoPorKm = 1.00;

    public Viagem(Motorista motorista, Cliente cliente, String origem,String destino,int distancia){
        this.motorista = motorista;
        this.cliente = cliente;
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }


}
