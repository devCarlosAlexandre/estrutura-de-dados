package pilha;

import pilhaImpl.PilhaImpl;

public class Pilha {
    public static void main(String[] args) {
        PilhaImpl pilha = new PilhaImpl();
        pilha.empilhar(10);
        pilha.empilhar(7);
        pilha.empilhar(90);
        pilha.imprimirPilha();
        pilha.desempilhar();
        pilha.imprimirPilha();
    }
}
