package Oitode20atividade;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int fatorial, resultado = 1;
        String sequencia = " ";
               
        
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("Digite um numero para que seja multiplicado");
        fatorial = scan.nextInt();
        /*o código vai ler o número que o usuário digitou e vai guardar na variavel "fatorial"
        se o o usuário digitou "5" e dentro de "while" eu escrevo "fatorial--;" esse número se torna "4"
        por isso o programa consegue fazer a conta de multiplicação sem eu precisar inserir um operação prévia
        tipo nas primeiras codagem sobre nota do aluno, a conta já era prévia (dividir a nota máxima do aluno por 2 ou 3
        e assim teria a média) aqui não existe um cálculo previsivel, porque o calculo depende de qual o número o
        usuário vai digitar
        */
        
      
        /* enquanto o valor não for multiplicado pelo ultimo numero da fatorial "1" */
        while (fatorial >= 1) {
            
            sequencia += fatorial + " X ";
       
        /* o resultado continua sendo operado, pois a fatorial ainda não chegou em 1, logo, faça uma sintaxe para que
            guarde o atual resultado para multiplicar pelo próximo número da fatorial */            
            resultado *= fatorial;
            /* resultado = 1 x 10 = 10*/
            
            
        /* diminua mais um número para a próxima muiltiplicação*/
            fatorial--;
        /* fatorial = 10 ''--'' = - 1 (10 - 1 = 9) */
}
        
        System.out.printf("O resultado é %d", resultado);
        System.out.printf("Aqui está a tabela de cada cálculo %s= %d", sequencia, resultado);
        
       
                  
        
            
        
        
    }
    
    
}