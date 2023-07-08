package br.com.rpriolo.buscacep.controller;

import java.util.Scanner;

public class MenuPrincipal {
    public static int exibirMenu() {
        System.out.println("""
                
                1 - Procurar endereço pelo CEP
                2 - Gerar JSON com endereço
                3 - Sair""");
        System.out.print("OPÇÃO: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
