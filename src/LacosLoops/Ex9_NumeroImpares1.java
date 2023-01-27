package LacosLoops;

/* 9º Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50. */

public class Ex9_NumeroImpares1 {
    
    public static void main(String[] args) {
        
        int count = 0;

        for(count = 0; count <= 50; count++)
        if(count % 2 == 1) System.out.println("--\n" + count);
        
    }

    
}
