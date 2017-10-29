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
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ScanFile {

    final String folderPath = "C://Users//User//Documents//NetBeansProjects//239785_A2//src//main//java//com//stiw3054//_a2//test Files";

    public void ReadFile() throws FileNotFoundException {

        long totalLineCount = 0;
        final List<File> folderList = new LinkedList<>();
        folderList.add(new File(folderPath));

        while (!folderList.isEmpty()) {
            final File folder = folderList.remove(0);
            if (folder.isDirectory() && folder.exists()) {
                System.out.println("Scanning files in " + "'" + folder.getName() + "'" + " folder");
                final File[] fileList = folder.listFiles();
                for (final File file : fileList) {
                    if (file.isDirectory()) {
                        folderList.add(file);
                    } else if (file.getName().endsWith(".java")) {
                        long lineCount = 0;
                        final Scanner scanner = new Scanner(file);
                        while (scanner.hasNextLine()) {
                            scanner.nextLine();
                            lineCount++;
                        }

                        totalLineCount += lineCount;
                        final String lineCountString;

                        if (lineCount > 99999) {
                            lineCountString = "" + lineCount;
                        } else {
                            final String temp = ("     " + lineCount);
                            lineCountString = temp.substring(temp.length() - 5);
                        }
                        System.out.println("Total" + lineCountString + " lines in " + file.getName());
                    }
                }
            }
        }
        System.out.println("Scanning......");
        System.out.println("" + "Scan Complete for all files : " + totalLineCount + " lines total in all files");
    }

    

}

