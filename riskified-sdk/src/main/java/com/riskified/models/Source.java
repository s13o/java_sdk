package com.riskified.models;

import com.google.gson.annotations.SerializedName;

public enum Source {

    @SerializedName("desktop_web")
    desktopWeb,
    @SerializedName("mobile_web")
    mobileWeb,
    @SerializedName("mobile_app")
    mobileApp,
    @SerializedName("other")
    other

}
