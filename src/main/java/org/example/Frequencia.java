package org.example;

import java.util.Date;

public class Frequencia {
  private Long id;
  private Aluno aluno;
  private Turma turma;
  private Date data;
  private boolean presente;

  public Frequencia(Long id, Aluno aluno, Turma turma, Date data, boolean presente) {
    this.id = id;
    this.aluno = aluno;
    this.turma = turma;
    this.data = data;
    this.presente = presente;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Aluno getAluno() {
    return aluno;
  }

  public void setAluno(Aluno aluno) {
    this.aluno = aluno;
  }

  public Turma getTurma() {
    return turma;
  }

  public void setTurma(Turma turma) {
    this.turma = turma;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public boolean isPresente() {
    return presente;
  }

  public void setPresente(boolean presente) {
    this.presente = presente;
  }
}