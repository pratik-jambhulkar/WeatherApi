
package com.example.pratik.weatherapi.beans;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class WeatherDesc implements Serializable{

    @SerializedName("value")
    private String value;

    /**
     * 
     * @return
     *     The value
     */
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    public void setValue(String value) {
        this.value = value;
    }

}
