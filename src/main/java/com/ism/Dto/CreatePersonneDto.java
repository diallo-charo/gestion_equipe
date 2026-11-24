package com.ism.Dto;

import java.time.LocalDate;

import com.ism.Domain.Equipe;
import com.ism.Domain.PosteEnum;
import com.ism.Domain.StrategieEnum;
import com.ism.Domain.TypePersonne;

import lombok.Getter;

@Getter 
public class CreatePersonneDto {
    private final String nomComplet;
    private final LocalDate dateNaissance;
    private final TypePersonne typePersonne;
    private final int numero;
    private final PosteEnum poste;
    private final StrategieEnum strategie;

    public CreatePersonneDto(String nomComplet, LocalDate dateNaissance, TypePersonne typePersonne,StrategieEnum strategie) {
        this.nomComplet = nomComplet;
        this.dateNaissance = dateNaissance;
        this.typePersonne = typePersonne.ENTRAINEUR;
        this.strategie = strategie;
        this.numero = 0;
        this.poste = null;
    }

    public CreatePersonneDto(String nomComplet, LocalDate dateNaissance, TypePersonne typePersonne, int numero, PosteEnum poste) {
        this.nomComplet = nomComplet;
        this.dateNaissance = dateNaissance;
        this.typePersonne = typePersonne.JOUEUR;
        this.numero = numero;
        this.poste = poste;
        this.strategie = null;
    }

    
}
