package com.scaler.http;
import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Client {
     OkHttpClient okHttpClient;
     // constructor
    public Client (){
        okHttpClient = new OkHttpClient();
    }

    public String getResponse (String url){
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = okHttpClient.newCall(request).execute()) {
            return response.body().string();
        } catch (IOException e) {
            System.out.println("There is an Exception");
            return null;
        }
    }
}
