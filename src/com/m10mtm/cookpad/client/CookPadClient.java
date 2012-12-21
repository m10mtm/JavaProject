package com.m10mtm.cookpad.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: mio
 * Date: 12/12/18
 * Time: 0:10
 * クックパッドのクライアント
 */
public class CookPadClient {

    public static final String BASE_URL = "http://cookpad.com/";
    public static final String SLASH = "/";

    public CookPadClient() {

    }

    // TODO: request

    // TODO: parse

    // TODO: save

    public static void main(String[] args) {
        String urlstr = "http://cookpad.com/%E3%83%AC%E3%82%B7%E3%83%94/%E9%9B%91%E7%82%8A";
        try {
            URL url = new URL(urlstr);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    con.getInputStream(), "utf-8"));
            String line;
            StringBuffer str = new StringBuffer();
            ArrayList<String> details = new ArrayList<String>();
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                str.append(line);
            }


        } catch (MalformedURLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }
}
