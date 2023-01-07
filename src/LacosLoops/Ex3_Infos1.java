package LacosLoops;

import java.util.Scanner;

/*
3º Faça um programa que leia e valide as seguintes informações:
    a- Nome: maior que 3 caracteres;
    b- Idade: entre 0 e 150;
    c- Salário: maior que zero;
    d- Sexo: 'f' ou 'm';
    e- Estado Civil: 's', 'c', 'v', 'd';
 */

public class Ex3_Infos1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;
        //String estadoCivil2;
        
        System.out.println("Nome: ");
        nome = scan.next();
        while(nome.length()<=3){
            System.out.println("O nome deve conter mais que 3 caracteres: ");
            nome = scan.next();     
        }

        System.out.println("\nIdade: ");
        idade = scan.nextInt();
        while(idade > 150 | idade < 0){
            System.out.println("\nEntre 0 e 150: ");
            idade = scan.nextInt();
        }

        System.out.println("\nSalário: ");
        salario = scan.nextDouble();
        while(salario < 0){
            System.out.println("\nSeu salários deve ser maior que 0: ");
            salario = scan.nextDouble();
        }

        System.out.println("\nSexo: Digite 'f' para feminino e 'm' para masculino: ");
        sexo = scan.next().charAt(0);
        while(sexo != 'f' && sexo != 'm'){
            System.out.println("\n'f' para feminino e 'm' para masculino: ");
            sexo = scan.next().charAt(0);
        } 
        
        System.out.println("\nSeu estado civil é? 's' para solteiro(a), 'c' para casado(a), 'v' para viúvo(a), 'd' para divorciado(a): ");
        estadoCivil = scan.next().charAt(0);
        while(((estadoCivil != 's') && (estadoCivil != 'c') && (estadoCivil != 'v') && (estadoCivil != 'd'))){
            System.out.println("\nDigite 's' para solteiro(a), 'c' para casado(a), 'v' para viúvo(a), 'd' para divorciado(a): ");
            estadoCivil = scan.next().charAt(0);
        }

         /* System.out.println("\nSeu estado civil é? 's' para solteiro(a), 'c' para casado(a), 'v' para viúvo(a), 'd' para divorciado(a): ");
         estadoCivil2 = scan.next();
         
          while(!estadoCivil2.equalsIgnoreCase("s") + !estadoCivil2.equalsIgnoreCase("c") + !estadoCivil2.equalsIgnoreCase(v) + !estadoCivil2.equalsIgnoreCase("d")){
         System.out.println("\n's' para solteiro(a), 'c' para casado(a), 'v' para viúvo(a), 'd' para divorciado(a): ");
         estadoCivil2 = scan.next();
         } */

        System.out.println("\n...entrando...");
        
    }

}
    
