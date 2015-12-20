
package com.example.pratik.weatherapi.beans;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Weather implements Serializable{

    @SerializedName("astronomy")
    private List<Astronomy> astronomy = new ArrayList<Astronomy>();
    @SerializedName("date")
    private String date;
    @SerializedName("hourly")
    private List<Hourly> hourly = new ArrayList<Hourly>();
    @SerializedName("maxtempC")
    private String maxtempC;
    @SerializedName("maxtempF")
    private String maxtempF;
    @SerializedName("mintempC")
    private String mintempC;
    @SerializedName("mintempF")
    private String mintempF;
    @SerializedName("uvIndex")
    private String uvIndex;

    /**
     *
     * @return
     *     The astronomy
     */
    public List<Astronomy> getAstronomy() {
        return astronomy;
    }

    /**
     *
     * @param astronomy
     *     The astronomy
     */
    public void setAstronomy(List<Astronomy> astronomy) {
        this.astronomy = astronomy;
    }

    /**
     *
     * @return
     *     The date
     */
    public String getDate() {
        return date;
    }

    /**
     *
     * @param date
     *     The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     *
     * @return
     *     The hourly
     */
    public List<Hourly> getHourly() {
        return hourly;
    }

    /**
     *
     * @param hourly
     *     The hourly
     */
    public void setHourly(List<Hourly> hourly) {
        this.hourly = hourly;
    }

    /**
     *
     * @return
     *     The maxtempC
     */
    public String getMaxtempC() {
        return maxtempC;
    }

    /**
     *
     * @param maxtempC
     *     The maxtempC
     */
    public void setMaxtempC(String maxtempC) {
        this.maxtempC = maxtempC;
    }

    /**
     *
     * @return
     *     The maxtempF
     */
    public String getMaxtempF() {
        return maxtempF;
    }

    /**
     *
     * @param maxtempF
     *     The maxtempF
     */
    public void setMaxtempF(String maxtempF) {
        this.maxtempF = maxtempF;
    }

    /**
     *
     * @return
     *     The mintempC
     */
    public String getMintempC() {
        return mintempC;
    }

    /**
     *
     * @param mintempC
     *     The mintempC
     */
    public void setMintempC(String mintempC) {
        this.mintempC = mintempC;
    }

    /**
     *
     * @return
     *     The mintempF
     */
    public String getMintempF() {
        return mintempF;
    }

    /**
     *
     * @param mintempF
     *     The mintempF
     */
    public void setMintempF(String mintempF) {
        this.mintempF = mintempF;
    }

    /**
     *
     * @return
     *     The uvIndex
     */
    public String getUvIndex() {
        return uvIndex;
    }

    /**
     *
     * @param uvIndex
     *     The uvIndex
     */
    public void setUvIndex(String uvIndex) {
        this.uvIndex = uvIndex;
    }

}
