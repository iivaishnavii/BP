package com.vishesh.beeppeep;


import android.content.Intent;
import android.os.AsyncTask;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private final String TAG = "bp";
    Button openMaps;
    Double latitude,longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

    }



    private class RESTTask extends AsyncTask<Void, Void, Greeting[]> {
        @Override
        protected Greeting[] doInBackground(Void... params) {
            try {
                final String url = "http://ec2-54-218-33-241.us-west-2.compute.amazonaws.com:8089/getOBDdata/acct";
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                Greeting greetings[] = restTemplate.getForObject(url, Greeting[].class);
                return greetings;
            } catch (Exception e) {
                Log.e("MainActivity", e.getMessage(), e);
            }

            return null;
        }

        @Override
        protected void onPostExecute(Greeting[] greetings) {
            TextView latitudeText = (TextView) findViewById(R.id.id_value);
            TextView longitudeText = (TextView) findViewById(R.id.content_value);
            Log.i(TAG,Double.toString(greetings[0].getLatitude()));
            latitudeText.setText(Double.toString(greetings[0].getLatitude()));
            longitudeText.setText(Double.toString(greetings[0].getLongitude()));
            latitude = greetings[0].getLatitude();
            longitude = greetings[0].getLongitude();
        }

    }

    @Override
    protected void onStart() {
        super.onStart();

        openMaps = findViewById(R.id.mapButton);
        openMaps.setOnClickListener(new View.OnClickListener(){
            public void  onClick(View args)
            {
                Intent i = new Intent(getApplicationContext(),MapsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putDouble("Latitude",latitude);
                bundle.putDouble("Longitude",longitude);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        new RESTTask().execute();
    }
}