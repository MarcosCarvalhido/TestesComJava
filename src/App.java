public class App {
    public static void main(String[] args) throws Exception {
        
        // Basico();
        // System.out.println(fatorial(5));
        fibonacci(5);
    }

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
