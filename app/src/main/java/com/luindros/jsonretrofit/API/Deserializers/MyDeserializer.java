package com.luindros.jsonretrofit.API.Deserializers;


import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.luindros.jsonretrofit.Model.City;

import java.lang.reflect.Type;

public class MyDeserializer implements JsonDeserializer<City> {
    @Override
    public City deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
         int id=json.getAsJsonObject().get("id").getAsInt();
         String name=json.getAsJsonObject().get("name").getAsString();
         String country=json.getAsJsonObject().get("sys").getAsJsonObject().get("country").getAsString();
         int temperature =json.getAsJsonObject().get("main").getAsJsonObject().get("temp").getAsInt();
         City city=new City(id,name,country, temperature);
         return city;
    }
}
