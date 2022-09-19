package com.client;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("start!");

        URL url = new URL("https://simultechnology.com");
        HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
        conn.setDoOutput(true);

        System.out.println(conn.getResponseCode());
    }
}
