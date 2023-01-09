package LacosLoops;

import java.util.Scanner;

/*
 * 4º Supondo que a população de um país A seja da ordem de 80000 habitantes
 *  com uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes
 *  com uma taxa de crescimento de 1.5%. Faça um programa que calcule
 *  e escreva o número de anos necessários para que a população
 *  do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
 */


public class Ex4e5_PopulacaoPais1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        /* float paisA = 80000; //3%
        float paisB = 200000; //1.5%
        int countAno = 0; */

        System.out.println("Digite a população do pais 'A': ");
        float paisA = scan.nextFloat();
        
        System.out.println("Digite a população do pais 'B': ");
        float paisB = scan.nextFloat();

        int countAno = 0;

        while(paisA <= paisB){
            paisA += paisA * 0.03f;
            paisB += paisB * 0.015f;
            countAno++;
        }

        System.out.println("\nA população do pais 'A' utrapassará a população do pais 'B' em: " + countAno + " anos.");
        System.out.println("");
        
    }

    /* 
    5º Altere o programa anterior permitindo ao usuário informar
    as populações e as taxas de crescimento iniciais. Valide a
    entrada e permita repetir a operação. 
    */
    
}
