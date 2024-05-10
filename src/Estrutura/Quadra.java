package Estrutura;

public class Quadra {
    private String tipo;
    private boolean disponivel;

    // Construtor
    public Quadra(String tipo) {
        this.tipo = tipo;
        this.disponivel = true; // Inicialmente, a quadra está disponível
    }

    // Método para reservar a quadra
    public void reservar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Quadra reservada com sucesso.");
        } else {
            System.out.println("A quadra já está reservada.");
        }
    }

    // Método para liberar a quadra
    public void liberar() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Quadra liberada.");
        } else {
            System.out.println("A quadra já está disponível.");
        }
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}