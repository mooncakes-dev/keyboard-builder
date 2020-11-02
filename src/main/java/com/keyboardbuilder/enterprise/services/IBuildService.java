package com.keyboardbuilder.enterprise.services;

import com.keyboardbuilder.enterprise.dto.Build;

import java.util.List;

public interface IBuildService {
    Build fetchById(int id);

    void delete(int id) throw Exception;

    Build save(Build keyboardBuild) throws Exception;

    List<Build> fetchAll();

    List<Build> fetchBuilds(String combinedName);
}
