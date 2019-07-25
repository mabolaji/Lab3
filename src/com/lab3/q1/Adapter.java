package com.lab3.q1;

public class Adapter implements  IQueue, IStack {

    private Adaptee adaptee;

    public Adapter(){
        this.adaptee = new Adaptee();
    }


    @Override
    public String pop() {
        int end = adaptee.getEnd();
        String str = adaptee.get(end);
        adaptee.remove(end);
        return str;
    }

    @Override
    public String peek() {
        return this.adaptee.get(adaptee.getEnd());
    }

    @Override
    public void push(String t) {
         this.adaptee.add(t);
    }

    @Override
    public String element() {
        return this.adaptee.endString();
    }

    @Override
    public void add(String t) {
        this.adaptee.add(t);
    }
}
