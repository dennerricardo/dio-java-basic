import java.util.Scanner; 

public class VerificadorNumeroConta { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
// TODO: Inicialize um bloco try-catch para capturar exceções:
        try {
            String numeroConta = scanner.next();
            verificarNumeroConta(numeroConta);
            System.out.println("Numero de conta valido."); 
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erro: " + e.getMessage()); 

// TODO: Leia a entrada do usuário como uma string representando o número da conta:
           

// TODO: Chame o método verificarNumeroConta, passando o número da conta como argumento:
           

// Imprime que o número de conta é válido:

// TODO: Capture a exceção do tipo IllegalArgumentException, que pode ser lançada pelo método verificarNumeroConta:
       
// Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à exceção:
        } finally {
            scanner.close();
        }
    }

// Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) { 
        int contadorDeNumero = numeroConta.length();
        int numeroDigitado = 0 ;
// TODO: Verifique se o número da conta tem exatamente 8 dígitos:
        for(int i = 0; i < contadorDeNumero; i++){
            numeroDigitado++;
        }
// TODO: Implemente uma exceção do tipo IllegalArgumentException, caso o número de conta não tenha 8 dígitos:
        if(numeroDigitado != 8){
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
