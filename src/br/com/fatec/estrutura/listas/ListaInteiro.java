package br.com.fatec.estrutura.listas;

public class ListaInteiro {
    int[] numeros;
    int tamanho;
    int capacidade;

    //Construtor
    ListaInteiro(int capacidade) {
        this.capacidade = capacidade;
        tamanho = 0;
        numeros = new int[this.capacidade];
    }

    public boolean vazia() {
        return tamanho == 0;
    }

    public boolean cheia() {
        return tamanho == capacidade;
    }

    public void adicionar(int numeros) {
        if (cheia()) {
            System.out.println("Lista cheia!");
        } else {
            this.numeros[tamanho] = numeros;
            tamanho++;
        }
    }

    public int buscar(int dados) {
        int indice = -1;
        if (vazia()) {
            System.out.println("Lista vazia!");
        } else {
            for (int i = 0; i < tamanho; i++) {
                if (this.numeros[i] == dados) {
                    indice = i;
                    break;
                }
            }        
        }
        return indice;
    }

    public void remover(int dados) {
        if (vazia()) {
            System.out.println("Lista vazia!");
        } else {
            int indice = buscar(dados);
            if (indice < 0) {
                System.out.println("Valor não encontrado!");
            } else {
                tamanho--;
                for (int i = indice; i < tamanho; i++) {
                    this.numeros[i] = this.numeros[i + 1];
                }
            }
        }
    }

    public void imprimir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
