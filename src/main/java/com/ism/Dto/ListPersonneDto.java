package com.ism.Dto;

import java.time.LocalDate;

import com.ism.Domain.Equipe;
import com.ism.Domain.PosteEnum;
import com.ism.Domain.StrategieEnum;
import com.ism.Domain.TypePersonne;

public record ListPersonneDto(
    String nomComplet,
    LocalDate dateNaissance,
    TypePersonne typePersonne,
    Equipe equipe,
    int numero,
    PosteEnum poste,
    StrategieEnum strategie
) {
    
}
