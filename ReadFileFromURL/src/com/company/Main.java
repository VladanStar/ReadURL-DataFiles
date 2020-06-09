package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter a URl");
        String  urlString = new Scanner(System.in).next();
        try{
            java.net.URL url = new java.net.URL(urlString);
            int count =0;
            Scanner input = new Scanner(url.openStream());
            while(input.hasNext()){
                String line = input.nextLine();
                count +=line.length();

            }
            System.out.println("The file is size: "+ count + "bytes");

        }
        catch (java.net.MalformedURLException ex){
            System.out.println(ex.getMessage());
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
