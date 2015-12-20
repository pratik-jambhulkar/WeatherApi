package com.example.pratik.weatherapi.beans;

import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD
<<<<<<< HEAD
/*import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder*/
/*
=======
=======
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

<<<<<<< HEAD
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"chanceoffog",
"chanceoffrost",
"chanceofhightemp",
"chanceofovercast",
"chanceofrain",
"chanceofremdry",
"chanceofsnow",
"chanceofsunshine",
"chanceofthunder",
"chanceofwindy",
"cloudcover",
"DewPointC",
"DewPointF",
"FeelsLikeC",
"FeelsLikeF",
"HeatIndexC",
"HeatIndexF",
"humidity",
"precipMM",
"pressure",
"tempC",
"tempF",
"time",
"visibility",
"weatherCode",
"weatherDesc",
"weatherIconUrl",
"WindChillC",
"WindChillF",
"winddir16Point",
"winddirDegree",
"WindGustKmph",
"WindGustMiles",
"windspeedKmph",
"windspeedMiles"
<<<<<<< HEAD
<<<<<<< HEAD
})*/
public class Hourly {

private String chanceoffog;
private String chanceoffrost;
private String chanceofhightemp;
private String chanceofovercast;
private String chanceofrain;
private String chanceofremdry;
private String chanceofsnow;
private String chanceofsunshine;
private String chanceofthunder;
private String chanceofwindy;
private String cloudcover;
private String DewPointC;
private String DewPointF;
private String FeelsLikeC;
private String FeelsLikeF;
private String HeatIndexC;
private String HeatIndexF;
private String humidity;
private String precipMM;
private String pressure;
private String tempC;
private String tempF;
private String time;
private String visibility;
private String weatherCode;
private List<WeatherDesc> weatherDesc = new ArrayList<WeatherDesc>();
private List<WeatherIconUrl> weatherIconUrl = new ArrayList<WeatherIconUrl>();
private String WindChillC;
private String WindChillF;
private String winddir16Point;
private String winddirDegree;
private String WindGustKmph;
private String WindGustMiles;
private String windspeedKmph;
=======
=======
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
})
public class Hourly {

@JsonProperty("chanceoffog")
private String chanceoffog;
@JsonProperty("chanceoffrost")
private String chanceoffrost;
@JsonProperty("chanceofhightemp")
private String chanceofhightemp;
@JsonProperty("chanceofovercast")
private String chanceofovercast;
@JsonProperty("chanceofrain")
private String chanceofrain;
@JsonProperty("chanceofremdry")
private String chanceofremdry;
@JsonProperty("chanceofsnow")
private String chanceofsnow;
@JsonProperty("chanceofsunshine")
private String chanceofsunshine;
@JsonProperty("chanceofthunder")
private String chanceofthunder;
@JsonProperty("chanceofwindy")
private String chanceofwindy;
@JsonProperty("cloudcover")
private String cloudcover;
@JsonProperty("DewPointC")
private String DewPointC;
@JsonProperty("DewPointF")
private String DewPointF;
@JsonProperty("FeelsLikeC")
private String FeelsLikeC;
@JsonProperty("FeelsLikeF")
private String FeelsLikeF;
@JsonProperty("HeatIndexC")
private String HeatIndexC;
@JsonProperty("HeatIndexF")
private String HeatIndexF;
@JsonProperty("humidity")
private String humidity;
@JsonProperty("precipMM")
private String precipMM;
@JsonProperty("pressure")
private String pressure;
@JsonProperty("tempC")
private String tempC;
@JsonProperty("tempF")
private String tempF;
@JsonProperty("time")
private String time;
@JsonProperty("visibility")
private String visibility;
@JsonProperty("weatherCode")
private String weatherCode;
@JsonProperty("weatherDesc")
private List<WeatherDesc_> weatherDesc = new ArrayList<WeatherDesc_>();
@JsonProperty("weatherIconUrl")
private List<WeatherIconUrl_> weatherIconUrl = new ArrayList<WeatherIconUrl_>();
@JsonProperty("WindChillC")
private String WindChillC;
@JsonProperty("WindChillF")
private String WindChillF;
@JsonProperty("winddir16Point")
private String winddir16Point;
@JsonProperty("winddirDegree")
private String winddirDegree;
@JsonProperty("WindGustKmph")
private String WindGustKmph;
@JsonProperty("WindGustMiles")
private String WindGustMiles;
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
* The chanceoffog
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("chanceoffog")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("chanceoffog")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getChanceoffog() {
return chanceoffog;
}

/**
* 
* @param chanceoffog
* The chanceoffog
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("chanceoffog")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("chanceoffog")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setChanceoffog(String chanceoffog) {
this.chanceoffog = chanceoffog;
}

/**
* 
* @return
* The chanceoffrost
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("chanceoffrost")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("chanceoffrost")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getChanceoffrost() {
return chanceoffrost;
}

/**
* 
* @param chanceoffrost
* The chanceoffrost
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("chanceoffrost")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("chanceoffrost")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setChanceoffrost(String chanceoffrost) {
this.chanceoffrost = chanceoffrost;
}

/**
* 
* @return
* The chanceofhightemp
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("chanceofhightemp")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("chanceofhightemp")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getChanceofhightemp() {
return chanceofhightemp;
}

/**
* 
* @param chanceofhightemp
* The chanceofhightemp
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("chanceofhightemp")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("chanceofhightemp")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setChanceofhightemp(String chanceofhightemp) {
this.chanceofhightemp = chanceofhightemp;
}

/**
* 
* @return
* The chanceofovercast
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("chanceofovercast")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("chanceofovercast")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getChanceofovercast() {
return chanceofovercast;
}

/**
* 
* @param chanceofovercast
* The chanceofovercast
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("chanceofovercast")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("chanceofovercast")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setChanceofovercast(String chanceofovercast) {
this.chanceofovercast = chanceofovercast;
}

/**
* 
* @return
* The chanceofrain
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("chanceofrain")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("chanceofrain")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getChanceofrain() {
return chanceofrain;
}

/**
* 
* @param chanceofrain
* The chanceofrain
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("chanceofrain")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("chanceofrain")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setChanceofrain(String chanceofrain) {
this.chanceofrain = chanceofrain;
}

/**
* 
* @return
* The chanceofremdry
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("chanceofremdry")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("chanceofremdry")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getChanceofremdry() {
return chanceofremdry;
}

/**
* 
* @param chanceofremdry
* The chanceofremdry
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("chanceofremdry")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("chanceofremdry")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setChanceofremdry(String chanceofremdry) {
this.chanceofremdry = chanceofremdry;
}

/**
* 
* @return
* The chanceofsnow
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("chanceofsnow")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("chanceofsnow")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getChanceofsnow() {
return chanceofsnow;
}

/**
* 
* @param chanceofsnow
* The chanceofsnow
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("chanceofsnow")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("chanceofsnow")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setChanceofsnow(String chanceofsnow) {
this.chanceofsnow = chanceofsnow;
}

/**
* 
* @return
* The chanceofsunshine
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("chanceofsunshine")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("chanceofsunshine")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getChanceofsunshine() {
return chanceofsunshine;
}

/**
* 
* @param chanceofsunshine
* The chanceofsunshine
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("chanceofsunshine")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("chanceofsunshine")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setChanceofsunshine(String chanceofsunshine) {
this.chanceofsunshine = chanceofsunshine;
}

/**
* 
* @return
* The chanceofthunder
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("chanceofthunder")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("chanceofthunder")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getChanceofthunder() {
return chanceofthunder;
}

/**
* 
* @param chanceofthunder
* The chanceofthunder
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("chanceofthunder")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("chanceofthunder")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setChanceofthunder(String chanceofthunder) {
this.chanceofthunder = chanceofthunder;
}

/**
* 
* @return
* The chanceofwindy
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("chanceofwindy")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("chanceofwindy")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getChanceofwindy() {
return chanceofwindy;
}

/**
* 
* @param chanceofwindy
* The chanceofwindy
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("chanceofwindy")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("chanceofwindy")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setChanceofwindy(String chanceofwindy) {
this.chanceofwindy = chanceofwindy;
}

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
* The DewPointC
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("DewPointC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("DewPointC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getDewPointC() {
return DewPointC;
}

/**
* 
* @param DewPointC
* The DewPointC
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("DewPointC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("DewPointC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setDewPointC(String DewPointC) {
this.DewPointC = DewPointC;
}

/**
* 
* @return
* The DewPointF
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("DewPointF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("DewPointF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getDewPointF() {
return DewPointF;
}

/**
* 
* @param DewPointF
* The DewPointF
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("DewPointF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("DewPointF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setDewPointF(String DewPointF) {
this.DewPointF = DewPointF;
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
* The HeatIndexC
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("HeatIndexC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("HeatIndexC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getHeatIndexC() {
return HeatIndexC;
}

/**
* 
* @param HeatIndexC
* The HeatIndexC
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("HeatIndexC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("HeatIndexC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setHeatIndexC(String HeatIndexC) {
this.HeatIndexC = HeatIndexC;
}

/**
* 
* @return
* The HeatIndexF
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("HeatIndexF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("HeatIndexF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getHeatIndexF() {
return HeatIndexF;
}

/**
* 
* @param HeatIndexF
* The HeatIndexF
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("HeatIndexF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("HeatIndexF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setHeatIndexF(String HeatIndexF) {
this.HeatIndexF = HeatIndexF;
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
@JsonProperty("tempC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("tempC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getTempC() {
return tempC;
}

/**
* 
* @param tempC
* The tempC
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("tempC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("tempC")
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
@JsonProperty("tempF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("tempF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getTempF() {
return tempF;
}

/**
* 
* @param tempF
* The tempF
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("tempF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("tempF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setTempF(String tempF) {
this.tempF = tempF;
}

/**
* 
* @return
* The time
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("time")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("time")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getTime() {
return time;
}

/**
* 
* @param time
* The time
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("time")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("time")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setTime(String time) {
this.time = time;
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
public List<WeatherDesc> getWeatherDesc() {
=======
@JsonProperty("weatherDesc")
public List<WeatherDesc_> getWeatherDesc() {
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("weatherDesc")
public List<WeatherDesc_> getWeatherDesc() {
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
return weatherDesc;
}

/**
* 
* @param weatherDesc
* The weatherDesc
*/
<<<<<<< HEAD
<<<<<<< HEAD
public void setWeatherDesc(List<WeatherDesc> weatherDesc) {
=======
@JsonProperty("weatherDesc")
public void setWeatherDesc(List<WeatherDesc_> weatherDesc) {
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("weatherDesc")
public void setWeatherDesc(List<WeatherDesc_> weatherDesc) {
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
this.weatherDesc = weatherDesc;
}

/**
* 
* @return
* The weatherIconUrl
*/
<<<<<<< HEAD
<<<<<<< HEAD
public List<WeatherIconUrl> getWeatherIconUrl() {
=======
@JsonProperty("weatherIconUrl")
public List<WeatherIconUrl_> getWeatherIconUrl() {
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("weatherIconUrl")
public List<WeatherIconUrl_> getWeatherIconUrl() {
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
return weatherIconUrl;
}

/**
* 
* @param weatherIconUrl
* The weatherIconUrl
*/
<<<<<<< HEAD
<<<<<<< HEAD
public void setWeatherIconUrl(List<WeatherIconUrl> weatherIconUrl) {
=======
@JsonProperty("weatherIconUrl")
public void setWeatherIconUrl(List<WeatherIconUrl_> weatherIconUrl) {
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("weatherIconUrl")
public void setWeatherIconUrl(List<WeatherIconUrl_> weatherIconUrl) {
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
this.weatherIconUrl = weatherIconUrl;
}

/**
* 
* @return
* The WindChillC
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("WindChillC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("WindChillC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getWindChillC() {
return WindChillC;
}

/**
* 
* @param WindChillC
* The WindChillC
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("WindChillC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("WindChillC")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setWindChillC(String WindChillC) {
this.WindChillC = WindChillC;
}

/**
* 
* @return
* The WindChillF
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("WindChillF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("WindChillF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getWindChillF() {
return WindChillF;
}

/**
* 
* @param WindChillF
* The WindChillF
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("WindChillF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("WindChillF")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setWindChillF(String WindChillF) {
this.WindChillF = WindChillF;
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
* The WindGustKmph
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("WindGustKmph")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("WindGustKmph")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getWindGustKmph() {
return WindGustKmph;
}

/**
* 
* @param WindGustKmph
* The WindGustKmph
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("WindGustKmph")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("WindGustKmph")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setWindGustKmph(String WindGustKmph) {
this.WindGustKmph = WindGustKmph;
}

/**
* 
* @return
* The WindGustMiles
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("WindGustMiles")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("WindGustMiles")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getWindGustMiles() {
return WindGustMiles;
}

/**
* 
* @param WindGustMiles
* The WindGustMiles
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("WindGustMiles")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("WindGustMiles")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setWindGustMiles(String WindGustMiles) {
this.WindGustMiles = WindGustMiles;
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