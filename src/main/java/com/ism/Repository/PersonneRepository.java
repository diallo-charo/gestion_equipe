package com.ism.Repository;

import java.util.ArrayList;

import com.ism.Domain.Personne;

public interface PersonneRepository {
    boolean insert(Personne personne);
    ArrayList<Personne> selectAll();
}
