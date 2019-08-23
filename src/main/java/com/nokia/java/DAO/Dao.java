package com.nokia.java.DAO;

import java.util.Map;
import java.util.Optional;

public interface Dao<T> {
    Optional<T> get(long id);
    Map<Integer, T> getAll();
    void save(int id,T t);
    void update(int id, T t);
    void delete(T t);
    void printAll();

}
