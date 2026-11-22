package com.ism.Repository.Memory;

import java.util.ArrayList;

import com.ism.Domain.Personne;
import com.ism.Repository.PersonneRepository;

public class PersonneRepositoryMemory implements PersonneRepository{

    private DataBaseMemory db;

    public PersonneRepositoryMemory(DataBaseMemory db){
        this.db = db;
    }

    @Override
    public boolean insert(Personne personne) {
        db.personnes.add(personne);
        return true;
    }

    @Override
    public ArrayList<Personne> selectAll() {
        return new ArrayList<>(db.personnes);
    }
}
