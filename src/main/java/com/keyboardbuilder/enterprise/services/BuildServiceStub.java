package com.keyboardbuilder.enterprise.services;

import com.keyboardbuilder.enterprise.dao.IBuildDAO;
import com.keyboardbuilder.enterprise.dao.IKeyboardBuildDAO;
import com.keyboardbuilder.enterprise.dto.Build;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import java.io.IOException;
import java.util.List;

public class BuildServiceStub implements IBuildService {
    @Autowired
    private IBuildDAO buildDAO;

    @Autowired
    private IKeyboardBuildDAO keyboardBuildDAO;


    @Override
    @Cacheable(value="build", key="#id")
    public Build fetchById(int id) throws Exception {
        return this.buildDAO.fetch(id);
    }

    @Override
    @CacheEvict(value="build", key="#id")
    public void delete(int id) throws Exception {
        this.buildDAO.delete(id);
    }

    @Override
    public Build save(Build build) throws Exception {
        return this.buildDAO.save(build);
    }

    @Override
    @Cacheable("builds")
    public List<Build> fetchAll() throws Exception {
        return buildDAO.fetchAll();
    }

    @Override
    public List<Build> fetchBuilds(String combinedName) throws Exception {
        return this.buildDAO.fetchBuilds(combinedName);
    }
}
