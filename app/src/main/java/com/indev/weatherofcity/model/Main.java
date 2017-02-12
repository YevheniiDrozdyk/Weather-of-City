package com.indev.weatherofcity.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Entity of main screen.
 *
 * @author E.Drozyk
 * @version 1.0 1 Nov 2016
 */
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
