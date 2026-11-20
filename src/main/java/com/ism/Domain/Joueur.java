package com.ism.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@ToString 
@NoArgsConstructor 
@AllArgsConstructor 
public class Joueur extends Personne {
    private int numero ;
    private PosteEnum poste;
}
