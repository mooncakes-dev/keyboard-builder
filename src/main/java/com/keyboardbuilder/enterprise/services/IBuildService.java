package com.keyboardbuilder.enterprise.services;

import com.keyboardbuilder.enterprise.dto.Build;

import java.util.List;

public interface IBuildService {
    Build fetchById(int id) throws Exception;

    void delete(int id) throws Exception;

    Build save(Build keyboardBuild) throws Exception;

    List<Build> fetchAll() throws Exception;

    List<Build> fetchBuilds(String combinedName) throws Exception;
}
