package com.ism.Domain;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@ToString 
public class Joueur extends Personne {
    private int numero ;
    private PosteEnum poste;
    public Joueur(String nomComplet, LocalDate dateNaissance, Equipe equipe, int numero,
            PosteEnum poste) {
        super(nomComplet, dateNaissance, TypePersonne.JOUEUR, equipe);
        this.numero = numero;
        this.poste = poste;
    }
}
