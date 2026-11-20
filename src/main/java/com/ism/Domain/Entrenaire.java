package com.ism.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@NoArgsConstructor 
@ToString 
@AllArgsConstructor 
public class Entrenaire extends Personne{
    private StrategieEnum strategie;
}
