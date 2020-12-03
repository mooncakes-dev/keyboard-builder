package com.keyboardbuilder.enterprise.dao;

import com.keyboardbuilder.enterprise.dto.KeyboardBuild;

import java.util.List;


public interface IKeyboardBuildDAO {
    KeyboardBuild save(KeyboardBuild keyboardBuild) throws Exception;

    List<KeyboardBuild> fetchAll();
}
