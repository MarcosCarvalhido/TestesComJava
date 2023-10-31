package Exercicios;

public class Basico {
    public static void Basico(){
        
        //Tipos de variaveis
        String mensagem = "Hello";
        boolean verdade = true;
        int numero = 1;
        char letra = 'n';
        double virvulas = 12.13;

        System.out.println(mensagem + " " + verdade + " " + numero + " " + letra + " " + virvulas );

        //Conversão de Variavel
        String numeroErrado = "10";
        int numeroCerto = 10;

        System.out.println(Integer.toString(numeroCerto));  //converte de int para string 
        System.out.println(Integer.parseInt(numeroErrado) + numeroCerto); //converte de string para int
         
        //condicionais
        int numeroTeste = 4;

        if(numeroTeste > 5){
            System.out.println("é maior que 5!");
        }
        else if(numeroTeste < 9){
            System.out.println("é menor que 9!");
        }
        else{
            System.out.println("é menor do que 5!");
        }
        
        //loop
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Mow");
        }
    }
}
