package LacosLoops;

/*10º Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles. 
 *11º  Altere o programa anterior para mostrar no final a soma dos números.*/

public class Ex10e11_NumerosIntervalo1 {

    public static void main(String[] args) {
        
        int inteiro1 = 30, inteiro2 = 52, intervalo = 0, soma = 0;

        for(intervalo = inteiro1; intervalo <= inteiro2; intervalo++){
            soma = intervalo + soma;
            System.out.println("--\n" + intervalo);  
        }
        System.out.println("--\nA soma dos números do intervalo é: " + soma);
    }
    
    
    
}
