package com.keyboardbuilder.enterprise.dao;

import com.keyboardbuilder.enterprise.dto.Build;

import java.io.IOException;
import java.util.List;

public interface IBuildDAO {

    List<Build> fetchBuilds(String combinedName) throws IOException;
}
