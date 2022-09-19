package com.client;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;

public class Client2 {
    public static void main(String[] args) throws Exception {
        TrustManager[] tm = {
                new X509TrustManager() {
                    public X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }

                    public void checkClientTrusted(X509Certificate[] xc, String type) {
                    }

                    public void checkServerTrusted(X509Certificate[] xc,String type) {
                    }
                }
        };

        SSLContext ctx = SSLContext.getInstance("SSL");
        ctx.init(null, tm, new SecureRandom());

        URL url = new URL("https://simultechnology.com");
        HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
        conn.setDoOutput(true);
        conn.setSSLSocketFactory(ctx.getSocketFactory());


        System.out.println(conn.getResponseCode());
    }
}
