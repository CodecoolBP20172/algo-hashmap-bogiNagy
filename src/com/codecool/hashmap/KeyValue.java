package com.codecool.hashmap;

import java.util.Objects;

public class KeyValue {

    private String key;
    private Integer value;

    public KeyValue(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        KeyValue keyValue = (KeyValue) object;
        return Objects.equals(key, keyValue.key);
    }

    @Override
    public String toString(){
        return key + " = " + value;
    }
}
