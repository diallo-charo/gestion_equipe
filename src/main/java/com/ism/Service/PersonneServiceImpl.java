package com.ism.Service;

import java.util.ArrayList;

import com.ism.Dto.CreatePersonneDto;
import com.ism.Dto.ListPersonneDto;

public interface PersonneServiceImpl {
    boolean addPersonne(CreatePersonneDto personne);
    ArrayList<ListPersonneDto> listPersonne();
}
