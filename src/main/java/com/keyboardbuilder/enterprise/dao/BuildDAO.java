package com.keyboardbuilder.enterprise.dao;

import com.keyboardbuilder.enterprise.dto.KeyboardBuild;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

public class BuildDAO implements iBuildDAO {

    @Override
    public List<KeyboardBuild> fetchBuilds(String combinedName) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();
        iBuildRetrofitDAO buildRetrofitDAO = retrofitInstance.create(iBuildRetrofitDAO.class);
        Call<List<KeyboardBuild>> allBuilds = buildRetrofitDAO.getBuild(combinedName);
        Response<List<KeyboardBuild>> execute = allBuilds.execute();
        List<KeyboardBuild> builds = execute.body();
        return builds;
    }
}
