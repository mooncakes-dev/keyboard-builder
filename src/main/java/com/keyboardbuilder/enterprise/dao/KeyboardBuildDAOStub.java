package com.keyboardbuilder.enterprise.dao;

import com.keyboardbuilder.enterprise.dto.KeyboardBuild;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class KeyboardBuildDAOStub implements IKeyboardBuildDAO {

    List<KeyboardBuild> allKeyboardBuilds = new ArrayList<KeyboardBuild>();

    @Override
    public KeyboardBuild save(KeyboardBuild keyboardBuild) throws Exception {
        allKeyboardBuilds.add(keyboardBuild);
        return keyboardBuild;
    }

    @Override
    public List<KeyboardBuild> fetchAll() {
        return allKeyboardBuilds;
    }
}
