
package com.example.pratik.weatherapi.beans;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Data implements Serializable{

    @SerializedName("current_condition")
    private List<CurrentCondition> currentCondition = new ArrayList<CurrentCondition>();
    @SerializedName("request")
    private List<Request> request = new ArrayList<Request>();
    @SerializedName("weather")
    private List<Weather> weather = new ArrayList<Weather>();

    /**
     * 
     * @return
     *     The currentCondition
     */
    public List<CurrentCondition> getCurrentCondition() {
        return currentCondition;
    }

    /**
     * 
     * @param currentCondition
     *     The current_condition
     */
    public void setCurrentCondition(List<CurrentCondition> currentCondition) {
        this.currentCondition = currentCondition;
    }

    /**
     * 
     * @return
     *     The request
     */
    public List<Request> getRequest() {
        return request;
    }

    /**
     * 
     * @param request
     *     The request
     */
    public void setRequest(List<Request> request) {
        this.request = request;
    }

    /**
     * 
     * @return
     *     The weather
     */
    public List<Weather> getWeather() {
        return weather;
    }

    /**
     * 
     * @param weather
     *     The weather
     */
    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

}
