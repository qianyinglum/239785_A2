/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stiw3054._a2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;


/**
 *
 * @author User
 */
public class CountComments {
static  File fileName = new File("C://Users//User//Documents//NetBeansProjects//239785_A2//src//main//java//com//stiw3054//_a2//test Files//MyThread1.java");
 static File fileName2 = new File("C://Users//User//Documents//NetBeansProjects//239785_A2//src//main//java//com//stiw3054//_a2//test Files//MyThread2.java");
    public void readComments1() {
        
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);
            // Always wrap FileReader in BufferedReader.
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                System.out.println("Course Information in  " + fileName.getName());
                while ((strLine = bufferedReader.readLine()) != null) {
                    String s = strLine;
                    if (strLine.contains("Semester")) {
                        System.out.println(s.substring(2));
                    }
                    if (strLine.contains("Course")) {

                        System.out.println(s.substring(2));
                    }
                    if (strLine.contains("Group")) {
                        System.out.println(s.substring(2));
                    }
                    if (strLine.contains("Task")) {
                        System.out.println(s.substring(2));
                    }
                    if (strLine.contains("Matrik")) {
                        System.out.println(s.substring(2));
                    }
                }
                bufferedReader.close();
                System.out.println("End ....");
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch (IOException ex) {

        }
    }

    public void readComments2() throws FileNotFoundException {
        //File fileName = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\239785_A2\\test filesMyThread2.java");
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName2);
            // Always wrap FileReader in BufferedReader.
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;

                System.out.println("Course Information in  " + fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {
                    String s = strLine;
                    if (strLine.contains("Semester")) {

                        System.out.println(s.substring(2));
                    }
                    if (strLine.contains("Course")) {

                        System.out.println(s.substring(2));
                    }
                    if (strLine.contains("Group")) {

                        System.out.println(s.substring(2));
                    }
                    if (strLine.contains("Task")) {

                        System.out.println(s.substring(2));
                    }
                    if (strLine.contains("Matrik")) {

                        System.out.println(s.substring(2));
                    }

                }
                int lines = 0;
                String line;

                //String line;
                int count = 0;
                while ((line = bufferedReader.readLine()) != null) {
                    if (strLine.contains("#")) {
                        System.out.println("Empty" + count);
                        //this is and empty line...
                    }
                    System.out.println("Empty" + count);
                }

                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }
    }

    public void blankLines() throws FileNotFoundException, IOException {
        //File fileName = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\239785_A2\\test files\\MyThread.java");
        FileReader fileReader = new FileReader(fileName);
        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        int count = 0;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.contains("//")) {
                count++;
                //this is and empty line...

            }

        }
        System.out.println("The comments in " + fileName.getName() + " is " + count + " lines.");

    }

    public void blankLines2() throws FileNotFoundException, IOException {
        //File fileName = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\239785_A2\\test files\\MyThread2.java");
        FileReader fileReader = new FileReader(fileName2);
        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        int count = 0;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.contains("//")) {
                count++;
                //this is and empty line...

            }

        }
        System.out.println("The comments in " + fileName2.getName() + " is " + count + " lines.");

    }

}
