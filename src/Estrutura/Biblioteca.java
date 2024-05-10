package Estrutura;

import java.util.ArrayList;
import java.util.List;
import Pessoa.Aluno;

public class Biblioteca {
    private String nome;
    private List<Aluno> alunosRegistrados;

    // Construtor
    public Biblioteca(String nome) {
        this.nome = nome;
        this.alunosRegistrados = new ArrayList<>();
    }

    // Método para registrar um aluno na biblioteca
    public void registrarAluno(Aluno aluno) {
        alunosRegistrados.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " registrado na biblioteca.");
    }

    // Método para remover o registro de um aluno na biblioteca
    public void removerRegistroAluno(Aluno aluno) {
        if (alunosRegistrados.contains(aluno)) {
            alunosRegistrados.remove(aluno);
            System.out.println("Registro do aluno " + aluno.getNome() + " removido da biblioteca.");
        } else {
            System.out.println("Aluno não registrado na biblioteca.");
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunosRegistrados() {
        return alunosRegistrados;
    }

    public void setAlunosRegistrados(List<Aluno> alunosRegistrados) {
        this.alunosRegistrados = alunosRegistrados;
    }
}

