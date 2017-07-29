package com.coolweather.android.gson;

/**
 * Created by Admin on 7/29/2017.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
