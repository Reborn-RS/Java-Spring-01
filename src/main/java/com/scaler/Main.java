package com.scaler;

import com.scaler.http.Client;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        switch (args[0]){
            case "http" : {
                Client client = new Client();
                String response = client.getResponse("https://www.google.com/");
                System.out.println(response);
                break;
            }
            case "greet" : {
                System.out.println("Greetings");
                break;
            }
            default: System.out.println("Invalid argument");
        }

    }
}