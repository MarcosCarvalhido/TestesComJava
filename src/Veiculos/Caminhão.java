package Veiculos;

public class Caminhão extends Veiculo{
    protected int cargaMaxima;
    protected int eixos;
    
    public int getCargaMaxima() {
        return cargaMaxima;
    }
    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    
    public int totalDeRodas(){
        int rodas = getNumRodas();
        int eixos = getEixos();
        return rodas * eixos;
    }
}
