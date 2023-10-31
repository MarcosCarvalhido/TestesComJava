package Exercicios;

public class Exercicios {
    public static int fatorial(int numero){
        
        int resultado = 0;
        for (int i = 0; i < numero; i++) {
            resultado = resultado + numero;
            numero--;
        }
        return resultado;
    }
    public static void fibonacci(int numero){
         
        int primeiro = 0;
        int segundo = 1;
        int resultado = 0;

        for (int i = 0; i < numero; i++) {
            if(i > 1){

                resultado = primeiro + segundo;

                System.out.println(resultado); 
                
                primeiro = segundo;
                segundo = resultado;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
