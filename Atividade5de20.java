import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* crie uma variavel do repetidor*/
        int contador = 0;

        /*crie uma variavel que vai receber os numeros*/
        int numero;

        /* crie uma variavel para somar todos os numeros*/
        int soma = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.printf("Digite dez numeros");


        while (contador < 10) {

            numero = scanner.nextInt();
            soma += numero;
            contador++;

        }


        System.out.printf("A soma de todos os numeros digitados è %d", soma);
    }

}