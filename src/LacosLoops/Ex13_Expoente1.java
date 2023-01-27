package LacosLoops;

import java.util.Scanner;

public class Ex13_Expoente1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Numero base: ");
        double numeroBase = scan.nextDouble();
        
        System.out.println("Numero expoente: ");
        double numeroExpoente = scan.nextDouble();

        int count = 1;
        double numeroPotencia = 1;
        for(count = 1; count <= numeroExpoente; count++){
            numeroPotencia *= numeroBase;
        }
        System.out.println(numeroPotencia);
    }

    
    
}
