package br.com.rpriolo.buscacep.controller;

import br.com.rpriolo.buscacep.model.Endereco;
import br.com.rpriolo.buscacep.model.EnderecoViaCep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.http.HttpResponse;

public class Buscador {
    public static Endereco buscarEnderecoPorCep(String cep) {
        ConexaoHttp conexao = new ConexaoHttp();
        HttpResponse<String> response = conexao.montarConexao(cep);
        String jsonString = response.body();

        Gson gson = new Gson();
        EnderecoViaCep enderecoViaCep = gson.fromJson(jsonString, EnderecoViaCep.class);
        return new Endereco(enderecoViaCep);
    }

    public static String gerarJson(Endereco endereco) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(endereco);
    }
}
