package com.ism.View;

import java.io.Console;
import java.time.LocalDate;

import com.ism.Domain.PosteEnum;
import com.ism.Domain.StrategieEnum;
import com.ism.Domain.TypePersonne;
import com.ism.Dto.CreatePersonneDto;
import com.ism.Dto.ListPersonneDto;

public final class PersonneView {
    public static int menu(){
        System.out.println("1. Ajouter une Joueur ou un Entraineur");
        System.out.println("2. lister les joueurs ou les entraineurs");
        System.out.println("3. Ajouter un joueur ou un entraineur à une équipe");
        System.out.println("4. Lister les joueurs ou les entraineurs d'une équipe");
        System.out.println("5. Quitter");
        String option = System.console().readLine("Veuillez choisir une option : ");
        return Integer.parseInt(option);
    }

    public static PosteEnum selectPoste(){
        int choix = 0;
        do {
            System.out.println("Veuillez choisir un poste :");
            System.out.println("1. Attaquant");
            System.out.println("2. Milieu");
            System.out.println("3. Défenseur");
            choix = Integer.parseInt(System.console().readLine());
            switch (choix) {
                case 1:
                    return PosteEnum.ATTAQUANT;
                case 2:
                    return PosteEnum.MILIEU;
                case 3:
                    return PosteEnum.DEFENSEUR;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix < 1 || choix > 3);
        return null;
    }

    public static TypePersonne selectTypePersonne(){
        int choix = 0;
        do {
            System.out.println("Veuillez choisir un type de personne :");
            System.out.println("1. Joueur");
            System.out.println("2. Entraineur");
            choix = Integer.parseInt(System.console().readLine());
            switch (choix) {
                case 1:
                    return TypePersonne.JOUEUR;
                case 2:
                    return TypePersonne.ENTRAINEUR;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix < 1 || choix > 2);
        return null;
    }

    public static StrategieEnum selectStrategie(){
        int choix = 0;
        do {
            System.out.println("Veuillez choisir une stratégie :");
            System.out.println("1. Offensive");
            System.out.println("2. Défensive");
            choix = Integer.parseInt(System.console().readLine());
            switch (choix) {
                case 1:
                    return StrategieEnum.OFFENSIVE;
                case 2:
                    return StrategieEnum.DEFENSIVE;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix < 1 || choix > 2);
        return null;
    }

    public static int lireEntier(String msg)
    {
        int entier;
        do
        {
            System.out.println(msg);
            entier = Integer.parseInt(System.console().readLine());
        } while (entier < 0);
        return entier;
    }

    public static CreatePersonneDto saisiPersonne(){
        String nomComplet = lireChaine("Nom Complet");
        String dateNaissanceStr = System.console().readLine("Veuillez entrer la date de naissance (yyyy-MM-dd) : ");
        TypePersonne typePersonne = selectTypePersonne();
        if (typePersonne == TypePersonne.ENTRAINEUR) {
            StrategieEnum strategie = selectStrategie();
            return new CreatePersonneDto(nomComplet,LocalDate.parse(dateNaissanceStr), typePersonne, strategie);
        } else {
            int numero = lireEntier("Veuillez entrer le numéro (pour les joueurs) : ");
            PosteEnum poste = selectPoste();
            return new CreatePersonneDto(nomComplet, LocalDate.parse(dateNaissanceStr), typePersonne, numero, poste);
        }
    }

    public static String lireChaine(String msg)
    {
        String chaine;
        do
        {
            System.out.println(msg);
            chaine = System.console().readLine();
        } while (chaine == null);
        return chaine;
    }

    public static void affichePersonne(ListPersonneDto personne){
        System.out.println("Nom complet : " + personne.nomComplet());
        System.out.println("Date de naissance : " + personne.dateNaissance());
        System.out.println("Type de personne : " + personne.typePersonne());
        System.out.println("Equipe : " + personne.equipe());
        if(personne.typePersonne() == TypePersonne.JOUEUR){
            System.out.println("Numéro : " + personne.numero());
            System.out.println("Poste : " + personne.poste());
        } else {
            System.out.println("Stratégie : " + personne.strategie());
        }
    }

    public static void affichePersonnes(java.util.ArrayList<ListPersonneDto> personnes){
        for(ListPersonneDto personne : personnes){
            affichePersonne(personne);
            System.out.println("--------------------");
        }
    }
}
