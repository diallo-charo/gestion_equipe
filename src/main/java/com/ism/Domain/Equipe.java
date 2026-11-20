package com.ism.Domain;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@AllArgsConstructor 
@NoArgsConstructor 
public class Equipe {
    private String nom;
    private String ville;
    private Entrenaire entrenaire;
    private ArrayList<Joueur> joueurs = new ArrayList<>();

}
