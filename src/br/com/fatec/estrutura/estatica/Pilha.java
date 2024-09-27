package br.com.fatec.estrutura.estatica;

public class Pilha {
    int[] numeros;
    int capacidade;
    int topo;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.topo = -1;
        numeros = new int[this.capacidade];
    }

    public boolean cheia() {
        return topo == capacidade - 1;
    }

    public boolean vazia() {
        return topo == -1;
    }

    public void empilhar(int numeros) {
        if (cheia()) {
            System.out.println("Pilha cheia!");
        } else {
            topo++;
            this.numeros[topo] = numeros;
        }
    }

    public int desempilhar() {
        if (vazia()) {
            System.out.println("Pilha vazia!");
            return 0;
        } else {
            int numeroDesempilhado = numeros[topo];
            topo--;
            return numeroDesempilhado;
        }
    }

    public void imprimir() {
        if (vazia()) {
            System.out.println("Pilha vazia!");
        } else {
            for (int i = 0; i < topo + 1; i++) {
                System.out.print(numeros[i] + " ");
            }
            System.out.println(" ");
        }
    }
}
