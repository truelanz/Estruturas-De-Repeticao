package LacosLoops;

import java.util.Scanner;

/*
 * 2º Faça um programa que leia um nome de usuário e a sua senha e não aceite
 * a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando
 * a pedir as informações.
 */

public class NomeSenha1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nomeUsuario;
        String senhaUsuario;

        System.out.println("Login: ");
        nomeUsuario = scan.nextLine();

        System.out.println("Senha: ");
        senhaUsuario = scan.nextLine();
        
        while(nomeUsuario.equals(senhaUsuario)){
            System.out.println("O nome e a senha não podem ser iguais. ");
            System.out.println("Senha: ");
            senhaUsuario = scan.nextLine();
        }
        System.out.println("...entrando...");


    }
    
}
