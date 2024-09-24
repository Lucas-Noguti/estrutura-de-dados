package br.com.fatec.estrutura.listas;

public class ListaString {
    String[] dados;
    int capacidade;
    int tamanho;

    ListaString(int capacidade) {
        this.capacidade = capacidade;
        tamanho = 0;
        dados = new String[this.capacidade];
    }

    public boolean vazia() {
        return tamanho == 0;
    }

    public boolean cheia() {
        return tamanho == capacidade;
    }

    public void adicionar(String dados) {
        if (cheia()) {
            System.out.println("Lista cheia");
        } else {
            this.dados[tamanho] = dados;
            tamanho++;
        }
    }

    public int buscar(String dados) {
        int indice = -1;
        if (vazia()) {
            System.out.println("Lista vazia!");
        } else {
            for (int i = 0; i < tamanho; i++) {
                if (this.dados[i].equalsIgnoreCase(dados)) {
                    indice = i;
                    break;
                }
            }
        }
        return indice;
    }

    public void remover(String dados) {
        if (vazia()) {
            System.out.println("Lista vazia!");
        } else {
            int indice = buscar(dados);
            if (indice < 0) {
                System.out.println("Valor não encontrado!");
            } else {
                tamanho--;
                for (int i = indice; i < tamanho; i++) {
                    this.dados[i] = this.dados[i + 1];
                }
            }
        }
    }

    public void imprimir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("%s ", this.dados[i]);
        }
        System.out.println(" ");
    }
}

