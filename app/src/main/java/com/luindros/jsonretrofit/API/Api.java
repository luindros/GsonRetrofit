package com.luindros.jsonretrofit.API;

import com.google.gson.GsonBuilder;
import com.luindros.jsonretrofit.API.Deserializers.MyDeserializer;
import com.luindros.jsonretrofit.Model.City;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api  {

    public static final String BASE_URL="http://api.openweathermap.org/data/2.5/";
    private static Retrofit retrofit=null;

    public static final String APPKEY="62c44155efb775337d698e0089a05319";

    public static Retrofit getApi(){
        if(retrofit==null){
            GsonBuilder builder=new GsonBuilder();
            builder.registerTypeAdapter(City.class, new MyDeserializer());
            retrofit=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(builder.create()))
                    .build();
        }
        return retrofit;
    }

}
