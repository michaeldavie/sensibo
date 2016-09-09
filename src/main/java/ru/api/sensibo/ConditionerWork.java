package ru.api.sensibo;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;


import java.util.List;

public interface ConditionerWork {

    List<String> getPods();

    JsonObject getPod(String id);

    List<JsonArray> getState(String id);

    JsonElement getMeasurment(String id);

    JsonObject changeState(JsonObject newState, String id);



}
