package br.com.fatec.estrutura.estatica;

public class ListaAluno {
    Aluno[] aluno;
    int tamanho;
    int capacidade;

    public ListaAluno(int capacidade) {
        this.capacidade = capacidade;
        tamanho = 0;
        aluno = new Aluno[this.capacidade];
    }

    public boolean vazia() {
        return tamanho == 0;
    }

    public boolean cheia() {
        return tamanho == capacidade;
    }

    public void adicionar(Aluno aluno) {
        if (cheia()) {
            System.out.println("Lista cheia!");
        } else {
            this.aluno[tamanho] = aluno;
            tamanho++;
        }
    }

    public void imprimir() {
        if (vazia()) {
            System.out.println("Lista vazia!");
        } else {
            for (int i = 0; i < tamanho; i++) {
                System.out.println(aluno[i] + " ");
            }
        }
    }

    public int buscar(String ra) {
        int indice = -1;
            if (vazia()) {
                System.out.println("Lista vazia!");
            } else {
                for (int i = 0; i < tamanho; i++) {
                    if (aluno[i].ra.equals(ra)) {
                        indice = i;
                        break;
                    }
                }
            }
        return indice;
    }

    public void remover(String ra) {
        if (vazia()) {
            System.out.println("Lista vazia!");
        } else {
            int indice = buscar(ra);
            if (indice < 1) {
                System.out.println("Valor não encontrado!");
            } else {
                tamanho--;
                for (int i = indice; i < tamanho; i++) {
                    aluno[i] = aluno[i +1];
                }
            }
        }
    }
}
