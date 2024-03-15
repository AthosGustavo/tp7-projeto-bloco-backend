package org.example;

import java.util.ArrayList;
import java.util.List;

public class Professor {
  private String matricula;
  private String nome;
  private String endereco;
  private String telefone;
  private String titulo;
  private String contratacao;
  private List<String> disciplinas;
  private List<String> turmas;

  public Professor(String matricula, String nome, String endereco, String telefone, String titulo, String contratacao) {
    this.matricula = matricula;
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
    this.titulo = titulo;
    this.contratacao = contratacao;
    this.disciplinas = new ArrayList<>();
    this.turmas = new ArrayList<>();
  }

  public String lancarNota(int id, int matriculaEstudante, int codigoDisciplina, int codigoTurma, double notaPrimeiraAvaliacao, double notaSegundaAvaliacao){
    double media = (notaPrimeiraAvaliacao + notaSegundaAvaliacao)/2;
    String status = "";
    if(media >= 7){
      status = "Aprovado";
    }else if(media < 7 && media >= 5){
      status = "Necessário realizar prova final.";
    }else{
      status = "Reprovado por média";
    }

    Avaliacao avaliacao = new Avaliacao(id,matriculaEstudante,codigoDisciplina,codigoTurma,notaPrimeiraAvaliacao, notaSegundaAvaliacao, media, status);
    return String.format("Matrícula: %d\n" +
                          "Primeira avaliação: %.2f\n" +
                          "Segunda avaliação: %.2f\n" +
                          "Status: %s",matriculaEstudante,notaPrimeiraAvaliacao,notaSegundaAvaliacao,status
    );
  }

  public void exibirDisciplinas() {
    System.out.println("Disciplinas do professor " + nome + ":");
    for (String disciplina : disciplinas) {
      System.out.println("- " + disciplina);
    }
  }

  public void exibirTurmas() {
    System.out.println("Turmas do professor " + nome + ":");
    for (String turma : turmas) {
      System.out.println("- " + turma);
    }
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getContratacao() {
    return contratacao;
  }

  public void setContratacao(String contratacao) {
    this.contratacao = contratacao;
  }

  public List<String> getDisciplinas() {
    return disciplinas;
  }

  public void setDisciplinas(List<String> disciplinas) {
    this.disciplinas = disciplinas;
  }

  public List<String> getTurmas() {
    return turmas;
  }

  public void setTurmas(List<String> turmas) {
    this.turmas = turmas;
  }
}