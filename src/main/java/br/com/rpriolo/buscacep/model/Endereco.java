package br.com.rpriolo.buscacep.model;

public class Endereco {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String numero;

    public Endereco(EnderecoViaCep enderecoViaCep, String numero) {
        this.cep = enderecoViaCep.cep();
        this.logradouro = enderecoViaCep.logradouro();
        this.complemento = enderecoViaCep.complemento();
        this.bairro = enderecoViaCep.bairro();
        this.cidade = enderecoViaCep.localidade();
        this.estado = enderecoViaCep.uf();
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }

    public String toPrettyString() {
        if (numero.isEmpty()) {
            numero = "S/N";
        }

        if (complemento.isEmpty()) {
            return logradouro + ", " + numero + " - " + bairro + " - " + cidade + "/" + estado;
        } else {
            return logradouro + ", " + numero + " (" + complemento + ") - " + bairro + " - " + cidade + "/" + estado;
        }
    }
}