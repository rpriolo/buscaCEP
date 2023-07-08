package br.com.rpriolo.buscacep.controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexaoHttp {
    private String url;
    private HttpClient client;
    private HttpRequest request;
    private HttpResponse<String> response;

    private void setUrlConexao(String cep) {
        this.url = "https://viacep.com.br/ws/" + cep + "/json/";
    }

    public HttpResponse<String> montarConexao(String cep) throws Exception {
        setUrlConexao(cep);
        client = HttpClient.newHttpClient();
        request = HttpRequest.newBuilder(URI.create(this.url)).build();
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() != 200) {
                throw new Exception("O CEP informado não está em um formato válido. Verifique se foi digitado um valor com 8 números no formato '00000-000' ou '00000000'.");
            }
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return response;
    }
}