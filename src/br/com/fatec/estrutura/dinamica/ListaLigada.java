package br.com.fatec.estrutura.dinamica;

public class ListaLigada {
    //primeiro nó da lista
    No inicio;

    public ListaLigada() {
        inicio = null;
    }

    boolean vazia() {
        return inicio == null;
    }

    public void adicionarInicio(int numero) {
        No novoNumero = new No(numero);
        if (!vazia()) {
            novoNumero.proximo = inicio;
        }
        inicio = novoNumero;
    }

    public No buscar(int numero) {
        No atual = inicio;
        while (atual != null) {
            if (atual.numero == numero)
                break;
            atual = atual.proximo;
        }
        return atual;
    }

    public void adicionarFim(int numero) {
        No novo = new No(numero);
        if (vazia()) {
            adicionarInicio(numero);
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }

    public No removerFim() {
        No removido = null;
        if (vazia()) {
            System.out.println("Lista vazia!");
        } else {
            removido = inicio;
            if (inicio.proximo == null) {
                inicio = null;
            } else {
                No atual = inicio;
                No anterior = inicio;
                while (atual.proximo != null) {
                    anterior = atual;
                    atual = atual.proximo;
                }
                removido = anterior.proximo;
                anterior.proximo = null;
            }
        }
        return removido;    
    }

    public No removerInicio() {
        No removido = null;
        if (vazia()) {
            System.out.println("Lista vazia!");
        } else {
            removido = inicio;
            if (inicio.proximo == null) {
                inicio = null;
            } else {
                inicio = inicio.proximo;
            }
        }
        return removido;
    }

    public void imprimir() {
        if (vazia()) {
            System.out.println("Lista vazia!");
        }
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.numero + " ");
            atual = atual.proximo;
        }
        System.out.println(" ");
    }
}
