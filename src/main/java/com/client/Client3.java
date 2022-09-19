package com.client;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class Client3 {
    public static void main(String[] args) throws IOException {
        HttpClientBuilder clientBuilder = HttpClients.custom();
//        clientBuilder.
//                setSSLContext(new SSLContextBuilder().loadTrustMaterial(null, TrustAllStrategy.INSTANCE).build()).
//                setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE);
        CloseableHttpClient httpClient = clientBuilder.build();
        String url = "https://simultechnology.com";
        HttpGet httpGet = new HttpGet(url);
        HttpClientContext context = null;
        HttpResponse response = httpClient.execute(httpGet, context);
        Header[] allHeaders = response.getAllHeaders();
        for (Header h : allHeaders) {
            System.out.println(h.getName());
            System.out.println(h.getValue());
        }
    }
}
