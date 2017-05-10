package com.example.cailg.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by cailg on 2017/5/9.
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
