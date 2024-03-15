package org.example;

import java.util.ArrayList;
import java.util.List;

public class Turma {
  private int codTurma;
  private List<Aluno> alunos;
  private List<Professor> professores;
  private int qtdAlunos;
  private Disciplina nomeDisciplina;

  private boolean turmaAberta;
  public Turma(int codTurma, Disciplina nomeDisciplina) {
    this.codTurma = codTurma;
    this.nomeDisciplina = nomeDisciplina;
    this.alunos = new ArrayList<>();
    this.professores = new ArrayList<>();
  }

  public void exibirProfessores() {
    System.out.println("Professores da turma " + codTurma + ":");
    for (Professor professor : professores) {
      System.out.println(professor.getNome());
    }
  }

  public String addAluno(Aluno aluno) {
    if (qtdAlunos < 10) {
      alunos.add(aluno);
      qtdAlunos++;
      return "Aluno adicionado à turma: " + this.codTurma;
    } else {
      return "Turma cheia. Não é possível adicionar mais alunos.";
    }
  }

  public String abrirTurma() {
    if(qtdAlunos < 10 && professores.size() <= 0){
      this.turmaAberta = false;
      return "Não foi possível abrir a turma.A turma deve possuir no mínimo 10 alunos\nQuantidade atual:" + this.qtdAlunos;
    }else {
      this.turmaAberta = true;
      return "Turma aberta com sucesso!";
    }

  }

  public String gerarPauta() {
    StringBuilder pauta = new StringBuilder();
    pauta.append("======================Informações da turma===========================").append("\n");
    pauta.append("Código da Turma: ").append(codTurma).append("\n");
    pauta.append("Disciplina: ").append(nomeDisciplina.getNome()).append("\n");
    pauta.append("Professores: ");
    for (Professor professor : professores) {
      pauta.append(professor.getNome()).append(", ");
    }
    pauta.delete(pauta.length() - 2, pauta.length()); // Remover a última vírgula e espaço
    pauta.append("\nAlunos Inscritos:\n");
    for (Aluno aluno : alunos) {
      pauta.append(aluno.getNome()).append("\n");
    }
    pauta.append("=====================================================================");
    return pauta.toString();
  }
}