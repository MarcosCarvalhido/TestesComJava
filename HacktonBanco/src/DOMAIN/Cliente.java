package DOMAIN;

public class Cliente {
    protected int id;
    protected String nome;

    public Cliente(int id,String nome){
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
}
}