package br.com.rpriolo.buscacep.view;

import br.com.rpriolo.buscacep.controller.Buscador;
import br.com.rpriolo.buscacep.controller.MenuPrincipal;
import br.com.rpriolo.buscacep.model.Endereco;

import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        opcao = MenuPrincipal.exibirMenu();
        while (opcao != 3) {
            String cep;
            Endereco endereco = null;

            switch (opcao) {
                case 1:
                    System.out.print("Informe o CEP que deseja pesquisar: ");
                    cep = scanner.nextLine();
                    try {
                        endereco = Buscador.buscarEnderecoPorCep(cep);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    if (endereco != null) {
                        System.out.println(endereco);
                    }
                    break;
                case 2:
                    System.out.print("Informe o CEP que deseja o JSON: ");
                    cep = scanner.nextLine();
                    try {
                        endereco = Buscador.buscarEnderecoPorCep(cep);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    if (endereco != null) {
                        String json = Buscador.gerarJson(endereco);
                        System.out.println(json);
                    }
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
            opcao = MenuPrincipal.exibirMenu();
        }
        System.out.println("O programa foi finalizado.");
    }
}
