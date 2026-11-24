package com.ism;

import com.ism.Factory.RepositoryFactory;
import com.ism.Service.PersonneService;
import com.ism.Service.PersonneServiceImpl;
import com.ism.View.PersonneView;

public class Main {
    public static void main(String[] args) {
        //factory
        PersonneServiceImpl servicePersonne = new PersonneService(RepositoryFactory.createRepositoryPersonne());
        int choix ;
        do {
            choix = PersonneView.menu();
            switch (choix) {
                case 1:
                    var personne = PersonneView.saisiPersonne();
                    boolean result = servicePersonne.addPersonne(personne);
                    if(result){
                        System.out.println("Ajouter avec success");
                    }else{
                        System.out.println("echec de l'ajoute");
                    }
                    break;
                case 2:
                    
                    break;
            
                default:
                    break;
            }
        } while (choix!=5);

    }
}