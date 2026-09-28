import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a, negativo = 0;



        for (int i = 0 ; i < 5; i++) {
            System.out.printf("Digite um numero: ");
            a = scan.nextInt();
            if (a < 0) {
                negativo++;
            }
        }
        System.out.println("O resultado maximo de negativos digitados: " + negativo);
    }
}