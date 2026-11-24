package com.ism.Factory;

import com.ism.Repository.PersonneRepository;
import com.ism.Repository.Memory.DataBaseMemory;
import com.ism.Repository.Memory.PersonneRepositoryMemory;

public final class RepositoryFactory {
    public static PersonneRepository createRepositoryPersonne(){
        return new PersonneRepositoryMemory(DataBaseMemory.getInstance());
    }
}
