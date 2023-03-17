package filas;

import filasImpl.FilasImpl;

public class Filas {
    public static void main(String[] args) {
        FilasImpl fila = new FilasImpl();
        System.out.println("Fila está cheia? "+fila.isFull());
        fila.insertElement(2);
        fila.insertElement(4);
        fila.insertElement(5);
        fila.insertElement(7);
        fila.removeFirstElement();
        fila.proximoELementoASair();
        fila.tamanhoFila();
        fila.toStringFila();


    }

}
