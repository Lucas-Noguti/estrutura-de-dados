public class Lista {
    int[] dados;
    int tamanho;
    int capacidade;

    //Construtor
    Lista(int capacidade) {
        this.capacidade = capacidade;
        tamanho = 0;
        dados = new int[this.capacidade];
    }

    
}
