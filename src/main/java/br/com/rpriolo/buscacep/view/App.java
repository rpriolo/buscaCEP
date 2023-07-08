package br.com.rpriolo.buscacep.view;

import br.com.rpriolo.buscacep.controller.Buscador;
import br.com.rpriolo.buscacep.controller.MenuPrincipal;
import br.com.rpriolo.buscacep.model.Endereco;

import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String cep;
        Endereco endereco;
        int opcao;

        opcao = MenuPrincipal.exibirMenu();
        while (opcao != 3) {
            switch (opcao) {
                case 1:
                    System.out.print("Informe o CEP que deseja pesquisar: ");
                    cep = scanner.nextLine();
                    endereco = Buscador.buscarEnderecoPorCep(cep);
                    System.out.println(endereco.toPrettyString());
                    break;
                case 2:
                    System.out.print("Informe o CEP que deseja o JSON: ");
                    cep = scanner.nextLine();
                    endereco = Buscador.buscarEnderecoPorCep(cep);
                    String json = Buscador.gerarJson(endereco);
                    System.out.println(json);
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
            opcao = MenuPrincipal.exibirMenu();
        }
        System.out.println("O programa foi finalizado.");
    }
}
