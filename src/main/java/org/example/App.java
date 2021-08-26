/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Turner
 */
package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App
{
    public static void main( String[] args )
            throws IOException
    {
        System.out.println("What is your quote? ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String quote = reader.readLine();

        System.out.println("Who said it? ");
        BufferedReader auth = new BufferedReader(new InputStreamReader(System.in));
        String author = auth.readLine();

        System.out.println(author + " says, " + "\""+quote+ "\"");
    }
}
