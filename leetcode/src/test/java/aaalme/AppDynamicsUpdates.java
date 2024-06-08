package aaalme;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
        reader.close();
        // Write reader data into a file

        String filePath = "writefile.txt";
        File outputFile = new File(filePath);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        long threshold = 2L;

//        https://www.baeldung.com/reading-file-in-java
        
        // Capture custom time markers
         long startTime = System.currentTimeMillis();
         
         int secondsToSleep = 3;
         
         try {
        	    Thread.sleep(secondsToSleep * 1000);
        	} catch (InterruptedException ie) {
        	    Thread.currentThread().interrupt();
        	}
         
         
         // Code segment being analyzed for performance issues
         // ...

         long endTime = System.currentTimeMillis();
         long executionTime = endTime - startTime;
         System.out.println("executionTime::"+executionTime);
         if (executionTime > threshold) {
             logPerformanceIssue(executionTime, "processOrder");
         }

                
         
    }

	private static void logPerformanceIssue(long executionTime, String string) {
		System.out.println(String.format("%s executed for %d", string, executionTime));
		
	}
}
