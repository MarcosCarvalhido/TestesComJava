package Teste;

public class Gatos {
    String nome;
    boolean peludo;
    int numeroDePatas;

    public void miar(){
        System.out.println("Moew");
    }

    public String DizerNome(){
        return nome;
    }


    public Gatos(String nome, boolean peludo, int numeroDePatas){
        this.nome = nome;
        this.peludo = peludo;
        this.numeroDePatas = numeroDePatas;
    }
}
