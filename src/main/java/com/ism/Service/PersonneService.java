package com.ism.Service;

import java.util.ArrayList;

import com.ism.Dto.CreatePersonneDto;
import com.ism.Dto.ListPersonneDto;
import com.ism.Repository.PersonneRepository;

public class PersonneService implements PersonneServiceImpl {

    private PersonneRepository repo;

    public PersonneService(PersonneRepository repo){
        this.repo = repo;
    }

    @Override
    public boolean addPersonne(CreatePersonneDto personne) {
        return true;
    }

    @Override
    public ArrayList<ListPersonneDto> listPersonne() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listPersonne'");
    }
    
}
