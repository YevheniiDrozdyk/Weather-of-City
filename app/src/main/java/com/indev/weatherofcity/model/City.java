package com.indev.weatherofcity.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Entity of city.
 *
 * @author E.Drozyk
 * @version 1.0 1 Nov 2016
 */
public class City implements Serializable {

    @SerializedName("name")
    private String mName;

    @SerializedName("weather")
    private List<Weather> mWeathers;

    @SerializedName("main")
    private Main mMain;

    @SerializedName("wind")
    private Wind mWind;

    public City() {

    }

    @NonNull
    public String getName() {
        return mName;
    }

    public void setName(@NonNull String name) {
        mName = name;
    }

    @Nullable
    public Weather getWeather() {
        if (mWeathers == null || mWeathers.isEmpty()) {
            return null;
        }
        return mWeathers.get(0);
    }

    @Nullable
    public Main getMain() {
        return mMain;
    }

    @Nullable
    public Wind getWind() {
        return mWind;
    }
}
