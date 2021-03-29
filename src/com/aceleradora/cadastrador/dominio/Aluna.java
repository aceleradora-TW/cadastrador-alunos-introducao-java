package com.aceleradora.cadastrador.dominio;

public class Aluna extends Pessoa {
  private String numeroDeMatricula;
  private String curso;

  public Aluna(String nomeDaPessoa, String nascimento, String cadastroPessoaFisica, String numeroDeMatricula, String curso) {
    super(nomeDaPessoa, nascimento, cadastroPessoaFisica);
    this.numeroDeMatricula = numeroDeMatricula;
    this.curso = curso;
  }

  public String getNumeroDeMatricula() {
    return numeroDeMatricula;
  }

  public String getCurso() {
    return curso;
  }

  public void setNumeroDeMatricula(String numeroDeMatricula) {
    this.numeroDeMatricula = numeroDeMatricula;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }
}
