/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stiw3054._a2;

/**
 *
 * @author User
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class ReadAllCourseInfo {

    public String path;

    public void ReadInfo() throws FileNotFoundException, IOException {
        File file = new File("C://Users//User//Documents//NetBeansProjects//239785_A2//src//main//java//com//stiw3054//_a2//test Files//MyThread1.java");
        File file2 = new File("C://Users//User//Documents//NetBeansProjects//239785_A2//src//main//java//com//stiw3054//_a2//test Files//MyThread2.java");

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(file);
            // Always wrap FileReader in BufferedReader.
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                //String a = folder.listFiles();
                System.out.println(" List All Comments in " + file.getName() + " : ");
                while (file.isFile()) {
                    while ((strLine = bufferedReader.readLine()) != null) {
                        if (strLine.startsWith("//")) {
                            String s = strLine;
                            System.out.println(s.substring(2));

                        }
                    }
                    System.out.println("\n");
                    bufferedReader.close();
                    // Always close files.
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file ");
        } catch (IOException ex) {
            System.out.println("Error reading file" + file.getName());
            // Or we could just do this: 
            // ex.printStackTrace();
        }

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader2 = new FileReader(file2);
            // Always wrap FileReader in BufferedReader.
            try (BufferedReader bufferedReader = new BufferedReader(fileReader2)) {
                String strLine;
                //String a = folder.listFiles();
                System.out.println(" List All Comments in " + file2.getName() + " : ");
                while (file2.isFile()) {
                    while ((strLine = bufferedReader.readLine()) != null) {
                        if (strLine.startsWith("//")) {
                            String s = strLine;
                            System.out.println(s.substring(2));

                        }
                    }
                    System.out.println("\n");
                    bufferedReader.close();
                    // Always close files.
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file ");
        } catch (IOException ex) {
            System.out.println("Error reading file " + file2.getName());
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
}
