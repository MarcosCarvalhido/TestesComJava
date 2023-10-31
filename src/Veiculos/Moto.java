package Veiculos;

public class Moto extends Veiculo{
    protected double numCilindradas;
    protected boolean possuiCortaPipa;

    public double getNumCilindradas() {
        return numCilindradas;
    }
    public void setNumCilindradas(double numCilindradas) {
        this.numCilindradas = numCilindradas;
    }
    public boolean getPossuiCortaPipa(boolean possuiCortaPipa) {
        return possuiCortaPipa;
    }
    public void setPossuiCortaPipa(boolean possuiCortaPipa) {
        this.possuiCortaPipa = possuiCortaPipa;
    }
    
}
