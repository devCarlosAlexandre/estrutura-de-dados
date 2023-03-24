package avaliacaoPilhas;

public class Pilha {
    public static void main(String[] args) {
        PilhaImpl pilha = new PilhaImpl();
        System.out.println("Exercicio 1: ");
        pilha.imprimirPilhaInversa();
        System.out.println();
        System.out.println("Exercicio 2: ");
        pilha.empilharString("A");
        pilha.empilharString("B");
        pilha.empilharString("C");
        pilha.empilharString("D");
        pilha.empilharString("F");
        pilha.empilharString("G");
        System.out.println("Exercicio 3: ");
        pilha.desempilharString();
        System.out.println("Exercicio 4: ");
        pilha.desempilharLivro("Livro03");
    }
}
