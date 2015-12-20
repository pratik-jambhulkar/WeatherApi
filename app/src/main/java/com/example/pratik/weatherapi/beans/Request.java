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
"query",
"type"
<<<<<<< HEAD
<<<<<<< HEAD
})*/
public class Request {

private String query;
=======
=======
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
})
public class Request {

@JsonProperty("query")
private String query;
@JsonProperty("type")
<<<<<<< HEAD
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
private String type;

/**
* 
* @return
* The query
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("query")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("query")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getQuery() {
return query;
}

/**
* 
* @param query
* The query
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("query")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("query")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setQuery(String query) {
this.query = query;
}

/**
* 
* @return
* The type
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("type")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("type")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public String getType() {
return type;
}

/**
* 
* @param type
* The type
*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
@JsonProperty("type")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
=======
@JsonProperty("type")
>>>>>>> 64e255de90c52912ec0d7022132ff73b3d49286a
public void setType(String type) {
this.type = type;
}

}