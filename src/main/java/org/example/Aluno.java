package org.example;
import java.util.ArrayList;
import java.util.List;

public class Aluno {
  private int matricula;
  private String nome;
  private int idade;
  private String cpf;
  private String endereco;
  private String email;
  private List<Disciplina> disciplinasInscritas;
  private List<Turma> listaTurmas;


  public Aluno(int matricula, String nome, int idade, String cpf, String endereco, String email) {
    this.matricula = matricula;
    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;
    this.endereco = endereco;
    this.email = email;
    this.disciplinasInscritas = new ArrayList<>();
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void inscricaoDisciplina(Disciplina disciplina) {
    disciplinasInscritas.add(disciplina);
    System.out.println(nome + " se inscreveu na disciplina: " + disciplina.getNome());
  }

  public void cancelarInscricaoDisciplina(String disciplina) {
    if (disciplinasInscritas.contains(disciplina)) {
      disciplinasInscritas.remove(disciplina);
      System.out.println(nome + " cancelou a inscrição na disciplina: " + disciplina);
    } else {
      System.out.println(nome + " não está inscrito na disciplina: " + disciplina);
    }
  }

  public void solicitarHistorico() {
    System.out.println("Solicitando histórico para o aluno: " + nome);
  }

  public void consultarAvaliacoes() {
    System.out.println("Consultando avaliações para o aluno: " + nome);
  }

}

