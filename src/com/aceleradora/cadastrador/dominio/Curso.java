package com.aceleradora.cadastrador.dominio;

public class Curso {
  private String nomeCurso;
  private String faculdade;
  private double notaINEP;

  public Curso(String nomeCurso, String faculdade, double notaINEP) {
    this.nomeCurso = nomeCurso;
    this.faculdade = faculdade;
    this.notaINEP = notaINEP;
  }

  public String getNomeCurso() {
    return nomeCurso;
  }

  public String getFaculdade() {
    return faculdade;
  }

  public double getNotaINEP() {
    return notaINEP;
  }
}
