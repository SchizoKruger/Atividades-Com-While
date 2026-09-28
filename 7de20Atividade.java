public class Main {
    public static void main(String[] args) {

        int soma = 0;

        /* numeros multiplos de 3*/
        int numero = 1;

        /* (Enquanto o número ainda estiver dentro do conjunto de 1 até 500 */
        while (numero <= 500){

            /* se o numero for multiplo de 3*/
            if (numero % 3 == 0 && numero % 2 != 0) {

                /* acresenta para soma*/
                soma += numero;

            }

            /*próximo numero */
            numero++;
        }

        System.out.printf("%d", soma);
    }
}




