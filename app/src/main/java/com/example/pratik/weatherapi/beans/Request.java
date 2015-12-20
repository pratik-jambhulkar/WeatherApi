
package com.example.pratik.weatherapi.beans;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Request implements Serializable{

    @SerializedName("query")
    private String query;
    @SerializedName("type")
    private String type;

    /**
     * 
     * @return
     *     The query
     */
    public String getQuery() {
        return query;
    }

    /**
     * 
     * @param query
     *     The query
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

}
