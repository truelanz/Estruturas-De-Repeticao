package LacosLoops;

/*6º Faça um programa que imprima na tela os
números de 1 a 20, um abaixo do outro.
 Depois modifique o programa para que
ele mostre os números um ao lado do outro. */

public class Ex6_De1a20 {

    public static void main(String[] args) {

        int numeros = 0;

        while(numeros <= 20 -1){
            ++numeros;
            //System.out.println(numeros);
            System.out.print(numeros + " ");
        }

        //Da para fazer usando o 'for' também:"

        //for(numeros = 1; numeros <= 20; numeros++);
        
    }
    
}
