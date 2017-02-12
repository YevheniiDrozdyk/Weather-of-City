package com.indev.weatherofcity.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Entity of wind.
 *
 * @author E.Drozyk
 * @version 1.0 1 Nov 2016
 */
public class Wind implements Serializable {

    @SerializedName("speed")
    private double mSpeed;

    public int getSpeed() {
        return (int) mSpeed;
    }
}
