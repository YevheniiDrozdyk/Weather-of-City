package com.indev.weatherofcity.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Main implements Serializable {

    @SerializedName("temp")
    private double mTemperature;

    @SerializedName("pressure")
    private double mPressure;

    @SerializedName("humidity")
    private double mHumidity;

    public int getTemperature() {
        return (int) mTemperature;
    }

    public int getPressure() {
        return (int) mPressure;
    }

    public int getHumidity() {
        return (int) mHumidity;
    }
}
