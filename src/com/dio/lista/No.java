package com.dio.lista;

public class No<T> {

    private T content;
    private No nextNo;

    public No() {
        this.nextNo = null;
    }

    public No(T content, No nextNo) {
        this.content = content;
        this.nextNo = nextNo;
    }

    public No(T content) {
        this.content = content;
        this.nextNo = null;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public No getNextNo() {
        return nextNo;
    }

    public void setNextNo(No nextNo) {
        this.nextNo = nextNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "content=" + content +
                '}';
    }

    public String toStringEncad() {
        String str = "No{" +
                "conteudo" + content +
                '}';

        if (nextNo != null) {
            str += "->" + nextNo.toString();
        } else {
            str += "->null";
        }

        return str;
    }
}
