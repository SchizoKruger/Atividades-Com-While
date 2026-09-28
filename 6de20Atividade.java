import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char sexo;

        Scanner scan = new Scanner(System.in);

        System.out.printf("Coloque a inicial da caractere que define o seu sexo: ");
        sexo = scan.next().charAt(0);

        while (sexo != 'M' && sexo != 'F' && sexo != 'I') {

            System.out.printf("Informação inválida, tente novamente: 'm' 'f' ou 'i' ");
            sexo = scan.next().charAt(0);
        }

        System.out.printf("Seu sexo é %c:", sexo);

    }
}
