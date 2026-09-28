import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

    int numero;
    int soma = 0;
    int contador = 0;
    
    Scanner scan = new Scanner (System.in);
    
    System.out.printf("Digite um numero: ");
    
    while( contador < 20 ) {
        
        numero = scan.nextInt();
        
        if(numero > 0) {
            
            soma += numero;
        }
        
        contador++;
        
        }
        
       System.out.printf("Essa é a soma de todos os positivos: %d", soma);
        
        
    }
}