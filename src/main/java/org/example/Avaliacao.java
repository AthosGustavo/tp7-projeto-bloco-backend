package org.example;

public class Avaliacao {
  private int id;
  private int matriculaEstudante;
  private int codigoDisciplina;
  private int codigoTurma;
  private double notaPrimeiraAvaliacao;
  private double notaSegundaAvaliacao;
  private double media;
  private String status;
  public Avaliacao(int id, int matriculaEstudante, int codigoDisciplina, int codigoTurma, double notaPrimeiraAvaliacao, double notaSegundaAvaliacao, double media, String status) {
    this.id = id;
    this.matriculaEstudante = matriculaEstudante;
    this.codigoDisciplina = codigoDisciplina;
    this.codigoTurma = codigoTurma;
    this.notaPrimeiraAvaliacao = notaPrimeiraAvaliacao;
    this.notaPrimeiraAvaliacao = notaSegundaAvaliacao;
    this.media = media;
    this.status = status;
  }

  // Métodos getters e setters
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getMatriculaEstudante() {
    return matriculaEstudante;
  }

  public void setMatriculaEstudante(int matriculaEstudante) {
    this.matriculaEstudante = matriculaEstudante;
  }

  public int getCodigoDisciplina() {
    return codigoDisciplina;
  }

  public double getNotaPrimeiraAvaliacao() {
    return notaPrimeiraAvaliacao;
  }

  public void setNotaPrimeiraAvaliacao(double notaPrimeiraAvaliacao) {
    this.notaPrimeiraAvaliacao = notaPrimeiraAvaliacao;
  }

  public double getNotaSegundaAvaliacao() {
    return notaSegundaAvaliacao;
  }

  public void setNotaSegundaAvaliacao(double notaSegundaAvaliacao) {
    this.notaSegundaAvaliacao = notaSegundaAvaliacao;
  }

  public double getMedia() {
    return media;
  }

  public void setMedia(double media) {
    this.media = media;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setCodigoDisciplina(int codigoDisciplina) {
    this.codigoDisciplina = codigoDisciplina;
  }

  public int getCodigoTurma() {
    return codigoTurma;
  }

  public void setCodigoTurma(int codigoTurma) {
    this.codigoTurma = codigoTurma;
  }

}
