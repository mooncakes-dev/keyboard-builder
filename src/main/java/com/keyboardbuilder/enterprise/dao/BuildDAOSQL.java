package com.keyboardbuilder.enterprise.dao;

import com.keyboardbuilder.enterprise.dto.Build;
import org.springframework.beans.factory.annotation.Autowired;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BuildDAOSQL implements IBuildDAO {

    @Autowired
    BuildRepository buildRepository;

    @Override
    public List<Build> fetchBuilds(String combinedName) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();
        iBuildRetrofitDAO buildRetrofitDAO = retrofitInstance.create(iBuildRetrofitDAO.class);
        Call<List<Build>> allBuilds = buildRetrofitDAO.getBuild(combinedName);
        Response<List<Build>> execute = allBuilds.execute();
        List<Build> builds = execute.body();
        return builds;
    }

    @Override
    public List<Build> fetchAll() throws Exception {
        ArrayList<Build> builds = new ArrayList<>();
        for (Build b: this.buildRepository.findAll())
            builds.add(b);
        return builds;
    }

    @Override
    public Build save(Build build) {
        return this.buildRepository.save(build);
    }

    @Override
    public Build fetch(int id) throws Exception {
        return this.buildRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {
        this.buildRepository.deleteById(id);
    }
}
