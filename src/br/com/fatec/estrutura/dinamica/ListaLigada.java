package br.com.fatec.estrutura.dinamica;

public class ListaLigada {
    //primeiro nó da lista
    No inicio;

    ListaLigada() {
        inicio = null;
    }

    boolean vazia() {
        return inicio == null;
    }
}
