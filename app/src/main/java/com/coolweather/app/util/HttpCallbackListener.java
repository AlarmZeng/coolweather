package com.coolweather.app.util;

/**
 * Created by hunter_zeng on 2016/4/12.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
