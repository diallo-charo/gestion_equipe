package com.ism.Service;

import java.util.ArrayList;

import com.ism.Domain.Entrenaire;
import com.ism.Domain.Joueur;
import com.ism.Domain.Personne;
import com.ism.Domain.TypePersonne;
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
        var nomComplet = personne.getNomComplet();
        var dateNaissance = personne.getDateNaissance();
        var equipe = personne.getEquipe();

        if(personne.getTypePersonne() == TypePersonne.ENTRAINEUR){
            var strategie = personne.getStrategie();
            Entrenaire entrenaire = new Entrenaire(nomComplet, dateNaissance, equipe, strategie);
            return this.repo.insert(entrenaire);
        }

        var numero = personne.getNumero();
        var poste = personne.getPoste();
        Joueur joueur = new Joueur(nomComplet, dateNaissance, equipe, numero, poste);
        return this.repo.insert(joueur);
    }

    @Override
    public ArrayList<ListPersonneDto> listPersonne() {
        ArrayList<ListPersonneDto> personnesDto = new ArrayList<>();
        var personnes = this.repo.selectAll();
        for(Personne personne : personnes){
            var nomComplet = personne.getNomComplet();
            var dateNaissance = personne.getDateNaissance();
            var typePersonne = personne.getTypePersonne();
            var equipe = personne.getEquipe();

            if(personne.getTypePersonne() == TypePersonne.ENTRAINEUR){
                Entrenaire entrenaire = (Entrenaire) personne;
                var strategie = entrenaire.getStrategie();
                ListPersonneDto dto = new ListPersonneDto(nomComplet, dateNaissance, typePersonne, equipe, 0, null, strategie);
                personnesDto.add(dto);
              
            }else{
                Joueur joueur = (Joueur) personne;
                var numero = joueur.getNumero();
                var poste = joueur.getPoste();
                ListPersonneDto dto = new ListPersonneDto(nomComplet, dateNaissance, typePersonne, equipe, numero, poste, null);
                personnesDto.add(dto);
            }        
        }
        return personnesDto;
    }
    
}
