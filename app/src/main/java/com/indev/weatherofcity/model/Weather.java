package com.indev.weatherofcity.model;

import android.support.annotation.NonNull;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Entity of weather.
 *
 * @author E.Drozyk
 * @version 1.0 1 Nov 2016
 */
public class Weather implements Serializable {

    @SerializedName("main")
    private String mMain;

    @SerializedName("icon")
    private String mIcon;

    @NonNull
    public String getMain() {
        return mMain;
    }

    public void setMain(@NonNull String main) {
        mMain = main;
    }

    @NonNull
    public String getIcon() {
        return mIcon;
    }

    public void setIcon(@NonNull String icon) {
        mIcon = icon;
    }

}
