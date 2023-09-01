# BuscaCEP
![Status: Em desenvolvimento](https://img.shields.io/static/v1?label=STATUS&message=FINALIZADO&color=6cbd9b&style=for-the-badge)

Esta aplicação consome a API [ViaCEP](https://viacep.com.br/) e possibilita ao usuário buscar um endereço brasileiro através do CEP ou então gerar um JSON com o endereço de determinado CEP.

A aplicação avisa ao usuário caso o CEP digitado seja inexistente ou não esteja em um formato válido (`00000-000` ou `00000000`).

## Como rodar a aplicação:
1. Baixe o projeto em sua máquina;
2. Abra-o com o IntelliJ (ou outra IDE Java);
3. Execute a classe App.

## Funcionalidades:
- Procurar endereço através de um CEP: <br>
![buscacep_buscar-endereco](https://github.com/rpriolo/buscaCEP/assets/85913476/fc3af563-d0c6-4848-b5d6-9926b0ebf94e)

- Gerar uma `string` em formato JSON com um endereço completo através de um CEP: <br>
![buscacep_gerar-json](https://github.com/rpriolo/buscaCEP/assets/85913476/0735e3d1-fa87-40f0-9883-0ea8374bd2ed)

## Desenvolvido usando...
- Java
- Gson
- Maven
