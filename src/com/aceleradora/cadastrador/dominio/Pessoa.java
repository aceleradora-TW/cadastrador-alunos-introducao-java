package com.aceleradora.cadastrador.dominio;

public class Pessoa {
  private String nome;
  private String dataDeNascimento;
  private String cpf;

  public Pessoa(String nomeDaPessoa, String nascimento, String cadastroPessoaFisica) {
    this.nome = nomeDaPessoa;
    this.dataDeNascimento = nascimento;
    this.cpf = cadastroPessoaFisica;
  }

  public String getNome() {
    return nome;
  }

  public String getDataDeNascimento() {
    return dataDeNascimento;
  }

  public String getCpf() {
    return cpf;
  }

  public void mudarNome(String nome) {
    this.nome = nome;
  }
}

// Pessoa ghi = new Pessoa("Ghilherme", "09/07/1996", "xxx.xxx.xxx-25");

// ghi.getNome(); // Ghilherme
