package com.example.pratik.weatherapi.beans;

<<<<<<< HEAD
<<<<<<< HEAD

public class Astronomy {

private String moonrise;
private String moonset;
private String sunrise;
=======
=======
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"moonrise",
"moonset",
"sunrise",
"sunset"
})
public class Astronomy {

@JsonProperty("moonrise")
private String moonrise;
@JsonProperty("moonset")
private String moonset;
@JsonProperty("sunrise")
private String sunrise;
@JsonProperty("sunset")
<<<<<<< HEAD
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
private String sunset;

/**
* 
* @return
* The moonrise
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("moonrise")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("moonrise")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getMoonrise() {
return moonrise;
}

/**
* 
* @param moonrise
* The moonrise
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("moonrise")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("moonrise")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setMoonrise(String moonrise) {
this.moonrise = moonrise;
}

/**
* 
* @return
* The moonset
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("moonset")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("moonset")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getMoonset() {
return moonset;
}

/**
* 
* @param moonset
* The moonset
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("moonset")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("moonset")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setMoonset(String moonset) {
this.moonset = moonset;
}

/**
* 
* @return
* The sunrise
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("sunrise")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("sunrise")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getSunrise() {
return sunrise;
}

/**
* 
* @param sunrise
* The sunrise
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("sunrise")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("sunrise")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setSunrise(String sunrise) {
this.sunrise = sunrise;
}

/**
* 
* @return
* The sunset
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("sunset")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("sunset")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getSunset() {
return sunset;
}

/**
* 
* @param sunset
* The sunset
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("sunset")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("sunset")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setSunset(String sunset) {
this.sunset = sunset;
}

}