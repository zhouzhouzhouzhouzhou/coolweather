package com.coolweather.admin.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 佳南 on 2017/8/27.
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
