package com.example.pratik.weatherapi;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class MainActivity extends ActionBarActivity {

    Button btnShowLocation;

    // GPSTracker class
    GPSTracker gps;
    double latitude, longitude;
    String maxtempC, mintempC;
    TextView mintemp, maxtemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mintemp = (TextView) findViewById(R.id.minTemp);
        maxtemp = (TextView) findViewById(R.id.maxTemp);


        btnShowLocation = (Button) findViewById(R.id.btnShowLocation);

        // show location button click event
        btnShowLocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // create class object
                gps = new GPSTracker(MainActivity.this);

                if (gps.canGetLocation()) {

                    latitude = gps.getLatitude();
                    longitude = gps.getLongitude();

                    new SimpleAsyncTask().execute("http://api.worldweatheronline.com/free/v2/weather.ashx?key=0bf2cda0e05a26112e2aad3a46670&q=18.48,73.90&num_of_days=1&tp=24&format=json");

                    // \n is for new line

                    // check if GPS enabled
                    if (gps.canGetLocation()) {

                        double latitude = gps.getLatitude();
                        double longitude = gps.getLongitude();

                        // \n is for new line
                        Toast.makeText(getApplicationContext(), "Your Location is - \nLat: " + latitude + "\nLong: " + longitude, Toast.LENGTH_LONG).show();

                    } else {
                        // can't get location
                        // GPS or Network is not enabled
                        // Ask user to enable GPS/network in settings
                        gps.showSettingsAlert();
                    }

                    // check if GPS enabled

                }
            }
        });

//        test
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private class SimpleAsyncTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... urls) {

            String status = POST(urls[0]);
            parseJson(status);
            return status;
        }


        private void parseJson(String status) {
            // TODO Auto-generated method stub
            String resultJson = null;
            JSONObject result = null;
            try {
                JSONObject jsonObj = new JSONObject(status);
                resultJson = jsonObj.getString("data");
                result = jsonObj.getJSONObject("data");
                JSONArray weather = result.getJSONArray("weather");
                JSONObject temp = weather.getJSONObject(0);
                mintempC = temp.getString("mintempC");
                maxtempC = temp.getString("maxtempC");

            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

        // onPostExecute displays the results of the AsyncTask.
        @Override
        protected void onPostExecute(String result) {
//            Toast.makeText(MainActivity.this,result,Toast.LENGTH_SHORT).show();
            mintemp.setText(mintempC);
            maxtemp.setText(maxtempC);
        }

    }

    public static String POST(String url){

        InputStream inputStream = null;
        String result = "";

        try {

            // 1. create HttpClient
            HttpClient httpclient = new DefaultHttpClient();

            // 2. make POST request to the given URL
            HttpPost httpPost = new HttpPost(url);

            /*String json = "";

            // 3. build jsonObject
            JSONObject jsonObject = new JSONObject();
            jsonObject.accumulate("")

            // 4. convert JSONObject to JSON to String
            json = jsonObject.toString();

            // ** Alternative way to convert Person object to JSON string usin Jackson Lib
            // ObjectMapper mapper = new ObjectMapper();
            // json = mapper.writeValueAsString(person);

            // 5. set json to StringEntity
            StringEntity se = new StringEntity();

            // 6. set httpPost Entity
            httpPost.setEntity(se);*/

            // 7. Set some headers to inform server about the type of the content
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-type", "application/json");

            // 8. Execute POST request to the given URL
            HttpResponse httpResponse = httpclient.execute(httpPost);

            // 9. receive response as inputStream
            inputStream = httpResponse.getEntity().getContent();

            // 10. convert inputstream to string
            if(inputStream != null)
                result = convertInputStreamToString(inputStream);
            else
                result = "Did not work!";

            System.out.println(result);

        } catch (Exception e) {

            Log.d("InputStream", e.getLocalizedMessage());
            Log.e("result", result);
        }

        // 11. return result
        return result;

    }

    private static String convertInputStreamToString(InputStream inputStream) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(inputStream));
        String line = "";
        String result = "";
        while((line = bufferedReader.readLine()) != null)
            result += line;

        inputStream.close();
        return result;
    }

//    0bf2cda0e05a26112e2aad3a46670 weather api key
}


//url http://api.worldweatheronline.com/free/v2/weather.ashx?key=0bf2cda0e05a26112e2aad3a46670&q=18.48,73.90&num_of_days=1&tp=24&format=json


/*
{
  "data": {
    "current_condition": [
      {
        "cloudcover": "0",
        "FeelsLikeC": "29",
        "FeelsLikeF": "84",
        "humidity": "52",
        "observation_time": "06:40 AM",
        "precipMM": "0.0",
        "pressure": "1015",
        "temp_C": "28",
        "temp_F": "82",
        "visibility": "10",
        "weatherCode": "113",
        "weatherDesc": [
          {
            "value": "Sunny"
          }
        ],
        "weatherIconUrl": [
          {
            "value": "http://cdn.worldweatheronline.net/images/wsymbols01_png_64/wsymbol_0001_sunny.png"
          }
        ],
        "winddir16Point": "SE",
        "winddirDegree": "143",
        "windspeedKmph": "2",
        "windspeedMiles": "1"
      }
    ],
    "request": [
      {
        "query": "Lat 18.48 and Lon 73.90",
        "type": "LatLon"
      }
    ],
    "weather": [
      {
        "astronomy": [
          {
            "moonrise": "01:52 PM",
            "moonset": "01:38 AM",
            "sunrise": "07:01 AM",
            "sunset": "06:02 PM"
          }
        ],
        "date": "2015-12-20",
        "hourly": [
          {
            "chanceoffog": "0",
            "chanceoffrost": "0",
            "chanceofhightemp": "97",
            "chanceofovercast": "0",
            "chanceofrain": "0",
            "chanceofremdry": "0",
            "chanceofsnow": "0",
            "chanceofsunshine": "96",
            "chanceofthunder": "0",
            "chanceofwindy": "0",
            "cloudcover": "7",
            "DewPointC": "14",
            "DewPointF": "58",
            "FeelsLikeC": "33",
            "FeelsLikeF": "92",
            "HeatIndexC": "33",
            "HeatIndexF": "92",
            "humidity": "32",
            "precipMM": "0.0",
            "pressure": "1017",
            "tempC": "34",
            "tempF": "93",
            "time": "24",
            "visibility": "10",
            "weatherCode": "113",
            "weatherDesc": [
              {
                "value": "Sunny"
              }
            ],
            "weatherIconUrl": [
              {
                "value": "http://cdn.worldweatheronline.net/images/wsymbols01_png_64/wsymbol_0001_sunny.png"
              }
            ],
            "WindChillC": "33",
            "WindChillF": "92",
            "winddir16Point": "SE",
            "winddirDegree": "143",
            "WindGustKmph": "2",
            "WindGustMiles": "1",
            "windspeedKmph": "11",
            "windspeedMiles": "7"
          }
        ],
        "maxtempC": "34",
        "maxtempF": "93",
        "mintempC": "18",
        "mintempF": "64",
        "uvIndex": "7"
      }
    ]
  }
}
 */