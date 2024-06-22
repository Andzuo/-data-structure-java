package com.dio.lista;


public class List<T> {

    private No<T> getEntryReference;

    public List() {
        this.getEntryReference = null;
    }

    public void add(T content){
        No<T> newNo = new No(content);
        if(this.isEmpty()){
            getEntryReference = newNo;
            return;
        }
        No<T> noAux = getEntryReference;
        for(int i = 0; i < size() - 1; i++){
            noAux = noAux.getNextNo();
        }
        noAux.setNextNo(newNo);
    }

    public T get(int index){
        return getNo(index).getContent();
    }

    private No<T> getNo(int index){
        validated(index);
        No<T> noAux = getEntryReference;
        No<T> noRetorno = null;
        for(int i = 0; i <= index; i++){
            noRetorno = noAux;
            noAux = noAux.getNextNo();
        }
        return noRetorno;
    }

    public T remove(int index){
        validated(index);
        No<T> noAim = getNo(index);
        if(index == 0){
            getEntryReference = noAim.getNextNo();
            return noAim.getContent();
        }
        No<T> noAnterior = getNo(index - 1);
        noAnterior.setNextNo(noAim.getNextNo());
        return noAim.getContent();
    }

    public int size(){
        int listSize = 0;
        No<T> refAux = getEntryReference;
        while(true){
            if(refAux != null){
                listSize++;
                if(refAux.getNextNo() != null){
                    refAux = refAux.getNextNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return listSize;
    }

    private void validated(int index){
        if(index >= size()){
            int lastIndex = size()-1;
            throw new IndexOutOfBoundsException("There is no content in the index " + index + " This list only goes up to the index " + lastIndex + '.');
        }
    }

    public boolean isEmpty(){
        return getEntryReference == null ? true : false;
    }

    public No<T> getEntryReference() {
        return getEntryReference;
    }

    public void setReferenciaEntrada(No<T> getEntryReference) {
        this.getEntryReference = getEntryReference;
    }

    @Override
    public String toString() {
        String str = "";
        No<T> noAux = getEntryReference;
        for(int i = 0; i < size(); i++){
            str += "[No{content=" + noAux.getContent() +"}]--->";
            noAux = noAux.getNextNo();
        }
        str += "null";
        return str;
    }
}