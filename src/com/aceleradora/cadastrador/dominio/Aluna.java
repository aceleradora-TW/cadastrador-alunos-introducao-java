package com.aceleradora.cadastrador.dominio;

public class Aluna extends Pessoa {
  private String semestreTurma;
  private String cadastroEstagio;
  private Matricula matricula;

  public Aluna(String nomeDaPessoa, String nascimento, String cadastroPessoaFisica, String semestreTurma, String cadastroEstagio, Matricula matricula) {
    super(nomeDaPessoa, nascimento, cadastroPessoaFisica);
    this.semestreTurma = semestreTurma;
    this.cadastroEstagio = cadastroEstagio;
    this.matricula = matricula;
  }

  public String getSemestreTurma() {
    return semestreTurma;
  }

  public String getCadastroEstagio() {
    return cadastroEstagio;
  }

  public Matricula getMatricula() {
    return matricula;
  }
}
