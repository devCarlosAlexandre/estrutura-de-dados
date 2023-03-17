package filasImpl;

public class FilasImpl {
   private Integer[] elementos= new Integer[10];
   private int proximoELemento =0;

   public  boolean isFull(){
    return proximoELemento == elementos.length;
   }
   public boolean isEmpty(){
       return proximoELemento == 0;
   }
   public void insertElement(Integer elemento){
       if(isFull()){
           System.out.println("Lista está cheia");
           return;
       }
       elementos[proximoELemento] = elemento;
       proximoELemento++;
   }
   public void toStringFila(){
       String aFila ="";
       for(int i =0; i < elementos.length; i++){
           if (elementos[i] != null){
               aFila += "[ "+ elementos[i] +"] ";
           }
       }
       System.out.println(aFila);
   }
    public void tamanhoFila(){
        System.out.println("Tamanho da fila: "+proximoELemento);
    }
    public void proximoELementoASair(){
       if(elementos[0] != null){
           System.out.println("Proximo elemento a sair da fila: "+elementos[0]);
       }else{
           System.out.println("Lista já está vazia");
       }
    }

   public void removeFirstElement(){
       if(isEmpty()){
           return ;
       }
       for (int i=0; i < elementos.length -1; i++){
           elementos[i] = elementos[i+1];
       }
       elementos[elementos.length -1] = null;
       proximoELemento = proximoELemento - 1;
   }
}
