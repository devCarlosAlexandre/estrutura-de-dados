package avaliacaoPilhas;

public class PilhaImpl {
    private Integer[] pilhaComElementos =  {10,20,30,40,50,60};
    private Integer[] pilha = new Integer[10];
    private String[] pilhaString = new String[10];
    private String[] pilhaLivros = {"Livro01", "Livro02","Livro03","Livro04","Livro05", "Livro06", "Livro07"};

    private Integer topostring = null;

    private Integer topo = null;

    public boolean isFull(){
        if(topo == null){
            return false;
        }
        return topo == pilha.length -1;
    }

    public boolean isFullString(){
        if(topostring == null){
            return false;
        }
        return topostring == pilhaString.length -1;
    }

    public boolean isEmpty(){
        return topo == null;
    }

    public boolean isEmptyString(){
        return topostring == null;
    }

    public  Integer empilhar(Integer elemento){
        if(isFull()){
            System.out.println("Pilha está cheia!");
            return null;
        }
        if(topo == null){
            topo = 0;
            pilha[topo]= elemento;
            System.out.println(elemento+" empilhado na posição: "+topo);
            return elemento;
        }else{
            topo = topo+1;
            pilha[topo] = elemento;
            System.out.println(elemento+" empilhado na posição: "+topo);
            return elemento;
        }
    }

    public  String empilharString(String elemento){
        if(isFull()){
            System.out.println("Pilha está cheia!");
            return null;
        }else{
            if(topostring == null){
                topostring = 0;
                pilhaString[topostring]= elemento;
                System.out.println(elemento+" empilhado na posição: "+topostring);
                return elemento;
            }else{
                topostring = topostring +1;
                pilhaString[topostring] = elemento;
                System.out.println(elemento+" empilhado na posição: "+topostring);
                return elemento;
            }
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

    public void imprimirPilhaInversa(){
        for (int i=pilhaComElementos.length -1 ; i >= 0; i--){
            System.out.print("["+pilhaComElementos[i]+"] ");
        }
    }

    public String desempilharString(){
        if(isEmptyString()){
            System.out.println("Pilha está vázia!");
            return null;
        }
        String desempilhado = pilhaString[topostring];
        pilhaString[topostring] = null;

        if(topostring > 0){
            topostring =  topostring-1;
        }else {
            topostring = null;
        }

        int vazio = (pilhaString.length -1 ) - (topostring);
        int prenchido = (topostring+1);

        System.out.println("Desempilhado: "+desempilhado +" . Pilha ainda possui "+prenchido+" elementos prenchidos e "+vazio+" vazios");

        return desempilhado;
    }

    public void desempilharLivro(String livro){
        String nome ="";
        Integer posicao=null;

        for(int i=0; i < pilhaLivros.length; i++ ){
            if(pilhaLivros[i] == livro) {
            nome=pilhaLivros[i];
            posicao=i;
            }
        }

        if(nome !=""){
            Integer faltaDesempilhar = (pilhaLivros.length-1) - posicao;
            System.out.println("é necessário desempilhar " +faltaDesempilhar+ " livros para poder acessar o livro requisitado.");
        }else{
            System.out.println("Livro não encontrado.");
        }

    }



}
