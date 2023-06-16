package org.geekster;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        String urlString = "https://api.zippopotam.us/us/33162";
        URL url = null;
        HttpURLConnection connection = null;

        // Creating a URL
        try {
            url = new URL(urlString);
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL");
        }

        // Connection
        try{
            connection = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            System.out.println("Connection cannot be made");
        }


        // creating a responseCode
        int responseCode = 0;
        try {
            responseCode = connection.getResponseCode();
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }

        // Extraction of information from the connection object

        StringBuilder apiData = new StringBuilder();
        if(responseCode == 200){
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String readLine = null;

                while((readLine = in.readLine()) != null){
                    apiData.append(readLine);
                }
                in.close();
            } catch (IOException e) {
                System.out.println("404 error");
            }

            JSONObject jsonAPIResponse = new JSONObject(apiData.toString());

            System.out.println(apiData);
            System.out.println(apiData.toString());
            System.out.println(jsonAPIResponse);
            System.out.println(jsonAPIResponse.get("post code"));
            System.out.println(jsonAPIResponse.get("country"));
            System.out.println(jsonAPIResponse.get("country abbreviation"));
            System.out.println(jsonAPIResponse.get("places"));

        }
        else
            System.out.println("API call could not be made");

    }
}