package com.epam.collection.CustomList;

import java.io.Serializable;
import java.util.Vector;

class CustomList<T> implements Serializable{

    private static final long serialVersionUID = 1L;
    private Vector<T> list;

    CustomList(Vector<T> list){
        this.list = list;
    }
    public T get(int index) {
        return list.get(index);
    }

    public void append(T object){
        list.add(object);
    }

    public void add(T object){
        list.add(object);
    }

    public CustomList(){
        list = new Vector<T>();
    }

    public void remove(T object){
        list.remove(object);
    }

    public Integer indexOf(T object){
        return list.indexOf(object);        
    }

    public Integer length(){
        return list.size();
    }
    @Override
    public String toString() {
        return list.toString();
    }
}