package br.com.rpriolo.buscacep.model;

public class Endereco {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(EnderecoViaCep enderecoViaCep) {
        this.cep = enderecoViaCep.cep();
        this.logradouro = enderecoViaCep.logradouro();
        this.complemento = enderecoViaCep.complemento();
        this.bairro = enderecoViaCep.bairro();
        this.cidade = enderecoViaCep.localidade();
        this.estado = enderecoViaCep.uf();
    }

    @Override
    public String toString() {
        if (complemento.isEmpty()) {
            return logradouro + " - " + bairro + " - " + cidade + "/" + estado;
        } else {
            return logradouro + " (" + complemento + ") - " + bairro + " - " + cidade + "/" + estado;
        }
    }
}
