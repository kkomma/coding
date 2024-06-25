package aaalme;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class RunCLICommand {
    public static void main(String[] args) {
        // Command to execute
        String command = "ls -l";

        // Use ProcessBuilder to run the command
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("bash", "-c", command);

        try {
            // Start the process
            Process process = processBuilder.start();

            // Read the output
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuilder output = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }

            // Wait for the process to complete
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("Command executed successfully:\n" + output);
            } else {
                System.err.println("Error: Command execution failed with exit code " + exitCode);
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
