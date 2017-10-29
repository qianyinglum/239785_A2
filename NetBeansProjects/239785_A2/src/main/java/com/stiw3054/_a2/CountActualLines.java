/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stiw3054._a2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountActualLines {

    File file = new File("C://Users//User//Documents//NetBeansProjects//239785_A2//src//main//java//com//stiw3054//_a2//test Files//MyThread1.java");
    File file2 = new File("C://Users//User//Documents//NetBeansProjects//239785_A2//src//main//java//com//stiw3054//_a2//test Files//MyThread2.java");

    public void countActualLine() throws FileNotFoundException, IOException {
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        String line;

        // Initializing counters
        int countWord = 0;
        int sentenceCount = 0;
        int characterCount = 0;
        int paragraphCount = 1;
        int whitespaceCount = 0;

        // Reading line by line from the 
        // file until a null is returned
        while ((line = reader.readLine()) != null) {
            if (line.equals("")) {
                paragraphCount++;
            }
            if (!(line.equals(""))) {

                characterCount += line.length();

                // \\s+ is the space delimiter in java
                String[] wordList = line.split("\\s+");

                countWord += wordList.length;
                whitespaceCount += countWord - 1;

                // [!?.:]+ is the sentence delimiter in java
                String[] sentenceList = line.split("[!?.:]+");

                sentenceCount += sentenceList.length;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(file.getName()+" result:");
        System.out.println("Total word count = " + countWord);
        System.out.println("Total number of sentences = " + sentenceCount);
        System.out.println("Total number of characters = " + characterCount);
        System.out.println("Number of paragraphs = " + paragraphCount);
        System.out.println("Total number of whitespaces = " + whitespaceCount);

    }
public void countActualLine2() throws FileNotFoundException, IOException {
        FileInputStream fileStream = new FileInputStream(file2);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        String line;

        // Initializing counters
        int countWord = 0;
        int sentenceCount = 0;
        int characterCount = 0;
        int paragraphCount = 1;
        int whitespaceCount = 0;

        // Reading line by line from the 
        // file until a null is returned
        while ((line = reader.readLine()) != null) {
            if (line.equals("")) {
                paragraphCount++;
            }
            if (!(line.equals(""))) {

                characterCount += line.length();

                // \\s+ is the space delimiter in java
                String[] wordList = line.split("\\s+");

                countWord += wordList.length;
                whitespaceCount += countWord - 1;

                // [!?.:]+ is the sentence delimiter in java
                String[] sentenceList = line.split("[!?.:]+");

                sentenceCount += sentenceList.length;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(file2.getName()+" result:");
        System.out.println("Total word count = " + countWord);
        System.out.println("Total number of sentences = " + sentenceCount);
        System.out.println("Total number of characters = " + characterCount);
        System.out.println("Number of paragraphs = " + paragraphCount);
        System.out.println("Total number of whitespaces = " + whitespaceCount);

    }

}
