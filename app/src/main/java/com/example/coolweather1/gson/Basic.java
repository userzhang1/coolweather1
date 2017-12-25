package com.example.coolweather1.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/12/25.
 */

public class Basic {
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }
}
