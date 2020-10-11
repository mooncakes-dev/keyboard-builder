package com.keyboardbuilder.enterprise.service;

import com.keyboardbuilder.enterprise.dto.KeyboardBuild;

import java.util.List;

public interface IKeyboardBuildService {

    /**
     * Keyboard Build Service handles business logic for Keyboard Build DTOs.
     */

    List<KeyboardBuild> fetchAll();
}

