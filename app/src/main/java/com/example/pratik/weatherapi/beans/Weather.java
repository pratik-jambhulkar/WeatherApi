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
"astronomy",
"date",
"hourly",
"maxtempC",
"maxtempF",
"mintempC",
"mintempF",
"uvIndex"
<<<<<<< HEAD
<<<<<<< HEAD
})*/
public class Weather {

private List<Astronomy> astronomy = new ArrayList<Astronomy>();
private String date;
private List<Hourly> hourly = new ArrayList<Hourly>();
private String maxtempC;
private String maxtempF;
private String mintempC;
private String mintempF;
=======
=======
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
})
public class Weather {

@JsonProperty("astronomy")
private List<Astronomy> astronomy = new ArrayList<Astronomy>();
@JsonProperty("date")
private String date;
@JsonProperty("hourly")
private List<Hourly> hourly = new ArrayList<Hourly>();
@JsonProperty("maxtempC")
private String maxtempC;
@JsonProperty("maxtempF")
private String maxtempF;
@JsonProperty("mintempC")
private String mintempC;
@JsonProperty("mintempF")
private String mintempF;
@JsonProperty("uvIndex")
<<<<<<< HEAD
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
private String uvIndex;

/**
* 
* @return
* The astronomy
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("astronomy")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("astronomy")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public List<Astronomy> getAstronomy() {
return astronomy;
}

/**
* 
* @param astronomy
* The astronomy
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("astronomy")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("astronomy")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setAstronomy(List<Astronomy> astronomy) {
this.astronomy = astronomy;
}

/**
* 
* @return
* The date
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("date")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("date")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getDate() {
return date;
}

/**
* 
* @param date
* The date
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("date")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("date")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setDate(String date) {
this.date = date;
}

/**
* 
* @return
* The hourly
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("hourly")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("hourly")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public List<Hourly> getHourly() {
return hourly;
}

/**
* 
* @param hourly
* The hourly
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("hourly")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("hourly")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setHourly(List<Hourly> hourly) {
this.hourly = hourly;
}

/**
* 
* @return
* The maxtempC
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("maxtempC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("maxtempC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getMaxtempC() {
return maxtempC;
}

/**
* 
* @param maxtempC
* The maxtempC
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("maxtempC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("maxtempC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setMaxtempC(String maxtempC) {
this.maxtempC = maxtempC;
}

/**
* 
* @return
* The maxtempF
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("maxtempF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("maxtempF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getMaxtempF() {
return maxtempF;
}

/**
* 
* @param maxtempF
* The maxtempF
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("maxtempF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("maxtempF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setMaxtempF(String maxtempF) {
this.maxtempF = maxtempF;
}

/**
* 
* @return
* The mintempC
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("mintempC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("mintempC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getMintempC() {
return mintempC;
}

/**
* 
* @param mintempC
* The mintempC
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("mintempC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("mintempC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setMintempC(String mintempC) {
this.mintempC = mintempC;
}

/**
* 
* @return
* The mintempF
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("mintempF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("mintempF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getMintempF() {
return mintempF;
}

/**
* 
* @param mintempF
* The mintempF
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("mintempF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("mintempF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setMintempF(String mintempF) {
this.mintempF = mintempF;
}

/**
* 
* @return
* The uvIndex
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("uvIndex")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("uvIndex")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getUvIndex() {
return uvIndex;
}

/**
* 
* @param uvIndex
* The uvIndex
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("uvIndex")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("uvIndex")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setUvIndex(String uvIndex) {
this.uvIndex = uvIndex;
}

}