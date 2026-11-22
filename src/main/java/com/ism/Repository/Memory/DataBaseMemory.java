package com.ism.Repository.Memory;

import java.util.ArrayList;

import com.ism.Domain.Personne;

public class DataBaseMemory {

    public final ArrayList<Personne> personnes = new ArrayList<>();


    private DataBaseMemory(){}

    private static DataBaseMemory instance = null;

    public static DataBaseMemory getInstance(){
        if (instance == null) {
            instance = new DataBaseMemory();
        }
        return instance;
    }
}
