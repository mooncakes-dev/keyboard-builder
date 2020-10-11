package com.keyboardbuilder.enterprise.service;

import com.keyboardbuilder.enterprise.dto.KeyboardBuild;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class KeyBoardBuildStub implements IKeyboardBuildService{

    List<KeyboardBuild> allKeyboardBuild = new ArrayList<>();

    @Override
    public List<KeyboardBuild> fetchAll() {
        return allKeyboardBuild;
    }
}
