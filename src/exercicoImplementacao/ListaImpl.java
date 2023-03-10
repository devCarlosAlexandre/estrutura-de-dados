package exercicoImplementacao;

public class ListaImpl {
    private Integer [] elementos = new Integer[10];
    public int quantiadeElementos(){
        int quantidade =0;
        for (int i =0; i < elementos.length; i++){
            if(elementos[i] != null) {
                quantidade++;
            }
        }
        return quantidade;
    };

    public boolean isFull(){
        return quantiadeElementos() == elementos.length;
    }

    public boolean isEmpty(){
        return  quantiadeElementos() ==0;
    }

    public void setElement(int element){
        if (isFull()){
            return;
        }

        for(int i =0; i < elementos.length; i++){
            if(elementos[i] == null){
                elementos[i] = element;
                break;
            }
        }

    }

    public String toStringList(){
        String listString="";
        for(int i=0; i< elementos.length; i++){
           listString +=  elementos[i]+" ";
        }
        return listString;
    }

    public void delet(int element){
        for(int i =0; i < elementos.length; i++){
            if(element == elementos[i]){
                elementos[i] = null;
                break;
            }else{
                break;
            }
        }
    }


}
