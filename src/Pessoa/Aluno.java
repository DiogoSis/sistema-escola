package Pessoa;

public class Aluno {
    private String nome;
    private int idade;
    private String matricula;
    private double[] notas; // Array para armazenar notas

    // Construtor
    public Aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.notas = new double[4];
    }

    // Métodos
    public void setNota(int bimestre, double nota) {
        if (bimestre >= 1 && bimestre <= notas.length) {
            notas[bimestre - 1] = nota;
        } else {
            System.out.println("Bimestre inválido.");
        }
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    // Getters e Setters
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}