package com.keyboardbuilder.enterprise.dao;

import com.keyboardbuilder.enterprise.dto.KeyboardBuild;

import java.io.IOException;
import java.util.List;

public interface iBuildDAO {

    List<KeyboardBuild> fetchBuilds(String combinedName) throws IOException;
}
