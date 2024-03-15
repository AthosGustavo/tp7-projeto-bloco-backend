package org.example;

import java.sql.SQLOutput;

public class Main {
  public static void main(String[] args) {

    Aluno joao = new Aluno(123, "João", 20, "123.456.789-00", "Rua A, 123", "joao@email.com");
    Aluno maria = new Aluno(124, "Maria", 22, "987.654.321-00", "Rua B, 456", "maria@email.com");
    Aluno carlos = new Aluno(125, "Carlos", 19, "111.222.333-44", "Rua C, 789", "carlos@email.com");
    Aluno ana = new Aluno(126, "Ana", 21, "555.666.777-88", "Rua D, 012", "ana@email.com");
    Aluno pedro = new Aluno(127, "Pedro", 23, "999.888.777-66", "Rua E, 345", "pedro@email.com");
    Aluno lucia = new Aluno(128, "Lucia", 20, "222.333.444-55", "Rua F, 678", "lucia@email.com");
    Aluno athos = new Aluno(129,"athos",22,"888.999.555.444-89","Rua x","athos@athos.com.br");
    Aluno gustavo = new Aluno(130,"gustavo",22,"888.999.555.444-89","Rua x","athos@athos.com.br");
    Aluno chagas = new Aluno(131,"chagas",22,"888.999.555.444-89","Rua x","athos@athos.com.br");
    Aluno fabricio = new Aluno(132,"fabricio",22,"888.999.555.444-89","Rua x","athos@athos.com.br");
    Aluno wanessa = new Aluno(133,"wanessa",22,"555.777.555-99","Rua y","wanessa@.com");

    Disciplina disciplina1 = new Disciplina(1, "Matemática", 60, 4);
    Disciplina disciplina2 = new Disciplina(2, "História", 45, 3);

    joao.inscricaoDisciplina(disciplina1);
    maria.inscricaoDisciplina(disciplina1);
    carlos.inscricaoDisciplina(disciplina1);
    athos.inscricaoDisciplina(disciplina1);
    gustavo.inscricaoDisciplina(disciplina1);
    ana.inscricaoDisciplina(disciplina2);
    chagas.inscricaoDisciplina(disciplina2);
    fabricio.inscricaoDisciplina(disciplina2);
    pedro.inscricaoDisciplina(disciplina2);
    lucia.inscricaoDisciplina(disciplina2);

    Turma turmaA = new Turma(101, disciplina1);

    System.out.println(turmaA.addAluno(joao));
    System.out.println(turmaA.addAluno(maria));
    System.out.println(turmaA.addAluno(carlos));

    turmaA.addAluno(ana);
    turmaA.addAluno(pedro);
    turmaA.addAluno(lucia);
    turmaA.addAluno(athos);
    turmaA.addAluno(gustavo);
    turmaA.addAluno(chagas);
    turmaA.addAluno(fabricio);

    System.out.println(turmaA.addAluno(wanessa));

    String abrirTurma = turmaA.abrirTurma();
    System.out.println(abrirTurma);
    String gerarPauta = turmaA.gerarPauta();
    System.out.println(gerarPauta);

    Professor professor = new Professor("CG768","Roberto","Rua y","789456123","Professor de matemática","CLT");
    System.out.println(professor.lancarNota(1,123,1,101,4,3.5));


  }
}