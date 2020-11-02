package com.keyboardbuilder.enterprise.services;

import com.keyboardbuilder.enterprise.dao.IBuildDAO;
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
    private IKeyboardBuidDAO keyboardBuildDAO;


    public BuildService() {

    }

    public BuildService(IBuildDAO buildDAO) {

        this.buildDAO = buildDAO;
    }


    @Override
    @Cacheable(value="build", key="#id")
    public Build fetchById(int id) {
        Build foundBuild = buildDAO.fetch(id);
        return foundBuild;
    }

    @Override
    @CacheEvict(value="build", key="#id")
    public void delete(int id) throws Exception {
        buildDAO.delete(id);
    }

    @Override
    public Build save(Build build) throws Exception {
        return buildDAO.save(build);
    }

    @Override
    @Cacheable("builds")
    public List<Build> fetchAll() {
        return buildDAO.fetchAll();
    }

    @Override
    @Cacheable("keyboardBuilds")
    public List<Build> fetchKeyboardBuilds(String combinedName) throws IOException {
        return keyboardBuildDAO.fetchKeyboardBuilds(combinedName);
    }

    @Override
    public List<Build> fetchBuildByKeyboardBuildId(int keyboardBuildId) {
        return buildDAO.fetchBuildByKeyboardBuildId(keyboardBuildId);
    }
}
