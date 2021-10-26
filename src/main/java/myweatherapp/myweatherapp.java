package myweatherapp;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class myweatherapp {
    public static void main(String args[]) throws IOException {
        String result = "";
        int code = 200;
        String url = "http://api.openweathermap.org/data/2.5/forecast?id=524901&appid=5e59ae249191fd373fd560bd413134da";
        try {
            URL siteURL = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) siteURL.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(3000);
            connection.connect();

            code = connection.getResponseCode();
            if (code == 200) {
                result = "SERVICE UP";
            } else {
                result = "SERVICE DOWN";
            }
        } catch (Exception e) {
            result = "Exception: " + e.getMessage();

        }
        System.out.println("\nStatus: " + result);
    }
}
