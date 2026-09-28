import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int media, soma = 0, numero=1, indicador=-1;

        Scanner scan = new Scanner(System.in);




        while (numero != 0) {
            System.out.printf("Digite um numero: ");
            numero = scan.nextInt();
            if (numero % 2 == 0) {
                soma += numero;
                indicador++;

            }
        }
        media = soma / indicador ;
        System.out.printf("A soma e: %d\nA qtd de numeros pares: %d\n",soma,indicador);
    }
}