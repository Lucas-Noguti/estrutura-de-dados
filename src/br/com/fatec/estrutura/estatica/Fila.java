package br.com.fatec.estrutura.estatica;

public class Fila {
    String[] itens;
    int capacidade;
    int tamanho;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        tamanho = 0;
        itens = new String[this.capacidade];
    }

    public boolean vazia() {
        return tamanho == 0;
    }

    public boolean cheia() {
        return tamanho == capacidade;
    }

    public void enfileirar(String itens) {
        if (cheia()) {
            System.out.println("Fila cheia!");
        } else {
            this.itens[tamanho] = itens;
            tamanho++;
        }
    }

    public String desenfileirar() {
        if (vazia()) {
            return "Fila vazia!";
        } else {
            String itemRemovido = itens[0];
            tamanho--;
            for (int i = 0; i < tamanho; i++) {
                itens[i] = itens[i + 1];
            }
            return itemRemovido;
        }
    }

    public void imprimir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(itens[i] + " ");
        }
        System.out.println(" ");
    }
}
