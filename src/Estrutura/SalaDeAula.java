package Estrutura;

import java.util.ArrayList;
import java.util.List;
import Pessoa.Aluno;
import Pessoa.Professor;

public class SalaDeAula {
    private String nome;
    private int capacidade;
    private List<Aluno> alunosPresentes;
    private Professor professorResponsavel;

    // Construtor
    public SalaDeAula(String nome, int capacidade, Professor professorResponsavel) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.professorResponsavel = professorResponsavel;
        this.alunosPresentes = new ArrayList<>();
    }

    // Métodos
    public void adicionarAluno(Aluno aluno) {
        if (alunosPresentes.size() < capacidade) {
            alunosPresentes.add(aluno);
        } else {
            System.out.println("Capacidade máxima da sala atingida.");
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<Aluno> getAlunosPresentes() {
        return alunosPresentes;
    }

    public void setAlunosPresentes(List<Aluno> alunosPresentes) {
        this.alunosPresentes = alunosPresentes;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }
}