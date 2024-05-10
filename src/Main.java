//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Estrutura.Biblioteca;
import Estrutura.Quadra;
import Estrutura.SalaDeAula;
import Pessoa.Aluno;
import Pessoa.Professor;
import Pessoa.Diretor;

public class Main {
    public static void main(String[] args) {
        // Criando objetos de exemplo
        Aluno aluno = new Aluno("João", 15, "2021001");
        Professor professor = new Professor("Maria", "Matemática");
        Diretor diretor = new Diretor("Carlos", "123456789", "Ensino");

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        biblioteca.registrarAluno(aluno);

        Quadra quadra = new Quadra("Futebol");
        quadra.reservar();

        SalaDeAula salaDeAula = new SalaDeAula("Sala 101", 30, professor);
        salaDeAula.adicionarAluno(aluno);
    }
}