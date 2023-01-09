package LacosLoops;

import java.util.Scanner;

//7º Faça um programa que leia 5 números e informe o maior número.
//8º Faça um programa que leia 5 números e informe a soma e a média dos números.

public class Ex7e8_LerMaiorNumero1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //  USANDO LAÇO FOR PARA LEO O MAIOR NÚMERO:

        /* int max = 0;
        
            for (int count = 0; count < 5; count++) {
              System.out.println("Numero: ");
              int num = input.nextInt();
              if (num > max) {
                max = num;
              }
            }
        
            System.out.println("O maior número é: " + max);
          }
        } */

      int numeros = 0;
      int maiorNumero = 0;
      int soma = 0;
      int count = 0;

        do{

        if(maiorNumero < numeros)
            maiorNumero = numeros;
            
        
        System.out.println("Digite 5 números: ");
        numeros = input.nextInt();

        count++;
        soma += numeros;

        }while(count < 5);

        System.out.println("\nO maior número é: " + maiorNumero);
        System.out.println("\nA soma dos números é: " + soma);
        System.out.println("\nA média dos números é: " + soma/count);
        System.out.println("");
     
    }

}
