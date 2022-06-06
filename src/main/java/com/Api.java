package com;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Api {
	private static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
            .url("https://www.nseindia.com/api/equity-stockIndices?index=NIFTY%2050")
            .build(); // defaults to GET

        Response response = client.newCall(request).execute();

//        APOD apod = mapper.readValue(response.body().byteStream(), APOD.class);

        System.out.println(response);

    }

}
