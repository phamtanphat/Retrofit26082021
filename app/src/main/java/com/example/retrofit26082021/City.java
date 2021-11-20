package com.example.retrofit26082021;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class City {
    private String title;
    @SerializedName("location_type")
    private String locationType;
    private int woeid;
    @SerializedName("latt_long")
    private String latLong;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public int getWoeid() {
        return woeid;
    }

    public void setWoeid(int woeid) {
        this.woeid = woeid;
    }

    public String getLatLong() {
        return latLong;
    }

    public void setLatLong(String latLong) {
        this.latLong = latLong;
    }
}
