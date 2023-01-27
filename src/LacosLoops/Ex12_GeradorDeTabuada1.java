package LacosLoops;

import java.io.IOException;

/* 12º Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual 
numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50 */

import java.util.Scanner;


public class Ex12_GeradorDeTabuada1 {


    public static void main(String[] args) throws IOException {
        
      Scanner scan = new Scanner(System.in);
      System.out.println("Numerador: ");
      int numerador = scan.nextInt();
      System.out.println("---");
      if(numerador <= 10){
          for(int denominador = 0; denominador <= 10; denominador++){
              System.out.println(numerador + " X " + denominador + " = " + numerador*denominador);
            }
        }else {
          System.out.println("\nEsse gerador de tábuada é apenas do 1 a 10.");
       
        }

    }

}


