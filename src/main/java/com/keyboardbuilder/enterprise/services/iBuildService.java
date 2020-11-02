package com.keyboardbuilder.enterprise.services;

import com.keyboardbuilder.enterprise.dto.KeyboardBuild;

import java.util.List;

public interface iBuildService {
    KeyboardBuild fetchById(int id);

    void delete(int id) throw Exception;

    KeyboardBuild save(KeyboardBuild keyboardBuild) throws Exception;

    List<KeyboardBuild> fetchAll();

    List<KeyboardBuild> fetchBuilds(String combinedName);
}
