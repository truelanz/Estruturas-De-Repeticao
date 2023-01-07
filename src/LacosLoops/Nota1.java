package LacosLoops;

import java.util.Scanner;
/*
 * 1º Faça um programa que peça uma nota, entre zero e dez.
 *  Mostre uma mensagem caso o valor seja inválido e continue
 *  pedindo até que o usuário informe um valor válido.
 */

public class Nota1 {

    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);

       System.out.println("\nDigite a sua nota de 0 a 10: ");
       double nota = scan.nextDouble();

        while(nota < 0 | nota > 10){
        System.out.println("\nDigite uma nota válida: ");
        nota = scan.nextDouble();       
        }
        System.out.println("\nNota " + nota + ". Nota válida, obrigado.");    
        System.out.println("");  

    }
    
}
