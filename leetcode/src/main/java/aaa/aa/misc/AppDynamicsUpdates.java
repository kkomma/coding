package aaa.aa.misc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class AppDynamicsUpdates {
    public static void main(String[] args) throws Exception {
        URL updatesURL = new URL("https://aapmarketplace.com/buy");

        BufferedReader reader = new BufferedReader(new InputStreamReader(updatesURL.openStream()));
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        System.out.println("done");
        reader.close();
    }
}