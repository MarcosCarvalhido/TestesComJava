package Veiculos;

public class Veiculo {
    protected int numRodas;
    protected double velMaxima;
    protected int ano;
    protected String fabricante;

    public int getNumRodas() {
        return numRodas;
    }
    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }
    public double getVelMaxima() {
        return velMaxima;
    }
    public void setVelMaxima(double velMaxima) {
        this.velMaxima = velMaxima;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
