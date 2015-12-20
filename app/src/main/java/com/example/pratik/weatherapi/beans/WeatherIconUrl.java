package com.example.pratik.weatherapi.beans;

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
"value"
<<<<<<< HEAD
<<<<<<< HEAD
})*/
public class WeatherIconUrl {

/*@JsonProperty("value")
private String value;

*//**
* 
* @return
* The value
*//*
=======
=======
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
})
public class WeatherIconUrl {

@JsonProperty("value")
private String value;

/**
* 
* @return
* The value
*/
<<<<<<< HEAD
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
@JsonProperty("value")
public String getValue() {
return value;
}

<<<<<<< HEAD
<<<<<<< HEAD
*//**
* 
* @param value
* The value
*//*
@JsonProperty("value")
public void setValue(String value) {
this.value = value;
}*/
=======
=======
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
/**
* 
* @param value
* The value
*/
@JsonProperty("value")
public void setValue(String value) {
this.value = value;
}
<<<<<<< HEAD
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a

}