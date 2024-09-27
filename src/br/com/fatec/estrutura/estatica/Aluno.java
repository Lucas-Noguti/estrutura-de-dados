package br.com.fatec.estrutura.estatica;

public class Aluno {
    String nome;
    String ra;
    int idade;

    Aluno(String nome, String ra, int idade) {
        this.nome = nome;
        this.ra = ra;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return String.format("nome = %s RA = %s idade = %d", nome, ra, idade);
    }
}
