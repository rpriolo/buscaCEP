package br.com.rpriolo.buscacep.controller;

import br.com.rpriolo.buscacep.model.Endereco;

import java.util.Scanner;

public class MenuPrincipal {
    public static void exibirMenu() {
        System.out.println("""
                1 - Procurar endereço pelo CEP
                2 - Gerar JSON com endereço
                3 - Sair""");
        System.out.print("OPÇÃO: ");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        String cep;
        Endereco endereco;

        switch (opcao) {
            case 1:
                System.out.print("Informe o CEP que deseja pesquisar: ");
                scanner.nextLine();
                cep = scanner.nextLine();
                endereco = Buscador.buscarEnderecoPorCep(cep);
                System.out.println(endereco.toPrettyString());
                break;
            case 2:
                System.out.print("Informe o CEP que deseja o JSON: ");
                scanner.nextLine();
                cep = scanner.nextLine();
                endereco = Buscador.buscarEnderecoPorCep(cep);
                String json = Buscador.gerarJson(endereco);
                System.out.println(json);
                break;
            case 3:
                System.out.println("O programa foi finalizado.");
                break;
            default:
                System.out.println("Opção inválida, tente novamente.\n");
                exibirMenu();
        }
    }
}
