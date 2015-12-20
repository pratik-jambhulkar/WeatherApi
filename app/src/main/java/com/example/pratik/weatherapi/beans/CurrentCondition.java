package com.example.pratik.weatherapi.beans;

import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD
<<<<<<< HEAD

/*@JsonInclude(JsonInclude.Include.NON_NULL)
=======
=======
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
<<<<<<< HEAD
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"cloudcover",
"FeelsLikeC",
"FeelsLikeF",
"humidity",
"observation_time",
"precipMM",
"pressure",
"temp_C",
"temp_F",
"visibility",
"weatherCode",
"weatherDesc",
"weatherIconUrl",
"winddir16Point",
"winddirDegree",
"windspeedKmph",
"windspeedMiles"
<<<<<<< HEAD
<<<<<<< HEAD
})*/
public class CurrentCondition {

private String cloudcover;
private String FeelsLikeC;
private String FeelsLikeF;
private String humidity;
private String observationTime;
private String precipMM;
private String pressure;
private String tempC;
private String tempF;
private String visibility;
private String weatherCode;
private List<WeatherDesc> weatherDesc = new ArrayList<WeatherDesc>();
private List<WeatherIconUrl> weatherIconUrl = new ArrayList<WeatherIconUrl>();
private String winddir16Point;
private String winddirDegree;
private String windspeedKmph;
=======
=======
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
})
public class CurrentCondition {

@JsonProperty("cloudcover")
private String cloudcover;
@JsonProperty("FeelsLikeC")
private String FeelsLikeC;
@JsonProperty("FeelsLikeF")
private String FeelsLikeF;
@JsonProperty("humidity")
private String humidity;
@JsonProperty("observation_time")
private String observationTime;
@JsonProperty("precipMM")
private String precipMM;
@JsonProperty("pressure")
private String pressure;
@JsonProperty("temp_C")
private String tempC;
@JsonProperty("temp_F")
private String tempF;
@JsonProperty("visibility")
private String visibility;
@JsonProperty("weatherCode")
private String weatherCode;
@JsonProperty("weatherDesc")
private List<WeatherDesc> weatherDesc = new ArrayList<WeatherDesc>();
@JsonProperty("weatherIconUrl")
private List<WeatherIconUrl> weatherIconUrl = new ArrayList<WeatherIconUrl>();
@JsonProperty("winddir16Point")
private String winddir16Point;
@JsonProperty("winddirDegree")
private String winddirDegree;
@JsonProperty("windspeedKmph")
private String windspeedKmph;
@JsonProperty("windspeedMiles")
<<<<<<< HEAD
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
private String windspeedMiles;

/**
* 
* @return
* The cloudcover
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("cloudcover")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("cloudcover")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getCloudcover() {
return cloudcover;
}

/**
* 
* @param cloudcover
* The cloudcover
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("cloudcover")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("cloudcover")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setCloudcover(String cloudcover) {
this.cloudcover = cloudcover;
}

/**
* 
* @return
* The FeelsLikeC
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("FeelsLikeC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("FeelsLikeC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getFeelsLikeC() {
return FeelsLikeC;
}

/**
* 
* @param FeelsLikeC
* The FeelsLikeC
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("FeelsLikeC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("FeelsLikeC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setFeelsLikeC(String FeelsLikeC) {
this.FeelsLikeC = FeelsLikeC;
}

/**
* 
* @return
* The FeelsLikeF
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("FeelsLikeF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("FeelsLikeF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getFeelsLikeF() {
return FeelsLikeF;
}

/**
* 
* @param FeelsLikeF
* The FeelsLikeF
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("FeelsLikeF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("FeelsLikeF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setFeelsLikeF(String FeelsLikeF) {
this.FeelsLikeF = FeelsLikeF;
}

/**
* 
* @return
* The humidity
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("humidity")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("humidity")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getHumidity() {
return humidity;
}

/**
* 
* @param humidity
* The humidity
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("humidity")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("humidity")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setHumidity(String humidity) {
this.humidity = humidity;
}

/**
* 
* @return
* The observationTime
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("observation_time")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("observation_time")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getObservationTime() {
return observationTime;
}

/**
* 
* @param observationTime
* The observation_time
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("observation_time")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("observation_time")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setObservationTime(String observationTime) {
this.observationTime = observationTime;
}

/**
* 
* @return
* The precipMM
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("precipMM")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("precipMM")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getPrecipMM() {
return precipMM;
}

/**
* 
* @param precipMM
* The precipMM
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("precipMM")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("precipMM")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setPrecipMM(String precipMM) {
this.precipMM = precipMM;
}

/**
* 
* @return
* The pressure
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("pressure")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("pressure")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getPressure() {
return pressure;
}

/**
* 
* @param pressure
* The pressure
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("pressure")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("pressure")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setPressure(String pressure) {
this.pressure = pressure;
}

/**
* 
* @return
* The tempC
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("temp_C")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("temp_C")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getTempC() {
return tempC;
}

/**
* 
* @param tempC
* The temp_C
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("temp_C")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("temp_C")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setTempC(String tempC) {
this.tempC = tempC;
}

/**
* 
* @return
* The tempF
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("temp_F")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("temp_F")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getTempF() {
return tempF;
}

/**
* 
* @param tempF
* The temp_F
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("temp_F")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("temp_F")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setTempF(String tempF) {
this.tempF = tempF;
}

/**
* 
* @return
* The visibility
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("visibility")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("visibility")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getVisibility() {
return visibility;
}

/**
* 
* @param visibility
* The visibility
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("visibility")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("visibility")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setVisibility(String visibility) {
this.visibility = visibility;
}

/**
* 
* @return
* The weatherCode
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("weatherCode")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("weatherCode")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getWeatherCode() {
return weatherCode;
}

/**
* 
* @param weatherCode
* The weatherCode
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("weatherCode")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("weatherCode")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setWeatherCode(String weatherCode) {
this.weatherCode = weatherCode;
}

/**
* 
* @return
* The weatherDesc
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("weatherDesc")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("weatherDesc")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public List<WeatherDesc> getWeatherDesc() {
return weatherDesc;
}

/**
* 
* @param weatherDesc
* The weatherDesc
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("weatherDesc")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("weatherDesc")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setWeatherDesc(List<WeatherDesc> weatherDesc) {
this.weatherDesc = weatherDesc;
}

/**
* 
* @return
* The weatherIconUrl
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("weatherIconUrl")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("weatherIconUrl")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public List<WeatherIconUrl> getWeatherIconUrl() {
return weatherIconUrl;
}

/**
* 
* @param weatherIconUrl
* The weatherIconUrl
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("weatherIconUrl")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("weatherIconUrl")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setWeatherIconUrl(List<WeatherIconUrl> weatherIconUrl) {
this.weatherIconUrl = weatherIconUrl;
}

/**
* 
* @return
* The winddir16Point
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("winddir16Point")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("winddir16Point")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getWinddir16Point() {
return winddir16Point;
}

/**
* 
* @param winddir16Point
* The winddir16Point
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("winddir16Point")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("winddir16Point")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setWinddir16Point(String winddir16Point) {
this.winddir16Point = winddir16Point;
}

/**
* 
* @return
* The winddirDegree
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("winddirDegree")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("winddirDegree")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getWinddirDegree() {
return winddirDegree;
}

/**
* 
* @param winddirDegree
* The winddirDegree
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("winddirDegree")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("winddirDegree")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setWinddirDegree(String winddirDegree) {
this.winddirDegree = winddirDegree;
}

/**
* 
* @return
* The windspeedKmph
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("windspeedKmph")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("windspeedKmph")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getWindspeedKmph() {
return windspeedKmph;
}

/**
* 
* @param windspeedKmph
* The windspeedKmph
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("windspeedKmph")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("windspeedKmph")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setWindspeedKmph(String windspeedKmph) {
this.windspeedKmph = windspeedKmph;
}

/**
* 
* @return
* The windspeedMiles
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("windspeedMiles")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("windspeedMiles")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getWindspeedMiles() {
return windspeedMiles;
}

/**
* 
* @param windspeedMiles
* The windspeedMiles
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("windspeedMiles")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("windspeedMiles")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setWindspeedMiles(String windspeedMiles) {
this.windspeedMiles = windspeedMiles;
}

}