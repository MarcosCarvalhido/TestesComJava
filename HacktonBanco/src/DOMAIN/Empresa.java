package DOMAIN;

public class Empresa {
    protected String cnpj;

    Empresa(String nome,int id,String cnpj){
        this.cnpj = cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getCnpj() {
        return cnpj;
    }
}
