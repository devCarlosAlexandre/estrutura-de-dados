package exercicios;

import exercicoImplementacao.ListaImpl;

public class Lista {
    public static void main(String[] args) {
        ListaImpl lista = new ListaImpl();

        lista.setElement(20);
        lista.setElement(8);
        lista.delet(8);

        System.out.println( "A lista está vazia? " +lista.isEmpty());
        System.out.println( "A lista está cheia? " +lista.isFull());
        System.out.println(lista.toStringList());

    }




}
