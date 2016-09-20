package com.example.user.examenmemento;

import java.util.ArrayList;

/**
 * Created by user on 10/09/2016.
 */
public class CareTaker {
    private ArrayList<Memento> mementos =new ArrayList<Memento>();

    public  void addMemento(Memento memento){
        mementos.add(memento);
    }
    public Memento getMemento(int index){
        return mementos.get(index);
    }
    public ArrayList<Memento>getMementos(){
        return mementos;
    }
}
