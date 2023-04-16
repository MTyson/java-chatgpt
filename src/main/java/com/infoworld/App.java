package com.infoworld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        // Set ChatGPT endpoint and API key
        String endpoint = "https://api.openai.com/v1/chat/completions";
	//String endpoint = "https://api.openai.com/v1/engines/davinci/completions";
        String apiKey = "<API-KEY>";
        
        // Prompt user for input string
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your message: ");
            String input = reader.readLine();
            
            // Send input to ChatGPT API and display response
            String response = ChatBot.sendQuery(input, endpoint, apiKey);
            LOGGER.info("Response: {}", response);
        } catch (IOException e) {
            LOGGER.error("Error reading input: {}", e.getMessage());
        } catch (JSONException e) {
            LOGGER.error("Error parsing API response: {}", e.getMessage());
        } catch (Exception e) {
            LOGGER.error("Unexpected error: {}", e.getMessage());
        }
    }
}


/*
package com.infoworld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONException;


public class App 
{
    public static void main( String[] args ) throws IOException, JSONException
    {
        System.out.println( "Hello World!" );

	 // Set ChatGPT endpoint and API key
        String endpoint = "https://api.openai.com/v1/engines/davinci-codex/completions";
        String apiKey = "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";

        // Prompt user for input string
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your message: ");
        String input = reader.readLine();

        // Send input to ChatGPT API and display response
        String response = ChatBot.sendQuery(input, endpoint, apiKey);
        System.out.println("Response: " + response);

    }
}
*/
