package com.coolweather.admin.coolweather.gson;

/**
 * Created by 佳南 on 2017/8/27.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
