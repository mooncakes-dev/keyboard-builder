package com.keyboardbuilder.enterprise.dao;

import com.keyboardbuilder.enterprise.dto.KeyboardBuild;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface iBuildRetrofitDAO {

//    need to create an end point for it to hit
    @GET("link here")
    Call<List<KeyboardBuild>> getBuild(@Query("Combined_Name") String combinedName);
}
