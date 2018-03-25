package com.codecool.hashmap;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        List <String> abc = new ArrayList<>();
        abc.add("A");
        abc.add("B");
        abc.add("C");
        abc.add("D");
        abc.add("E");
        abc.add("F");
        abc.add("G");
        abc.add("H");
        abc.add("I");
        abc.add("K");
        abc.add("L");
        abc.add("M");
        abc.add("N");
        abc.add("O");
        abc.add("P");
        abc.add("Q");
        for(int i = 0; 16 > i; i++){
            hashMap.add(abc.get(i), i);
        }
        System.out.println(hashMap);
    }
}
