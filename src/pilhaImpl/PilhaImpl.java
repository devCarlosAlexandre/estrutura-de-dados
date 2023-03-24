package pilhaImpl;

public class PilhaImpl {
    Integer[] pilha = new Integer[10];
    private Integer topo =null;

    public boolean isFull(){
        if(topo == null){
            return false;
        }
        return topo == pilha.length -1;
    }
    public boolean isEmpty(){
        return topo == null;
    }
    public  void empilhar(Integer elemento){
        if(isFull()){
            System.out.println("Pilha está cheia!");
            return;
        }
        if(topo == null){
            topo = 0;
            pilha[topo]= elemento;
        }else{
            topo = topo+1;
            pilha[topo] = elemento;
        }

    }

    public Integer desempilhar(){
        if(isEmpty()){
            System.out.println("Pilha está vázia!");
            return null;
        }
        Integer desempilhado = pilha[topo];
        pilha[topo] = null;

        if(topo > 0){
            topo =  topo-1;
        }else {
            topo = null;
        }
        topo--;

        System.out.println("Desempilhado: "+desempilhado);
        return desempilhado;
    }

    public void imprimirPilha(){
        for (int i=0; i < pilha.length; i++){
            if(pilha[i] != null){
                System.out.println("[ "+pilha[i]+" ]");
            }
        }
    }

}
