# Consulta de CEP com Java e API ViaCEP

Este projeto permite consultar informações de um endereço a partir de um CEP, utilizando a [API pública ViaCEP](https://viacep.com.br/). O programa faz a requisição HTTP, exibe os dados e gera um arquivo `.json` com as informações retornadas.

## 💻 Tecnologias utilizadas

- API HTTP (HttpClient)
- Gson (para manipulação de JSON)
- API ViaCEP

## 📂 Estrutura do Projeto

- `Main.java`: classe principal que executa o menu de busca.
- `ConsultaCep.java`: responsável por fazer a requisição HTTP e retornar o objeto `Endereco`.
- `Endereco.java`: classe modelo para mapear os dados retornados da API.
- `GerarArquivo.java`: salva os dados do endereço em um arquivo `.json`.

## ✅ Funcionalidades

- Solicita um CEP ao usuário.
- Consulta os dados do endereço na API ViaCEP.
- Exibe os dados do endereço no console.
- Gera um arquivo `.json` com os dados da resposta.
- Permite novas buscas se o CEP for válido.
- Encerra o programa se o CEP for inválido ou se o usuário optar por sair.

## ⚠️ Validações

- Se o CEP não for encontrado ou a API retornar erro, o programa informa o problema e é encerrado.

## Clone o repositório:

```bash
git clone https://github.com/seu-usuario/consulta-cep-java.git
