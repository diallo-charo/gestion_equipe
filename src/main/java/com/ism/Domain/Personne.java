package com.ism.Domain;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString 
@NoArgsConstructor 
@Getter 
@Setter 
@AllArgsConstructor 
public abstract class Personne {
    protected String nomComplet;
    protected LocalDate dateNaissance;
    protected TypePersonne typePersonne;
    protected  Equipe equipe;


    protected int age(){
        return LocalDate.now().getYear() - dateNaissance.getYear();
    }
}
