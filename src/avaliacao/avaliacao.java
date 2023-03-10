package avaliacao;

import avalicaoImpl.avaliacaoImpl;

public class avaliacao {
    public static void main(String[] args) {
        int [] lista1 = {1,2,3,4,5,6,7};
        avaliacaoImpl av = new avaliacaoImpl();
       av.setItem(lista1, 3);

    }
}
