package com.keyboardbuilder.enterprise.services;

import com.keyboardbuilder.enterprise.dao.IKeyboardBuildDAO;
import com.keyboardbuilder.enterprise.dto.KeyboardBuild;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeyboardBuildServiceStub implements IKeyboardBuildService {

    @Autowired
    private IKeyboardBuildDAO keyboardBuildDAO;

    public KeyboardBuildServiceStub() {

    }

    public KeyboardBuildServiceStub(IKeyboardBuildDAO keyboardBuildDAO) {
        this.keyboardBuildDAO = keyboardBuildDAO;
    }


    @Override
    @Cacheable(value="build", key="#id")
    public KeyboardBuild fetchById(int id) {
        KeyboardBuild keyboardBuild = new KeyboardBuild();
        keyboardBuild.setId(1);
        keyboardBuild.setCaseType("aluminum");
        keyboardBuild.setKeySwitches("Sakura");
        keyboardBuild.setKeyCaps("Pono");
        keyboardBuild.setLayout(65);
        keyboardBuild.setPlate("brass");
        return keyboardBuild;
    }

    @Override
    public KeyboardBuild save(KeyboardBuild keyboardBuild) throws Exception {
        return keyboardBuildDAO.save(keyboardBuild);
    }

    @Override
    public List<KeyboardBuild> fetchAll() {
        return keyboardBuildDAO.fetchAll();
    }

}
