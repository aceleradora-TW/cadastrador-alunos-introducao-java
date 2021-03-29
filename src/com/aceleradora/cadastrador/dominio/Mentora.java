package com.aceleradora.cadastrador.dominio;

public class Mentora extends Pessoa {
  private String empresaQueTrabalha;
  private int anosDeExperiencia;

  public Mentora(String nomeDaPessoa, String nascimento, String cadastroPessoaFisica, String empresaQueTrabalha, int anosDeExperiencia) {
    super(nomeDaPessoa, nascimento, cadastroPessoaFisica);
    this.empresaQueTrabalha = empresaQueTrabalha;
    this.anosDeExperiencia = anosDeExperiencia;
  }

  public String getEmpresaQueTrabalha() {
    return empresaQueTrabalha;
  }

  public int getAnosDeExperiencia() {
    return anosDeExperiencia;
  }

  public void setEmpresaQueTrabalha(String empresaQueTrabalha) {
    this.empresaQueTrabalha = empresaQueTrabalha;
  }

  public void setAnosDeExperiencia(int anosDeExperiencia) {
    this.anosDeExperiencia = anosDeExperiencia;
  }
}
