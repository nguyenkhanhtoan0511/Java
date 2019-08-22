package com.nokia.java.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BoatDao implements Dao<Boat>{

    private List<Boat> boats = new ArrayList<>();

    public Optional<Boat> get(long id){
        return Optional.ofNullable(boats.get((int ) id));
    }
    public List<Boat> getAll(){
        return boats;
    }
    public void save(Boat boat){
        boats.add(boat);
    }
    public void update(Boat t, String params[]){

    }
    public void delete(Boat t){
        boats.remove(t);
    }

    public BoatDao(){
        boats.add(new Boat("light"));
        boats.add(new Boat("dark"));
        boats.add(new Boat("hqwrhqwkh"));
    }

}
