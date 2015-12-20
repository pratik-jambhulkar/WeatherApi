package com.example.pratik.weatherapi.beans;

import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD
<<<<<<< HEAD
/*import javax.annotation.Generated;
=======
import javax.annotation.Generated;
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
import javax.annotation.Generated;
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"current_condition",
"request",
"weather"
<<<<<<< HEAD
<<<<<<< HEAD
})*/
public class Data {

private List<CurrentCondition> currentCondition = new ArrayList<CurrentCondition>();
private List<Request> request = new ArrayList<Request>();
=======
=======
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
})
public class Data {

@JsonProperty("current_condition")
private List<CurrentCondition> currentCondition = new ArrayList<CurrentCondition>();
@JsonProperty("request")
private List<Request> request = new ArrayList<Request>();
@JsonProperty("weather")
<<<<<<< HEAD
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
private List<Weather> weather = new ArrayList<Weather>();

/**
* 
* @return
* The currentCondition
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("current_condition")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("current_condition")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public List<CurrentCondition> getCurrentCondition() {
return currentCondition;
}

/**
* 
* @param currentCondition
* The current_condition
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("current_condition")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("current_condition")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setCurrentCondition(List<CurrentCondition> currentCondition) {
this.currentCondition = currentCondition;
}

/**
* 
* @return
* The request
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("request")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("request")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public List<Request> getRequest() {
return request;
}

/**
* 
* @param request
* The request
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("request")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("request")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setRequest(List<Request> request) {
this.request = request;
}

/**
* 
* @return
* The weather
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("weather")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("weather")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public List<Weather> getWeather() {
return weather;
}

/**
* 
* @param weather
* The weather
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("weather")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("weather")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setWeather(List<Weather> weather) {
this.weather = weather;
}

}