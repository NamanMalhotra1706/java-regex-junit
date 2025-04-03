package com.bridgelabz.junit.basic;

import java.util.List;

public class ListManager {

    public void addElement(List<Integer> list , int element){
        list.add(element);
    }

    public void removeElement(List<Integer> list, int element){
        list.remove(element);
    }

    public int getListSize(List<Integer> list){
        return list.size();
    }

    public static void main(String[] args) {

    }
}
