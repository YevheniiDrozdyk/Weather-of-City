package com.indev.weatherofcity.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Wind implements Serializable {

    @SerializedName("speed")
    private double mSpeed;

    public int getSpeed() {
        return (int) mSpeed;
    }
}
