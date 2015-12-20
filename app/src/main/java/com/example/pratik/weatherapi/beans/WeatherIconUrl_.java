package com.example.pratik.weatherapi.beans;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"value"
})
public class WeatherIconUrl_ {

@JsonProperty("value")
private String value;

/**
* 
* @return
* The value
*/
@JsonProperty("value")
public String getValue() {
return value;
}

/**
* 
* @param value
* The value
*/
@JsonProperty("value")
public void setValue(String value) {
this.value = value;
}

}