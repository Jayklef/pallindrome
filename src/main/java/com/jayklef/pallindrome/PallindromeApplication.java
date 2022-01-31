package com.jayklef.pallindrome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PallindromeApplication {

    public static void main(String[] args) {

        String confam = "civic";
        String reverse = "";
        for (int i = confam.length()-1; i >= 0; i--){
            reverse += confam.charAt(i);
            System.out.println(reverse);
        }

        boolean pallindrome = true;
        for (int i = 0; i < confam.length(); i++){
            if (confam.charAt(i) != reverse.charAt(i)){
                pallindrome = false;
            }
        }
        if (pallindrome){
            System.out.println("It's Pallindrome");
        } else {
            System.out.println("It's not a Pallindrome");
        }
    }

}
