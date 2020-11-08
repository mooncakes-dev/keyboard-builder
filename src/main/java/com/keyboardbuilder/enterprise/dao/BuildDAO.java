package com.keyboardbuilder.enterprise.dao;

import com.keyboardbuilder.enterprise.dto.Build;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

public class BuildDAO implements IBuildDAO {

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
        return null;
    }

    @Override
    public Build save(Build build) {
        return null;
    }

    @Override
    public Build fetch(int id) throws Exception {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
