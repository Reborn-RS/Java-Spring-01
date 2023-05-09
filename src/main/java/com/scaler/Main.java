package com.scaler;

import com.scaler.http.Client;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome! from Rohit");
        Client client = new Client();
        String response = client.getResponse("https://www.google.com/");
        System.out.println(response);
    }
}