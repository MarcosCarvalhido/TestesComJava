package PRODUTOS;

import DOMAIN.Cliente;

public abstract class Produto {
    protected int id;
    protected double saldo;
    protected Cliente cliente;

    Produto(int id,double saldo){
        
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}