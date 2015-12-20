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
"data"
<<<<<<< HEAD
<<<<<<< HEAD
})*/
public class Example {

=======
=======
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
})
public class Example {

@JsonProperty("data")
<<<<<<< HEAD
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
private Data data;

/**
* 
* @return
* The data
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("data")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("data")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public Data getData() {
return data;
}

/**
* 
* @param data
* The data
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("data")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("data")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setData(Data data) {
this.data = data;
}

}