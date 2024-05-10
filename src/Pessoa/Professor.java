package Pessoa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Professor {
    private String nome;
    private List<String> disciplinas;
    private Map<String, Map<String, Double>> notasPorDisciplina;

    // Construtor
    public Professor(String nome, String disciplinas) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
        this.notasPorDisciplina = new HashMap<>();
    }

    // Método para atribuir disciplina ao professor
    public void adicionarDisciplina(String disciplina) {
        disciplinas.add(disciplina);
        notasPorDisciplina.put(disciplina, new HashMap<>());
    }

    // Método para atribuir nota a um aluno em uma disciplina
    public void atribuirNota(String disciplina, Aluno aluno, double nota) {
        if (disciplinas.contains(disciplina)) {
            if (notasPorDisciplina.get(disciplina) != null) {
                notasPorDisciplina.get(disciplina).put(aluno.getMatricula(), nota);
            } else {
                System.out.println("Nenhuma nota atribuída. Disciplina inválida.");
            }
        } else {
            System.out.println("Nenhuma nota atribuída. Professor não ministra esta disciplina.");
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<String> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Map<String, Map<String, Double>> getNotasPorDisciplina() {
        return notasPorDisciplina;
    }

    public void setNotasPorDisciplina(Map<String, Map<String, Double>> notasPorDisciplina) {
        this.notasPorDisciplina = notasPorDisciplina;
    }
}
