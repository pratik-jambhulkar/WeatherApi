
package com.example.pratik.weatherapi.beans;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Astronomy implements Serializable{

    @SerializedName("moonrise")
    private String moonrise;
    @SerializedName("moonset")
    private String moonset;
    @SerializedName("sunrise")
    private String sunrise;
    @SerializedName("sunset")
    private String sunset;

    /**
     * 
     * @return
     *     The moonrise
     */
    public String getMoonrise() {
        return moonrise;
    }

    /**
     * 
     * @param moonrise
     *     The moonrise
     */
    public void setMoonrise(String moonrise) {
        this.moonrise = moonrise;
    }

    /**
     * 
     * @return
     *     The moonset
     */
    public String getMoonset() {
        return moonset;
    }

    /**
     * 
     * @param moonset
     *     The moonset
     */
    public void setMoonset(String moonset) {
        this.moonset = moonset;
    }

    /**
     * 
     * @return
     *     The sunrise
     */
    public String getSunrise() {
        return sunrise;
    }

    /**
     * 
     * @param sunrise
     *     The sunrise
     */
    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    /**
     * 
     * @return
     *     The sunset
     */
    public String getSunset() {
        return sunset;
    }

    /**
     * 
     * @param sunset
     *     The sunset
     */
    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

}
