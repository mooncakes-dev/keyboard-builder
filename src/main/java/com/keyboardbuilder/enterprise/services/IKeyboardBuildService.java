package com.keyboardbuilder.enterprise.services;

import com.keyboardbuilder.enterprise.dto.KeyboardBuild;

import java.util.List;

public interface IKeyboardBuildService {
    KeyboardBuild fetchById(int id);

    KeyboardBuild save(KeyboardBuild keyboardBuild) throws Exception;

    List<KeyboardBuild> fetchAll();
}
