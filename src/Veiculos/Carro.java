package Veiculos;

public class Carro extends Veiculo {
    protected int bagageiroLitros;
    protected boolean possuiAirBag;
    
    public int getBagageiroLitros() {
        return bagageiroLitros;
    }
    public void setBagageiroLitros(int bagageiroLitros) {
        this.bagageiroLitros = bagageiroLitros;
    }
    public boolean getPossuiAirBag(boolean possuiAirBag) {
        return possuiAirBag;
    }
    public void setPossuiAirBag(boolean possuiAirBag) {
        this.possuiAirBag = possuiAirBag;
    }
}
