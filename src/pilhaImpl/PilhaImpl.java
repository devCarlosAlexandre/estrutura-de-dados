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

}
