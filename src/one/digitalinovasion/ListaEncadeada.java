package one.digitalinovasion;

public class ListaEncadeada <T>{
    private No<T> referenciaEntrada;

    public ListaEncadeada(No<T> referenciaEntrada) {
        this.referenciaEntrada = null;
    }
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size()-1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar = noAuxiliar.getProximoNo();
    }
    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAuxiliar = referenciaEntrada;
        while (true) { 
            if(referenciaAuxiliar != null){
                tamanhoLista++;
                if(referenciaAuxiliar.getProximoNo() != null){
                    referenciaAuxiliar = referenciaAuxiliar.getProximoNo();
                }
                else{
                    break;
                }
            }
            else{
                break;
            }
        }
        return tamanhoLista;
    }
    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }
}
