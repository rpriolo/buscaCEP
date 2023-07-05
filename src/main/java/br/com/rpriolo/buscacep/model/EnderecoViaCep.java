package br.com.rpriolo.buscacep.model;

public record EnderecoViaCep(String cep,
                             String logradouro,
                             String complemento,
                             String bairro,
                             String localidade,
                             String uf) {
}
