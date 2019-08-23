package com.nokia.java.DAO;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GenericDao<T> implements Dao<T> {

    private Map<Integer, T> mapGeneric = new HashMap<>();

    public Optional<T> get(long id){
        return Optional.ofNullable(mapGeneric.get((int) id));
    };

    public Map<Integer, T> getAll(){
        return mapGeneric;
    }

    public void save(int id,T t){
        mapGeneric.put(id, t);
    }

    public void update(int id, T t){
        mapGeneric.put(id, t);
    }

    public void delete(T t){
        mapGeneric.remove(t);
    }

    public void printAll(){
        for(Map.Entry<Integer, T> entry : mapGeneric.entrySet()){
            System.out.println(entry.getValue().toString());
        }
    }
}
