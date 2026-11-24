package com.ism.Domain;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@ToString 
public class Entrenaire extends Personne{
    private StrategieEnum strategie;

    public Entrenaire(String nomComplet, LocalDate dateNaissance, Equipe equipe,
            StrategieEnum strategie) {
        super(nomComplet, dateNaissance, TypePersonne.ENTRAINEUR, equipe);
        this.strategie = strategie;
    }
}
