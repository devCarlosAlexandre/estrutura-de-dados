package avalicaoImpl;

public class avaliacaoImpl {
    private Integer [] listaMaioQueDez = {20,2,13,21,5,73,0,100,9};
    private Integer [] listainversa = {1,2,3,4,5,6,7,8,9,10};

    public void maiorQueDez(){
        for(int i =0; i < listaMaioQueDez.length; i++){
            if(listaMaioQueDez[i] > 10 && listaMaioQueDez != null){
                System.out.println("[ "+listaMaioQueDez[i] +" ]");
            }
        }
    }

    public void listaInversa(){
        for(int i = listainversa.length-1; i >= 0; i--){
            System.out.println("[ "+listainversa[i]+ " ]");
        }
    }

    public void combinarLista(){
        Integer [] lista1 = {1,2,3,4,5,6,7,8,9, 10,11,12,13,14,15};
        Integer [] lista2 = {16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        int [] lista3 = new int[lista2.length+lista1.length];

        for(int i=0; i < lista1.length; i++){
            lista3[i] = lista1[i];
        }

       int index2 = lista2.length;

        for(int i=0; i < lista2.length; i++){
            lista3[index2] = lista2[i];
            index2++;
        }

        for (int i = 0; i < lista3.length; i++){
            System.out.println("[ "+lista3[i]+" ]");
        }
    }



    public void setItem(int[] vetor, int value){
        int [] newLista = new int[vetor.length+1];

        for(int i = 0; i < vetor.length; i++){
            newLista[i] = vetor[i];
        }

        newLista[newLista.length-1] = value;

        for(int i =0; i < newLista.length; i++){
            System.out.println(newLista[i]);
        }
    }

}
