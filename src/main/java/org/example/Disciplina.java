package org.example;

import java.util.List;

public class Disciplina {
  private int codDisciplina;
  private String nome;
  private int cargaHoraria;
  private int creditos;
  private List<Professor> professores;
  private List<Aluno> alunos;
  private Turma turma;

  public Disciplina(int codDisciplina, String nome, int cargaHoraria, int creditos) {
    this.codDisciplina = codDisciplina;
    this.nome = nome;
    this.cargaHoraria = cargaHoraria;
    this.creditos = creditos;
  }
  public int getCodDisciplina() {
    return codDisciplina;
  }

  public void setCodDisciplina(int codDisciplina) {
    this.codDisciplina = codDisciplina;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  public int getCreditos() {
    return creditos;
  }

  public void setCreditos(int creditos) {
    this.creditos = creditos;
  }

  public List<Professor> getProfessores() {
    return professores;
  }

  public void setProfessores(List<Professor> professores) {
    this.professores = professores;
  }

  public List<Aluno> getAlunos() {
    return alunos;
  }

  public void setAlunos(List<Aluno> alunos) {
    this.alunos = alunos;
  }

  public Turma getTurma() {
    return turma;
  }

  public void setTurma(Turma turma) {
    this.turma = turma;
  }

}
