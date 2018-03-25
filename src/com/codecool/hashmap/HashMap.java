package com.codecool.hashmap;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class HashMap {
    private int size = 16;
    private LinkedList[] elements = new LinkedList[size];

    @SuppressWarnings("unchecked")
    void add(String key, Integer value){
        int position = getHash(key);
        List list = new LinkedList<KeyValue>();

        if(elements[position] == null){
            list.add(new KeyValue(key, value));
            elements[position] = (LinkedList) list;
        }else{
            list = elements[position];
            if(list.contains(key)){
                throw new IllegalArgumentException();
            }
            list.add(new KeyValue(key, value));
        }
    }
    void remove(String key){
        int position = getHash(key);
        LinkedList<KeyValue> element = elements[position];

        try {
            for (KeyValue e : element) {
                if (e.getKey().equals(key)){
                    element.remove(e);
                }
            }
        }
        catch (NullPointerException e){
            System.out.println("No element with the given key. Sorry bud.");
        }
    }

    void clearAll(){
        elements = new LinkedList[size];
    }

    private int getHash(String key){
        return Math.abs(key.hashCode() % size);
    }

    @SuppressWarnings("unchecked")
    Integer getValue(String key){
        int position = getHash(key);
        LinkedList<KeyValue> element = elements[position];

        try {
            for(KeyValue keyValue : element){
                if (keyValue.getKey().equals(key)){
                    return keyValue.getValue();
                }
            }
        } catch (NullPointerException e){
            System.out.println("No element with the given key. Sorry bud.");
        }
        return null;
    }

    @Override
    public String toString(){
        return Arrays.toString(elements);
    }
}
